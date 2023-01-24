import org.junit.Test;

import static org.junit.Assert.*;

/**
 * REVISION HISTORY
 * =============================================================================
 * 1-24-2023 - Created class, default constructor, parameterized constructor,
 * private class members.
 */
public class WeatherType extends DataPoint {
    private final int weatherTypeRecorded;

    public WeatherType(){
        this("NONE", -999);
    }
    public WeatherType(String attribute, int weatherTypeRecorded){
        super(attribute);
        this.weatherTypeRecorded = weatherTypeRecorded;
    }

    /**
     * Formatted toString
     * @return formatted string that indicates in english what weather type
     * was recorded.
     */
    public String toString() {
        //todo: translate weather type int to english
        return super.toString() + String.format(" Weather Type Recorded: %s",
                this.weatherTypeRecorded);
    }
}
