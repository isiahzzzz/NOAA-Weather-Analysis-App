/**
 * REVISION HISTORY
 * =============================================================================
 * 1-27-2023 - Added .trim to ParseInt within constructor to avoid unreadable
 * parsing values, will have to do that for array attribs at some point too.
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
                Integer.parseInt(weatherInVicinity.trim());
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
