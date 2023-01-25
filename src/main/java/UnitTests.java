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
}
