/**
 * REVISION HISTORY
 * =============================================================================
 * 1-25-2023 - Created class, default constructor, parameterized constructor,
 * private class members.
 */
public class WeatherVicinity extends DataPoint{
    private final int weatherInVicinity;

    /**
     * Default Constructor
     */
    public WeatherVicinity() {
        this("NONE", "");
    }

    /**
     * Parameterized Constructor
     * @param attribs flags
     * @param weatherInVicinity weather signal
     */
    public WeatherVicinity(String attribs, String weatherInVicinity) {
        super(attribs);
        this.weatherInVicinity = weatherInVicinity.equals("") ? -999 :
                Integer.parseInt(weatherInVicinity);
    }

    public int getWeatherInVicinity() {
        return weatherInVicinity;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("Weather in Vicinity: %s",
                weatherInVicinity);
    }
}
