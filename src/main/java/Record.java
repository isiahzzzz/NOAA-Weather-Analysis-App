/**
 * REVISION HISTORY
 * =============================================================================
 * 1-27-2023 - added getters and setters, no further changes.
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

    public StationData getStation() {
        return station;
    }

    public SnowDepth getSnowDepth() {
        return snowDepth;
    }

    public SnowFall getSnowFall() {
        return snowFall;
    }

    public AverageCloudiness getAverageCloudiness() {
        return averageCloudiness;
    }

    public TMin getTmin() {
        return tmin;
    }

    public TMax getTmax() {
        return tmax;
    }

    public FrozenGroundThickness getFrozenGroundThickness() {
        return frozenGroundThickness;
    }

    public PeakWindSpeed getPeakWindSpeed() {
        return peakWindSpeed;
    }

    public WeatherType getWeatherType() {
        return weatherType;
    }

    public WeatherVicinity getWeatherVicinity() {
        return weatherVicinity;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                station, snowDepth, snowFall, averageCloudiness, tmin, tmax,
                frozenGroundThickness, peakWindSpeed,
                weatherType, weatherVicinity);
    }
}
