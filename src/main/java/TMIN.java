/**
 * REVISION HISTORY
 * =============================================================================
 * 1-24-2023 - Created class, default constructor, parameterized constructor,
 * private class members.
 */
public class TMIN extends DataPoint{
    private int tmin;

    public TMIN() {
        this("NONE", -999);
    }
    public TMIN(String attribute, int tmin) {
        super(attribute);
        this.tmin = tmin;
    }

    public int getTmin() {
        return tmin;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" TMIN: %d", tmin);
    }
}
