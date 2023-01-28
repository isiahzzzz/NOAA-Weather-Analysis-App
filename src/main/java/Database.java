import au.com.bytecode.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * REVISION HISTORY
 * 1-27-2023 - Finished CSVReader loop, tested and working, tested edge cases
 * -- still need to test more -- and wrote calculateDataFacts which
 * calculates generalized facts about the data being passed in.
 * 1-25-2023 - Created class, default constructor, parameterized constructor,
 * private class members.
 * 1-23-2023 - laid out class structure.
 */
public class Database {
    //todo: Will be the ArrayList of Records.
    private ArrayList<Record> dataSet;

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
        //todo: ADD NULL POINTER EXCEPTIONS FOR STATIONS
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
    public ArrayList<Record> getDataSet() {
        return dataSet;
    }
}
