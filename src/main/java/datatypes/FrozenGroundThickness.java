package datatypes;

public class FrozenGroundThickness extends DataPoint{
    private final double thicknessOfIce;

    /**
     * Default Constructor
     */

    public FrozenGroundThickness(){
        this("NONE", -999.0);
    }

    /**
     * Parameterized Constructor
     * @param attributes flags
     * @param thicknessOfIce String representation of ice thickness
     */
    public FrozenGroundThickness(String attributes, String thicknessOfIce) {
        super(attributes);
        this.thicknessOfIce = thicknessOfIce.equals("") ? -999.0 :
                Double.parseDouble(thicknessOfIce);
    }

    /**
     * Parameterized Constructor
     * @param attributes flags
     * @param thicknessOfIce double representation of ice thickness
     */
    public FrozenGroundThickness(String attributes, double thicknessOfIce) {
        super(attributes);
        this.thicknessOfIce = thicknessOfIce;
    }

    public double getThicknessOfIce() {
        return thicknessOfIce;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Frozen Ground Thickness: %.1f",
                thicknessOfIce);
    }
}
