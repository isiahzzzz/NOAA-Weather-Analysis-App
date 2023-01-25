import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class UnitTests {
    /**
     * UnitTests for WeatherType objects.
     */
    @Test
    public void weatherTypeTests() {
        WeatherType testNorm = new WeatherType("test attrib", 1);
        WeatherType testNan = new WeatherType();
        assertEquals("Flags: test attrib Weather Type Recorded: 1",
                testNorm.toString());
        assertEquals("Flags: NONE Weather Type Recorded: -999",
                testNan.toString());
    }

    /**
     * Unit test for PeakWindSpeed objects.
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
     * Unit tests for FrozenGroundThickness
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
        TMAX testNorm = new TMAX("test attrib", 21);
        TMAX testNan = new TMAX();
        assertEquals("Flags: test attrib TMAX: 21", testNorm.toString());
        assertEquals("Flags: NONE TMAX: -999", testNan.toString());
    }

    /**
     * Unit test for TMIN
     */
    @Test
    public void tminTest() {
        TMIN testNorm = new TMIN("test attrib", 21);
        TMIN testNan = new TMIN();
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
     * Unit test for SnowFall
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
     * Unit test for SnowDepth
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
     * Unit test for Record
     */
    @Test
    public void recordTest() {
        Record testNorm =
                new Record(new StationData("Portland, ME",
                        new Date((2022 - 1900), 0, 25)),
                        new SnowDepth("N", 1),
                        new SnowFall("N", 1),
                        new AverageCloudiness("N", 1),
                        new TMIN("N", 2),
                        new TMAX("N", 2),
                        new FrozenGroundThickness("N", 2),
                        new AverageDailyWindSpeed("N", 2),
                        new PeakWindSpeed("N", 2),
                        new WeatherType("N", 2));
        System.out.println(testNorm);
        }

    /**
     * Unit test for StationData
     */
    @Test
    public void stationDataTest() {
        StationData testNorm = new StationData("Portland, ME",
                new Date(122, Calendar.JANUARY, 1));
        StationData testNan = new StationData();

        assertEquals("Station: Portland, ME Date: Sat Jan 01 00:00:00 EST 2022",
                testNorm.toString());
        assertEquals("Station: NONE Date: Wed Dec 31 18:59:59 EST 1969",
                testNan.toString());
    }
}

