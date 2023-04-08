package datatypes;

import java.util.Arrays;

public class WeatherType extends DataPoint {
    // int value of weather type
    private String[] weatherTypes;

    //todo: array of string weather types.

    /**
     * Default constructor
     */
    public WeatherType(){
        this(null);
    }

    public WeatherType(String[] weatherTypesRecorded) {
        if(weatherTypesRecorded == null) {
            return;
        }
        String[] wTypes = new String[weatherTypesRecorded.length / 2];
        String[] attribs = new String[weatherTypesRecorded.length / 2];
        //temp arrays for weather types and attribs
        for(int i = 0; i < wTypes.length; i++) {
            wTypes[i] = weatherTypesRecorded[(i * 2)];
            attribs[i] = weatherTypesRecorded[(i * 2) + 1];
        }
        weatherAttribs = attribs;
        this.weatherTypes = wTypes;
    }

    /**
     * Formatted toString
     * @return formatted string that indicates in english what weather type
     * was recorded.
     */
    @Override
    public String toString() {
        //todo: translate weather type int to english
        return super.toString() + String.format(" Weather Types Recorded: %s",
                Arrays.toString(weatherTypes));
    }
}
