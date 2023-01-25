/**
 * REVISION HISTORY
 * =============================================================================
 * 1-24-2023 - Created class, default constructor, parameterized constructor,
 * private class members.
 */
public class SnowFall extends DataPoint{
    private final double amntSnowed;

    public SnowFall() {
        this("NONE", -999.0);
    }
    public SnowFall(String attributes, double amntSnowed) {
        super(attributes);
        this.amntSnowed = amntSnowed;
    }

    public double getAmntSnowed() {
        return amntSnowed;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Cumulative Snowfall: %.1f",
                this.amntSnowed);
    }
}
