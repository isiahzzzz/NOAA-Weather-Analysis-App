/**
 * REVISION HISTORY
 * =============================================================================
 * 1-24-2023 - Created class, default constructor, parameterized constructor,
 * private class members.
 */
public class SnowDepth extends DataPoint {
    private final double snowDepth;

    public SnowDepth() {
        this("NONE", -999.0);
    }
    public SnowDepth(String attributes, double snowDepth) {
        super(attributes);
        this.snowDepth = snowDepth;
    }

    public double getSnowDepth() {
        return snowDepth;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Snow depth: %.1f",
                this.snowDepth);
    }
}
