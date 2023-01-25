import org.junit.Test;

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

    @Test
    public void averageWindSpeedTest() {
        AverageDailyWindSpeed testNorm = new AverageDailyWindSpeed(
                "test attrib", 21.3);
        AverageDailyWindSpeed testNan = new AverageDailyWindSpeed();
    }
}
