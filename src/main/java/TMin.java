/**
 * REVISION HISTORY
 * =============================================================================
 * 1-25-2023 - Added additional constructor to handle the parsing of String
 * data to Integer. Also added documentation.
 * 1-24-2023 - Created class, default constructor, parameterized constructor,
 * private class members.
 */
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
