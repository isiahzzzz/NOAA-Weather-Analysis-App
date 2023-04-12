package applicationcore;

import datatypes.*;
import datatypes.Record;
import guipack.GUI;
import toolkit.Timer;

import au.com.bytecode.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Database extends Timer {
    // original list that's populated post file parse
    private ArrayList<Record> dataSet;
    // array that is used for sort performance recording
    private Record[] dataArray;
    private Record[] keepData;
    // gui singleton
    private final GUI guiInstance;
    //true when unit testing
    public boolean JUnitTest = false;
    private boolean runAllSorts = false;
    private String log = "";
    private String savedFileLocation = "";
    private final String[] sorts = {
            "Insertion Sort",
            "Dual-Pivot Quicksort",
            "Selection Sort",
            "Merge Sort"
    };
    private int currentSortKey;

    /**
     * Initializes database
     * @param fileName filename
     * @param gui GUI singleton
     */
    public Database(String fileName, GUI gui) {
        this.guiInstance = gui;
        try {
            CSVReader reader = new CSVReader(new FileReader(fileName));
            String[] temp;
            dataSet = new ArrayList<>();
            //throws away header
            reader.readNext();
            //first actual line
            temp = reader.readNext();
            this.savedFileLocation = fileName;
            System.out.print("PARSING");
            while(temp != null) {
                //creating station
                StationData s = new StationData(temp[0], temp[2]);
                //creating average cloudiness
                AverageCloudiness ac = new AverageCloudiness(temp[4], temp[3]);
                //creating Application.FrozenGroundThickness
                FrozenGroundThickness fg = new FrozenGroundThickness(temp[6],
                        temp[5]);
                //creating Application.SnowFall
                SnowFall sf = new SnowFall(temp[8], temp[7]);
                //creating Application.SnowDepth
                SnowDepth sd = new SnowDepth(temp[10], temp[9]);
                //creating Application.TMax
                TMax tMax = new TMax(temp[12], temp[11]);
                //creating Application.TMin
                TMin tMin = new TMin(temp[14], temp[13]);
                //creating Application.PeakWindSpeed
                PeakWindSpeed pws = new PeakWindSpeed(temp[16], temp[15]);
                //creating Application.WeatherType
                WeatherType wt = new WeatherType(Arrays.copyOfRange(temp,17,
                        54));
                //creating Application.WeatherVicinity
                WeatherVicinity wv = new WeatherVicinity(temp[56], temp[55]);
                //creating record obj
                Record rec = new Record(s, sd, sf, ac, tMin, tMax, fg, pws,
                        wt, wv);
                dataSet.add(rec);
                temp = reader.readNext();
            }
            dataArray = new Record[dataSet.size()];
            dataArray = dataSet.toArray(dataArray);
            keepData = new Record[dataSet.size()];
            System.arraycopy(dataArray, 0, this.keepData, 0, dataArray.length);
            if(!JUnitTest) {
                if (this.guiInstance == null) {
                    System.out.print("\r");
                    System.out.println("Success! Created database.");
                    System.out.println("==========GENERAL FACTS ABOUT DATA===========");
                    System.out.println(calculateDataFacts(fileName));
                    System.out.println("=============================================");
                    reader.close();
                } else {
                    guiInstance.setFileTextField(calculateDataFacts(fileName));
                }
            }

        } catch (FileNotFoundException e){
            System.err.println("Could not locate " + fileName);
            System.exit(2);
        } catch (IOException e) {
            System.err.println("CSVReader Error.");
            System.exit(3);
        } catch (NullPointerException e) {
            System.err.println("Tried to access non-existent data.");
            System.exit(4);
        }

    }


    /**
     * Calculates some statistics from datafile, could be more efficient.
     * Work still in progress
     * @param fileName datafile being read
     * @return formatted String of data.
     */
    private String calculateDataFacts(String fileName) {
        double weeks = Math.ceil((dataSet.size() + 1) / 7.0);
        double years = (dataSet.size() + 1) / 365.0;
        double totalSnowFallen = 0;
        double coldestTempRecorded = 0.0;
        Record coldestDay = null;
        double hottestTempRecorded = 0.0;
        Record hottestDay = null;
        //finds a bunch of different data, could be more efficient.
        for(Record rec : dataSet){
            totalSnowFallen += rec.getSnowFall().getAmntSnowed() == -999.0 ?
                    0.0 : rec.getSnowFall().getAmntSnowed();
            if(rec.getTmin().getTmin() < coldestTempRecorded){
                coldestTempRecorded = rec.getTmin().getTmin();
                coldestDay = rec;
            }
            if(rec.getTmax().getTmax() > hottestTempRecorded) {
                hottestTempRecorded = rec.getTmax().getTmax();
                hottestDay = rec;
            }
        }
        return String.format("%s contained data that ranged over %d days.%n" +
                "That means the data spans over %.0f weeks or %.2f years.%n" +
                        "Over this timespan, it snowed %.1f inches, or %.1f " +
                        "feet.%n" +
                        "The coldest temp recorded was %.1ff, and it occurred" +
                        " on %s%n" +
                        "The hottest temp recorded was %.1ff, and it occurred" +
                        " on %s%n" +
                        "That is a difference of %.1f degrees!",
                fileName.substring(fileName.lastIndexOf(":") + 2), dataSet.size() + 1, weeks, years, totalSnowFallen,
                totalSnowFallen / 12, coldestTempRecorded,
                coldestDay.getStation().getDate(), hottestTempRecorded,
                hottestDay.getStation().getDate(), hottestTempRecorded - coldestTempRecorded);
    }
    public Record[] getDataArray() {
        return dataArray;
    }
    public ArrayList<Record> getDataList() {
        return new ArrayList<>(Arrays.asList(dataArray));
    }
    public String getLog() {
        String temp = this.log;
        this.log = "";
        return temp;
    }
    public void setRunAllSorts(boolean v) {
        this.runAllSorts = v;
    }
    public String getSavedFileLocation() {
        return this.savedFileLocation;
    }

    /**
     * Method handles the initialization of sorting.
     * @param algorithm default 0 [development], greater than 0 otherwise.
     * @param param null default [development], sort parameter otherwise.
     */
    public void pickSorts(int algorithm, String param) {
        int key = algorithm;
        this.currentSortKey = key - 1;
        Sorts<Record> temp = new Sorts<>();
        Scanner sc = new Scanner(System.in);
        if(guiInstance == null) {
            if (!JUnitTest) {
                key = sortsSetter(sc);
                sc.nextLine();
            }
        }
        if (key == 1) {
            Comparator<Record> cmp = paramSetter(sc, param);
            startTimer();
            temp.insertionSort(cmp, dataArray);
            endTimer();
            initDump(((CmpCnt)cmp).getCmpCnt(), "O(n^2)");
            ((CmpCnt) cmp).resetCmpCnt();
        } else if (key == 2) {
            Comparator<Record> cmp = paramSetter(sc, param);
            startTimer();
            Arrays.sort(dataArray, cmp);
            endTimer();
            initDump(((CmpCnt)cmp).getCmpCnt(), "O(nlog(n))");
            ((CmpCnt) cmp).resetCmpCnt();
        } else if (key == 3){
            Comparator<Record> cmp = paramSetter(sc, param);
            startTimer();
            temp.selectionSort(cmp, dataArray);
            endTimer();
            initDump(((CmpCnt)cmp).getCmpCnt(), "O(n^2)");
            ((CmpCnt) cmp).resetCmpCnt();
        } else if (key == 4) {
            Comparator<Record> cmp = paramSetter(sc, param);
            startTimer();
            temp.mergeSort(dataArray, 0, dataArray.length - 1, cmp);
            endTimer();
            initDump(((CmpCnt)cmp).getCmpCnt(), "O(nlog(n))");
            ((CmpCnt) cmp).resetCmpCnt();
        } else {
            System.err.println("Invalid selection, please enter a valid " +
                    "number");
            pickSorts(0, null);
        }
    }

    /**
     * @param comparisons number of comparisons
     * @param complexity expected time complexity
     */
    private void initDump(int comparisons, String complexity){
        if(guiInstance == null) {
            System.out.println(dumpRunStats(comparisons, complexity));
        } else if (runAllSorts) {
            this.log += dumpRunStats(comparisons, complexity);
            System.arraycopy(this.keepData, 0, this.dataArray, 0, this.keepData.length);
        } else {
            guiInstance.setSortTextField(dumpRunStats(comparisons, complexity));
        }
    }

    /**
     * Prints statistics associated with a given sort
     * @param comparisons number of comparisons made
     * @param complexity worst-case time complexity of a given algorithm
     */
    private String dumpRunStats(int comparisons, String complexity) {
        StringBuilder sb = new StringBuilder();
        switch(complexity) {
            case "O(n^2)" -> {
                sb.append(this.sorts[this.currentSortKey].toUpperCase()).append(System.lineSeparator());
                sb.append(String.format("N: %d%n", dataArray.length));
                sb.append(String.format("ACTUAL TIME TAKEN: %d milliseconds%n",
                        getResult()));
                sb.append(String.format("NUMBER OF COMPARISONS MADE: %,d%n",
                        comparisons));
                sb.append(String.format("PROJECTED NUMBER OF COMPARISONS: %,.0f%n",
                        Math.pow(dataArray.length, 2)));
            }
            case "O(nlog(n))" -> {
                sb.append(this.sorts[this.currentSortKey].toUpperCase()).append(System.lineSeparator());
                sb.append(String.format("N: %d%n", dataArray.length));
                sb.append(String.format("ACTUAL TIME TAKEN: %d milliseconds%n",
                        getResult()));
                sb.append(String.format("NUMBER OF COMPARISONS MADE: %,d%n",
                        comparisons));
                sb.append(String.format("PROJECTED NUMBER OF COMPARISONS: %,.0f%n",
                        dataArray.length * Math.log(dataArray.length)));
            }
        }
        sb.append("===================================");
        sb.append(System.lineSeparator());
        return sb.toString();
    }

    /**
     * "Sets" our sort option
     * @param sc user-input
     * @return our sort type
     */
    private int sortsSetter(Scanner sc){
        System.out.println("SORTS MENU: (DEVELOPMENT)");
        System.out.println("[1] for insertion sort");
        System.out.println("[2] for dual-pivot");
        System.out.println("[3] selection sort");
        System.out.println("[4] merge sort");
        return sc.nextInt();
    }

    /**
     * "Sets" params for sorts.
     * @param sc user input
     * @param param attrib we are sorting by
     * @return Comparator Object to be sorted by
     */
    private Comparator<Record> paramSetter(Scanner sc, String param){
        String key;
        if ((guiInstance == null && !JUnitTest) || param == null) {
            System.out.println("[tmax] sort data by tmax");
            System.out.println("[tmin] sort data by tmin");
            System.out.println("[snow] sort data by snow depth");
            System.out.println("[wind] sort data by wind speeds");
            System.out.println("[date] sort data by date");
            key = sc.nextLine().trim().toLowerCase();
        } else {
            key = param.toLowerCase();
        }
        switch (key) {
            case "tmax" -> {
                System.out.println("Sorting by TMAX");
                return new Record.CmpTMax();
            }
            case "tmin" -> {
                System.out.println("Sorting by TMIN");
                return new Record.CmpTMin();
            }
            case "snow" -> {
                System.out.println("Sorting by SNOW");
                return new Record.CmpSnowFallHiLow();
            }
            case "wind" -> {
                System.out.println("Sorting by WIND");
                return new Record.CmpWindSpeed();
            }
            case "date" -> {
                System.out.println("Sorting by DATE");
                return new Record.CmpDate();
            }
            default ->
                System.err.println("Invalid selection, please enter a valid " +
                        "sort parameter");
        }
        return paramSetter(sc, param);
    }

    /**
     * Used to trim dataset for running tests on various data lengths.
     * @param size size that array will be trimmed to
     */
    public void trimArray(int size) {
        Record[] temp = new Record[size];
        System.arraycopy(dataArray, 0, temp, 0, size);
        dataArray = temp;
        keepData = temp;
    }

    /**
     * Embedded class that contains sorts
     * @param <E>
     */
    private static class Sorts<E> {
        /**
         * Insertion Sort
         * @param cmp Comparator
         * @param dataArray array to be modified
         */
        public void insertionSort(Comparator<Record> cmp, E[] dataArray) {
            for (int i = 1; i < dataArray.length; ++i) {
                E key = dataArray[i];
                int j = i - 1;
                while (j >= 0 && cmp.compare((Record) dataArray[j],
                        (Record) key) > 0) {
                    dataArray[j + 1] = dataArray[j];
                    j = j - 1;
                }
                dataArray[j + 1] = key;
            }
        }

        /**
         *  Selection Sort
         * @param cmp Comparator
         * @param dataArray array to be modified
         */
        public void selectionSort(Comparator<Record> cmp, E[] dataArray) {
            for (int i = 0; i < dataArray.length - 1; i++) {
                int index = i;
                for (int j = i + 1; j < dataArray.length; j++) {
                    if (cmp.compare((Record) dataArray[index],
                            (Record) dataArray[j])> 0) {
                        index = j;
                    }
                }
                Record smallerElement = (Record) dataArray[index];
                dataArray[index] = dataArray[i];
                dataArray[i] = (E) smallerElement;
            }
        }

        /**
         * Merge Sort
         * @param arr array of Records
         * @param l left index
         * @param r right index
         * @param cmp comparator
         */
        public void mergeSort(E[] arr, int l, int r, Comparator<Record> cmp) {
            if (l < r) {
                // Find the middle point
                int m = l + (r - l) / 2;

                // Sort first and second halves
                mergeSort(arr, l, m, cmp);
                mergeSort(arr, m + 1, r, cmp);

                // Merge the sorted halves
                merge(arr, l, m, r, cmp);
            }
        }

        /**
         * Recursive Merge
         * @param arr array of records
         * @param l left index
         * @param m middle index
         * @param r right index
         * @param cmp Comparator
         */
        private void merge (E[] arr, int l, int m, int r, Comparator<Record> cmp) {
            int n1 = m - l + 1;
            int n2 = r - m;

            E[] L = (E[]) new Record[n1];
            E[] R = (E[]) new Record[n2];

            for(int i = 0; i < n1; ++i) {
                L[i] = arr[l + i];
            }
            for(int j = 0; j < n2; ++j) {
                R[j] = arr[m + 1 + j];
            }
            int i = 0;
            int j = 0;
            int k = l;
            while(i < n1 && j < n2) {
                if(cmp.compare((Record) L[i], (Record) R[j]) <= 0){
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }
    }
}
