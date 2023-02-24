/**
 * REVISION HISTORY
 * 2-23-2023 - Huge overhaul to sort menu, made implementing new sorts far
 * more efficient. Tested and working!
 * 2-18-2023 - Implemented sort by wind speed.
 * 1-8-2023 - Added Record[] to enable usage of built-in Array.sorts
 * functionality.
 * 1-27-2023 - Finished CSVReader loop, tested and working, tested edge cases
 * -- still need to test more -- and wrote calculateDataFacts which
 * calculates generalized facts about the data being passed in.
 * 1-25-2023 - Created class, default constructor, parameterized constructor,
 * private class members.
 * 1-23-2023 - laid out class structure.
 */
import au.com.bytecode.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Database {
    //todo: Will be the ArrayList of Records.
    private ArrayList<Record> dataSet;
    private Record[] dataArray;
    private final String[] sorts = {"insertion", "selection"};

    /**
     * Initializes database
     * @param fileName filename
     */
    public Database(String fileName) {
        try {
            CSVReader reader = new CSVReader(new FileReader(fileName));
            String[] temp;
            dataSet = new ArrayList<>();
            //throws away header
            reader.readNext();
            //first actual line
            temp = reader.readNext();
            System.out.print("PARSING");
            while(temp != null) {
                //creating station
                StationData s = new StationData(temp[0], temp[2]);
                //creating average cloudiness
                AverageCloudiness ac = new AverageCloudiness(temp[4], temp[3]);
                //creating FrozenGroundThickness
                FrozenGroundThickness fg = new FrozenGroundThickness(temp[6],
                        temp[5]);
                //creating SnowFall
                SnowFall sf = new SnowFall(temp[8], temp[7]);
                //creating SnowDepth
                SnowDepth sd = new SnowDepth(temp[10], temp[9]);
                //creating TMax
                TMax tMax = new TMax(temp[12], temp[11]);
                //creating TMin
                TMin tMin = new TMin(temp[14], temp[13]);
                //creating PeakWindSpeed
                PeakWindSpeed pws = new PeakWindSpeed(temp[16], temp[15]);
                //creating WeatherType
                WeatherType wt = new WeatherType(Arrays.copyOfRange(temp,17,
                        54));
                //creating WeatherVicinity
                WeatherVicinity wv = new WeatherVicinity(temp[56], temp[55]);
                //creating record obj
                Record rec = new Record(s, sd, sf, ac, tMin, tMax, fg, pws,
                        wt, wv);
                dataSet.add(rec);
                temp = reader.readNext();
            }
            dataArray = new Record[dataSet.size()];
            dataArray = dataSet.toArray(dataArray);
            System.out.print("\r");
            System.out.println("Success! Created database.");
            System.out.println("==========GENERAL FACTS ABOUT DATA===========");
            System.out.println(calculateDataFacts(fileName));
            System.out.println("=============================================");

        } catch (FileNotFoundException e){
            System.err.println("Could not locate " + fileName);
            System.exit(2);
        } catch (IOException e) {
            System.err.println("CSVReader Error!");
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
                fileName, dataSet.size() + 1, weeks, years, totalSnowFallen,
                totalSnowFallen / 12, coldestTempRecorded,
                coldestDay.getStation().getDate(), hottestTempRecorded,
                hottestDay.getStation().getDate(), hottestTempRecorded - coldestTempRecorded);
    }
    public Record[] getDataSet() {
        return dataArray;
    }

    /**
     * Our menu for setting sort algorithm and sort param.
     */
    public void pickSorts() {
        long startTime = 0;
        long endTime = 0;
        Scanner sc = new Scanner(System.in);
        Sorts<Record> temp = new Sorts<>();
        String key = sortsSetter(sc);
        if(key.equals("insertion")){
            Comparator<Record> cmp = paramSetter(sc);
            startTime = System.nanoTime();
            temp.insertionSort(cmp, dataArray);
            endTime = System.nanoTime();
            assert cmp != null;
            dumpRunStats(endTime, startTime, ((CmpCnt)cmp).getCmpCnt(),
                    "O(n^2)");
            ((CmpCnt)cmp).resetCmpCnt();
        }
        if(key.equals("dual-pivot")){
            Comparator<Record> cmp = paramSetter(sc);
            startTime = System.nanoTime();
            Arrays.sort(dataArray, cmp);
            endTime = System.nanoTime();
            assert cmp != null;
            dumpRunStats(endTime, startTime, ((CmpCnt)cmp).getCmpCnt(),
                    "O(nlog(n))");
            ((CmpCnt)cmp).resetCmpCnt();
        }
    }

    private void dumpRunStats(long endTime, long startTime, int comparisons,
                              String complexity) {
        switch(complexity) {
            case "O(n^2)" -> {
                System.out.printf("ACTUAL TIME TAKEN: %d milliseconds%n",
                        (endTime - startTime) / 1000000);
                System.out.printf("NUMBER OF COMPARISONS MADE: %d%n",
                        comparisons);
                System.out.printf("PROJECTED NUMBER OF COMPARISONS: %.0f%n",
                        Math.pow(dataArray.length, 2));
            }
            case "O(nlog(n))" -> {
                System.out.printf("ACTUAL TIME TAKEN: %d milliseconds%n",
                        (endTime - startTime) / 1000000);
                System.out.printf("NUMBER OF COMPARISONS MADE: %d%n",
                        comparisons);
                System.out.printf("PROJECTED NUMBER OF COMPARISONS: %.0f%n",
                        dataArray.length * Math.log(dataArray.length));
            }
        }
    }

    /**
     * "Sets" our sort option
     * @param sc user-input
     * @return our sort type
     */
    private String sortsSetter(Scanner sc){
        System.out.println("SORTS MENU: (DEVELOPMENT)");
        System.out.println("\"dual-pivot\" for dual-pivot quick sort");
        System.out.println("\"insertion\" for insertion sort");
        System.out.println("\"selection\" for selection sort");
        return sc.nextLine();
    }

    /**
     * "Sets" params for sorts.
     * @param sc user input
     * @return Comparator Object to be sorted by
     */
    private Comparator<Record> paramSetter(Scanner sc){

        System.out.println("[tmax] sort data by tmax");
        System.out.println("[tmin] sort data by tmin");
        System.out.println("[snow] sort data by snow depth");
        System.out.println("[wind] sort data by wind speeds");
        System.out.println("[date] sort data by date");

        String key = sc.nextLine().trim().toLowerCase();
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
            default -> {
                return null;
            }
        }
    }

    private static class Sorts<E> {
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
    }
}
