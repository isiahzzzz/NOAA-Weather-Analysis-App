/**
 * REVISION HISTORY
 * =============================================================================
 * 1-24-2023 - Created class, default constructor, parameterized constructor,
 * private class members.
 */
public class TMAX extends DataPoint{
    private int tmax;

    public TMAX() {
        this("NONE", -999);
    }
    public TMAX(String attribute, int tmax) {
        super(attribute);
        this.tmax = tmax;
    }

    public int getTmax() {
        return tmax;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" TMAX: %d", tmax);
    }
}
