import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * REVISION HISTORY
 * =============================================================================
 * 1-24-2023 - Created class, default constructor, parameterized constructor,
 * private class members.
 */
public abstract class DataPoint {
    // general flags
    protected String attributes;

    protected String[] weatherAttribs;

    /**
     * Default constructor
     */
    protected DataPoint() {
        this("NONE ASSIGNED");
    }

    /**
     * Parameterized Constructor
     * @param attributes data flags
     */
    protected DataPoint(String attributes) {
        this.attributes = attributes;
    }

    protected DataPoint(String[] weatherAttribs) {
        this.weatherAttribs = weatherAttribs;
    }

    public String toString() {
        if(weatherAttribs == null) {
            return attributes.equals("") ? "" : String.format("Flags: %s ",
                    attributes);
        } else {
            return String.format("Weather flags: %s",
                    Arrays.toString(weatherAttribs));
        }
    }
}
