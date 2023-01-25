/**
 * REVISION HISTORY
 * =============================================================================
 * 1-25-2023 - Created class, default constructor, parameterized constructor,
 * private class members.
 */
public class Record {
    //private class members
    private final StationData station;
    private final SnowDepth snowDepth;
    private final SnowFall snowFall;
    private final AverageCloudiness averageCloudiness;
    private final TMin tmin;
    private final TMax tmax;
    private final FrozenGroundThickness frozenGroundThickness;
    //private final AverageDailyWindSpeed averageDailyWindSpeed;
    private final PeakWindSpeed peakWindSpeed;
    private final WeatherType weatherType;
    private final WeatherVicinity weatherVicinity;

    public Record(StationData station, SnowDepth snowDepth, SnowFall snowFall,
                  AverageCloudiness averageCloudiness, TMin tmin, TMax tmax,
                  FrozenGroundThickness frozenGroundThickness,
                  PeakWindSpeed peakWindSpeed, WeatherType weatherType,
                  WeatherVicinity weatherVicinity) {
        this.station = station;
        this.snowDepth = snowDepth;
        this.snowFall = snowFall;
        this.averageCloudiness = averageCloudiness;
        this.tmin = tmin;
        this.tmax = tmax;
        this.frozenGroundThickness = frozenGroundThickness;
        this.peakWindSpeed = peakWindSpeed;
        this.weatherType = weatherType;
        this.weatherVicinity = weatherVicinity;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                station, snowDepth, snowFall, averageCloudiness, tmin, tmax,
                frozenGroundThickness, peakWindSpeed,
                weatherType, weatherVicinity);
    }
}
