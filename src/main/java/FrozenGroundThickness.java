/**
 * REVISION HISTORY
 * =============================================================================
 * 1-24-2023 - Created class, default constructor, parameterized constructor,
 * private class members.
 */
public class FrozenGroundThickness extends DataPoint{
    private final double thicknessOfIce;

    public FrozenGroundThickness(){
        this("NONE", -999.0);
    }
    public FrozenGroundThickness(String attributes, double thicknessOfIce) {
        super(attributes);
        this.thicknessOfIce = thicknessOfIce;
    }

    public double getThicknessOfIce() {
        return thicknessOfIce;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Frozen Ground Thickness: %.1f",
                thicknessOfIce);
    }
}
