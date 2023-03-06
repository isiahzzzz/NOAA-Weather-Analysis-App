package datatypes;

/**
 * REVISION HISTORY
 * =============================================================================
 * 2-18-2023 - Isiah Castro - Changed print formatting to help with clarity.
 * 1-25-2023 - Added additional constructor to handle the parsing of String
 * to Double. Also added documentation.
 * 1-24-2023 - Created class, default constructor, parameterized constructor,
 * private class members.
 */
public class PeakWindSpeed extends DataPoint {
    private final double peakWindSpeed;

    /**
     * Default Constructor
     */
    public PeakWindSpeed() {
        this("NONE", -999);
    }

    /**
     * Parameterized Constructor
     * @param attribute flags
     * @param peakWindSpeed String representation of peak wind speed for day.
     */
    public PeakWindSpeed(String attribute, String peakWindSpeed) {
        super(attribute);
        this.peakWindSpeed = peakWindSpeed.equals("") ? -999 :
                Double.parseDouble(peakWindSpeed);
    }

    /**
     * Parameterized Constructor
     * @param attribute flags
     * @param peakWindSpeed double representation of peak wind speed for the
     *                      day.
     */
    public PeakWindSpeed(String attribute, double peakWindSpeed) {
        super(attribute);
        this.peakWindSpeed = peakWindSpeed;
    }

    public double getPeakWindSpeed() {
        return this.peakWindSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Peak Wind Speed: %.1f MPH",
                this.peakWindSpeed);
    }
}
