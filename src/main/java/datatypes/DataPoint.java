package datatypes;

import java.util.Arrays;
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

    /**
     * For weather attribs
     * @param weatherAttribs array of weather attribs
     */
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
