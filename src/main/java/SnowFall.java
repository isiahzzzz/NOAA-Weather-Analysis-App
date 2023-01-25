/**
 * REVISION HISTORY
 * =============================================================================
 * 1-25-2023 - Added another constructor that takes a String and parses to
 * Double. Also added comments.
 * 1-24-2023 - Created class, default constructor, parameterized constructor,
 * private class members.
 */
public class SnowFall extends DataPoint{
    private final double amntSnowed;

    /**
     * Default Constructor
     */
    public SnowFall() {
        this("NONE", -999.0);
    }

    /**
     * Parameterized Constructor
     * @param attributes flags
     * @param amntSnowed String representation of amount snowed in a day
     */
    public SnowFall(String attributes, String amntSnowed) {
        super(attributes);
        this.amntSnowed = amntSnowed.equals("") ? -999.0 :
                Double.parseDouble(amntSnowed);
    }

    /**
     * Parameterized Constructor
     * @param attributes flags
     * @param amntSnowed double representation of amount snowed in a day
     */
    public SnowFall(String attributes, double amntSnowed) {
        super(attributes);
        this.amntSnowed = amntSnowed;
    }

    public double getAmntSnowed() {
        return amntSnowed;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Cumulative Snowfall: %.1f",
                this.amntSnowed);
    }
}
