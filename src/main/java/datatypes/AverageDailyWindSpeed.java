package datatypes;
@Deprecated
// preparing for deletion. Unused class.
public class AverageDailyWindSpeed extends DataPoint {
    private final double avgWindSpeed;

    public AverageDailyWindSpeed() {
        this("NONE", -999);
    }
    public AverageDailyWindSpeed(String attribute, double avgWindSpeed) {
        super(attribute);
        this.avgWindSpeed = avgWindSpeed;
    }
    public double getAvgWindSpeed() {
        return avgWindSpeed;
    }
    @Override
    public String toString() {
        return super.toString() + String.format(" Average Wind Speed: %s",
                this.avgWindSpeed);
    }
}
