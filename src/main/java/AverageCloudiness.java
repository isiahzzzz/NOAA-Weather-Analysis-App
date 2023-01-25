/**
 * REVISION HISTORY
 * =============================================================================
 * 1-24-2023 - Created class, default constructor, parameterized constructor,
 * private class members.
 */
public class AverageCloudiness extends DataPoint {
    private double avgCloudiness;

    /**
     * Default constructor
     */
    public AverageCloudiness() {
        this("NONE", -999.0);
    }

    /**
     * Parameterized Constructor
     * @param attributes Flags
     * @param avgCloudiness average cloud cover for day
     */
    public AverageCloudiness(String attributes, double avgCloudiness) {
        super(attributes);
        this.avgCloudiness = avgCloudiness;
    }

    public double getAvgCloudiness() {
        return avgCloudiness;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Average Cloudiness: %.1f",
                this.avgCloudiness);
    }
}
