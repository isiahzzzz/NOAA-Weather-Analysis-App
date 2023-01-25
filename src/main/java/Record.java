public class Record {
    //private class members
    private final SnowDepth snowDepth;
    private final SnowFall snowFall;
    private final AverageCloudiness averageCloudiness;
    private final TMIN tmin;
    private final TMAX tmax;
    private final FrozenGroundThickness frozenGroundThickness;
    private final AverageDailyWindSpeed averageDailyWindSpeed;
    private final PeakWindSpeed peakWindSpeed;
    private final WeatherType weatherType;

    public Record(SnowDepth snowDepth, SnowFall snowFall,
                  AverageCloudiness averageCloudiness, TMIN tmin, TMAX tmax,
                  FrozenGroundThickness frozenGroundThickness,
                  AverageDailyWindSpeed averageDailyWindSpeed,
                  PeakWindSpeed peakWindSpeed, WeatherType weatherType) {
        this.snowDepth = snowDepth;
        this.snowFall = snowFall;
        this.averageCloudiness = averageCloudiness;
        this.tmin = tmin;
        this.tmax = tmax;
        this.frozenGroundThickness = frozenGroundThickness;
        this.averageDailyWindSpeed = averageDailyWindSpeed;
        this.peakWindSpeed = peakWindSpeed;
        this.weatherType = weatherType;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s %s %s",
                snowDepth, snowFall, averageCloudiness, tmin, tmax,
                frozenGroundThickness, averageDailyWindSpeed, peakWindSpeed,
                weatherType);
    }
}
