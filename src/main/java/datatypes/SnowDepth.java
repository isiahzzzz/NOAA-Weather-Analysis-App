package datatypes;

public class SnowDepth extends DataPoint {
    private final double snowDepth;

    /**
     * Default Constructor
     */
    public SnowDepth() {
        this("NONE", -999.0);
    }

    /**
     * Parameterized Constructor
     * @param attributes flags
     * @param snowDepth String representation of snowDepth
     */
    public SnowDepth(String attributes, String snowDepth) {
        super(attributes);
        this.snowDepth = snowDepth.equals("") ? -999.0 :
                Double.parseDouble(snowDepth);
    }

    /**
     * Parameterized Constructor
     * @param attributes flags
     * @param snowDepth double representation of snowDepth
     */
    public SnowDepth(String attributes, double snowDepth) {
        super(attributes);
        this.snowDepth = snowDepth;
    }

    public double getSnowDepth() {
        return snowDepth;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Snow depth: %.1f",
                this.snowDepth);
    }
}
