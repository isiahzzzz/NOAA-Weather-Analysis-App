package datatypes;

public class TMin extends DataPoint{
    //smallest temp achieved in day
    private final int tmin;

    /**
     * Default Constructor
     */
    public TMin() {
        this("NONE", -999);
    }

    /**
     * Parameterized Constructor
     * @param attribute flags
     * @param tmin String representation of tmin value
     */
    public TMin(String attribute, String tmin) {
        super(attribute);
        this.tmin = tmin.equals("") ? -999 : Integer.parseInt(tmin);
    }

    /**
     * Parameterized Constructor
     * @param attribute flags
     * @param tmin int representation of tmin value
     */
    public TMin(String attribute, int tmin) {
        super(attribute);
        this.tmin = tmin;
    }

    public int getTmin() {
        return tmin;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("tMin: %d", tmin);
    }
}
