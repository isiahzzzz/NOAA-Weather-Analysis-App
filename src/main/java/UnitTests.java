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
}
