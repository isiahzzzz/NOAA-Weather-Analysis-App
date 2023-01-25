/**
 * REVISION HISTORY
 * =============================================================================
 * 1-25-2023 - Added additional constructor to handle String to Integer
 * parsing for tmax data.
 * 1-24-2023 - Created class, default constructor, parameterized constructor,
 * private class members.
 */
public class TMax extends DataPoint{
    private int tmax;

    public TMax() {
        this("NONE", -999);
    }
    public TMax(String attribute, String tmax) {
        super(attribute);
        this.tmax = tmax.equals("") ? -999 : Integer.parseInt(tmax);
    }
    public TMax(String attribute, int tmax) {
        super(attribute);
        this.tmax = tmax;
    }

    public int getTmax() {
        return tmax;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("tMax: %d", tmax);
    }
}
