package applicationcore;

import datatypes.*;
import datatypes.Record;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class UnitTests {
    /**
     * Application.UnitTests for Application.WeatherType objects.
     */
    @Test
    public void weatherTypeTests() {
        //Application.WeatherType testNorm = new Application.WeatherType("test attrib", 1);
        //Application.WeatherType testNan = new Application.WeatherType();
        //Application.WeatherType testNoFlag = new Application.WeatherType("", 1);
        //assertEquals("Flags: test attrib Weather Type Recorded: 1",
                //testNorm.toString());
        //assertEquals("Flags: N/A Weather Type Recorded: 1",
                //testNoFlag.toString());
    }

    /**
     * Unit test for Application.PeakWindSpeed objects.
     */
    @Test
    public void peakWindSpeedTests() {
        PeakWindSpeed testNorm = new PeakWindSpeed("test attrib", 21.2);
        PeakWindSpeed testNan = new PeakWindSpeed();
        assertEquals("Flags: test attrib Peak Wind Speed: 21.2",
                testNorm.toString());
        assertEquals("Flags: NONE Peak Wind Speed: -999.0", testNan.toString());
    }

    /**
     * Unit tests for AverageWindSpeed
     */
    @Test
    public void averageWindSpeedTest() {
        AverageDailyWindSpeed testNorm = new AverageDailyWindSpeed(
                "test attrib", 21.3);
        AverageDailyWindSpeed testNan = new AverageDailyWindSpeed();
        assertEquals("Flags: test attrib Average Wind Speed: 21.3",
                testNorm.toString());
        assertEquals("Flags: NONE Average Wind Speed: -999.0",
                testNan.toString());
    }

    /**
     * Unit tests for Application.FrozenGroundThickness
     */
    @Test
    public void frozenGroundThicknessTest() {
        FrozenGroundThickness testNorm = new FrozenGroundThickness(
                "test attrib", 22.1);
        FrozenGroundThickness testNan = new FrozenGroundThickness();
        assertEquals("Flags: test attrib Frozen Ground Thickness: 22.1",
                testNorm.toString());
        assertEquals("Flags: NONE Frozen Ground Thickness: -999.0",
                testNan.toString());
    }

    /**
     * Unit test for TMAX
     */
    @Test
    public void tmaxTest() {
        TMax testNorm = new TMax("test attrib", 21);
        TMax testNan = new TMax();
        assertEquals("Flags: test attrib TMAX: 21", testNorm.toString());
        assertEquals("Flags: NONE TMAX: -999", testNan.toString());
    }

    /**
     * Unit test for TMIN
     */
    @Test
    public void tminTest() {
        TMin testNorm = new TMin("test attrib", 21);
        TMin testNan = new TMin();
        assertEquals("Flags: test attrib TMIN: 21", testNorm.toString());
        assertEquals("Flags: NONE TMIN: -999", testNan.toString());
    }

    /**
     * Unit test for Average Cloudiness
     */
    @Test
    public void averageCloudinessTest() {
        AverageCloudiness testNorm = new AverageCloudiness("test attrib", 21);
        AverageCloudiness testNan = new AverageCloudiness();
        assertEquals("Flags: test attrib Average Cloudiness: 21.0",
                testNorm.toString());
        assertEquals("Flags: NONE Average Cloudiness: -999.0",
                testNan.toString());
    }

    /**
     * Unit test for Application.SnowFall
     */
    @Test
    public void snowFallTest() {
        SnowFall testNorm = new SnowFall("test attrib", 21);
        SnowFall testNan = new SnowFall();
        assertEquals("Flags: test attrib Cumulative Snowfall: 21.0",
                testNorm.toString());
        assertEquals("Flags: NONE Cumulative Snowfall: -999.0",
                testNan.toString());

    }

    /**
     * Unit test for Application.SnowDepth
     */
    @Test
    public void snowDepthTest() {
        SnowDepth testNorm = new SnowDepth("test attrib", 21);
        SnowDepth testNan = new SnowDepth();
        assertEquals("Flags: test attrib Snow depth: 21.0",
                testNorm.toString());
        assertEquals("Flags: NONE Snow depth: -999.0",
                testNan.toString());

    }

    /**
     * Unit test for Application.Record
     */
    //@Test
    /*public void recordTest() {
        Application.Record testNorm =
                new Application.Record(new Application.StationData("Portland, ME",
                        new Date((2022 - 1900), 0, 25)),
                        new Application.SnowDepth("N", 1),
                        new Application.SnowFall("N", 1),
                        new Application.AverageCloudiness("N", 1),
                        new TMIN("N", 2),
                        new TMAX("N", 2),
                        new Application.FrozenGroundThickness("N", 2),
                        new Application.AverageDailyWindSpeed("N", 2),
                        new Application.PeakWindSpeed("N", 2),
                        new Application.WeatherType("N", 2));
        System.out.println(testNorm);
        } */

    /**
     * Unit test for Application.StationData
     */
    //@Test
   /* public void stationDataTest() {
        Application.StationData testNorm = new Application.StationData("Portland, ME",
                new Date(122, Calendar.JANUARY, 1));
        Application.StationData testNan = new Application.StationData();

        assertEquals("Station: Portland, ME Date: Sat Jan 01 00:00:00 EST 2022",
                testNorm.toString());
        assertEquals("Station: NONE Date: Wed Dec 31 18:59:59 EST 1969",
                testNan.toString());
    } */
    /**
     * Test that checks continuity of mergeSort results against built in Java
     * sort algorithm.
     */
    @Test
    public void mergeSortTest() {
        Database data = new Database("D:\\Development\\NOAAWeatherApp\\PortlandWeatherData.csv", null);
        data.JUnitTest = true;
        int size = data.getDataArray().length;
        data.trimArrayForTest(size);
        Record[] array = data.getDataArray();
        Record[] control = data.getDataArray();
        Comparator<Record> cmp = new Record.CmpTMax();
        Arrays.sort(control, cmp);
        data.pickSorts(4, "tmax");
        assertEquals("Merge sort failed to create a fully ordered list", Arrays.compare(array, control), 0);
    }
}
