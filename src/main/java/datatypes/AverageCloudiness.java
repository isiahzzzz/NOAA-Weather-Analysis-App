package datatypes;

public class AverageCloudiness extends DataPoint {
    private final double avgCloudiness;

    /**
     * Default constructor
     */
    public AverageCloudiness() {
        this("NULL", -999.0);
    }
    public AverageCloudiness(String attributes, String avgCloudiness){
        super(attributes);
        this.avgCloudiness = avgCloudiness.equals("") ? -999.0 :
                Double.parseDouble(avgCloudiness);
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
        return super.toString() + String.format("Average Cloudiness: %.1f",
                this.avgCloudiness);
    }
}
