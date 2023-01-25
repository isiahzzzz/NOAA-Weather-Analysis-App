/**
 * REVISION HISTORY
 * =============================================================================
 * 1-24-2023 - Created class, default constructor, parameterized constructor,
 * private class members.
 */
public class PeakWindSpeed extends DataPoint{
    private final double peakWindSpeed;
    public PeakWindSpeed() {
        this("NONE", -999);
    }
    public PeakWindSpeed(String attribute, double peakWindSpeed){
        super(attribute);
        this.peakWindSpeed = peakWindSpeed;
    }
    public double getPeakWindSpeed() {
        return this.peakWindSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Peak Wind Speed: %.1f",
                this.peakWindSpeed);
    }
}
