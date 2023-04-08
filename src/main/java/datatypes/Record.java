package datatypes;

import java.util.Comparator;

public class Record implements Comparable<Record> {
    //private class members
    private final StationData station;
    private final SnowDepth snowDepth;
    private final SnowFall snowFall;
    private final AverageCloudiness averageCloudiness;
    private final TMin tmin;
    private final TMax tmax;
    private final FrozenGroundThickness frozenGroundThickness;
    //private final Application.AverageDailyWindSpeed averageDailyWindSpeed;
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

    public static class CmpTMax extends CmpCnt implements Comparator<Record>{
        /**
         * Sorts by Application.TMax temps, sorts highest to lowest
         * @param o1 the first object to be compared.
         * @param o2 the second object to be compared.
         * @return difference
         */
        @Override
        public int compare(Record o1, Record o2) {
            cmpCnt++;
            return o2.getTmax().getTmax() - o1.getTmax().getTmax();
        }
    }

    public static class CmpTMin extends CmpCnt implements Comparator<Record> {
        /**
         * Sorts by Application.TMin temps, orders lowest to highest
         * @param o1 the first object to be compared.
         * @param o2 the second object to be compared.
         * @return difference
         */
        @Override
        public int compare(Record o1, Record o2) {
            cmpCnt++;
            return o1.getTmin().getTmin() - o2.getTmin().getTmin();

        }
    }

    /**
     * todo: fix snow fall sort issues.
     */
    public static class CmpSnowFallHiLow extends CmpCnt implements Comparator<Record> {
        /**
         * Sorts by daily snowfall amounts, high to low.
         * @param o1 the first object to be compared.
         * @param o2 the second object to be compared.
         * @return difference
         */
        public int compare(Record o1, Record o2){
            cmpCnt++;
            return (int) (o2.getSnowFall().getAmntSnowed() - o1.getSnowFall().getAmntSnowed());
        }
    }

    public static class CmpDate extends CmpCnt implements Comparator<Record> {
        /**
         * Sorts objects by Date object.
         * @param o1 the first object to be compared.
         * @param o2 the second object to be compared.
         * @return date difference
         */
        @Override
        public int compare(Record o1, Record o2) {
            cmpCnt++;
            return o1.getStation().getDateObject().compareTo(o2.getStation().getDateObject());
        }
    }

    public static class CmpWindSpeed extends  CmpCnt implements Comparator<Record> {
        /**
         * Sorts by daily peak wind speed, high to low.
         * @param o1 the first object to be compared.
         * @param o2 the second object to be compared.
         * @return difference
         */
        public int compare(Record o1,Record o2) {
            cmpCnt++;
            return (int) (o2.getPeakWindSpeed().getPeakWindSpeed() - o1.getPeakWindSpeed().getPeakWindSpeed());
        }
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                station, snowDepth, snowFall, averageCloudiness, tmin, tmax,
                frozenGroundThickness, peakWindSpeed,
                weatherType, weatherVicinity);
    }

    /**
     * Sorts by date by default
     * @param that the object to be compared.
     * @return positive, negative or 0
     */
    @Override
    public int compareTo(Record that) {
        if (this.station.getDateObject().compareTo(that.station.getDateObject()) > 0) {
            return 1;
        } else if(this.station.getDateObject().compareTo(that.station.getDateObject()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
