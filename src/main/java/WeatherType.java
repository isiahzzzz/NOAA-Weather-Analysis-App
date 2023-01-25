/**
 * REVISION HISTORY
 * =============================================================================
 * 1-24-2023 - Created class, default constructor, parameterized constructor,
 * private class members.
 */
public class WeatherType extends DataPoint {
    // int value of weather type
    private final int weatherTypeRecorded;
    //todo: array of string weather types.

    /**
     * Default constructor
     */
    public WeatherType(){
        this("NONE", -999);
    }

    /**
     * Parameterized constructor
     * @param attribute record flag
     * @param weatherTypeRecorded int value of weather type recorded
     */
    public WeatherType(String attribute, int weatherTypeRecorded){
        super(attribute);
        this.weatherTypeRecorded = weatherTypeRecorded;
    }

    /**
     * Formatted toString
     * @return formatted string that indicates in english what weather type
     * was recorded.
     */
    @Override
    public String toString() {
        //todo: translate weather type int to english
        return super.toString() + String.format(" Weather Type Recorded: %s",
                this.weatherTypeRecorded);
    }
}
