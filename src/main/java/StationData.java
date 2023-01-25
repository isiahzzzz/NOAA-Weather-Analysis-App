/**
 * REVISION HISTORY
 * =============================================================================
 * 1-25-2023 - Created class, default constructor, parameterized constructor,
 * private class members.
 */
import java.util.Date;

public class StationData {
    //station name
    private final String station;
    //date of record
    private final Date date;

    public StationData() {
        this("NONE", new Date(-1));
    }

    /**
     * Parameterized Constructor
     * @param station station name
     * @param date date of record
     */
    public StationData(String station, Date date) {
        this.station = station;
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("Station: %s Date: %s", station, date.toString());
    }

    public static void main(String[] args) {
        StationData a = new StationData("Portland, ME", new Date(-1));
    }
}
