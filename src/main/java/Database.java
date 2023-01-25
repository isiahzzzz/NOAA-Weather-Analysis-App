import au.com.bytecode.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
/**
 * REVISION HISTORY
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
            //todo: finish scanning once record object is complete
            CSVReader reader = new CSVReader(new FileReader(fileName));
            String[] data;
            String[] temp;
            dataSet = new ArrayList<>();
            data = reader.readNext();
            temp = reader.readNext();
            int k = 0;
            while(k < 20) {
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
                k++;
            }
            for(Record rec : dataSet){
                System.out.println(rec);
            }
        } catch (FileNotFoundException e){
            System.err.println("Could not locate " + fileName);
            System.exit(2);
        } catch (IOException e) {
            System.err.println("CSVReader Error!");
            System.exit(3);
        }
    }
}
