package datatypes;

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
