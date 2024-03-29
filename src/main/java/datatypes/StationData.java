package datatypes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StationData {
    //station name
    private final String station;
    //date of record
    private final Date date;

    public StationData() {
        this("NONE", "");
    }

    /**
     * Parameterized Constructor
     * @param station station name
     * @param date date literal
     */
    public StationData(String station, Date date) {
        this.station = station;
        this.date = date;
    }

    /**
     * Parameterized Constructor
     * @param station station name
     * @param date String representation of date
     */
    public StationData(String station, String date) {
        this.station = station;
        this.date = date.equals("") ? new Date(0,0,0) :
                new Date((Integer.parseInt(date.substring(0,4)) - 1900),
                Integer.parseInt(date.substring(5,7)) - 1,
                Integer.parseInt(date.substring(8)));

    }

    /**
     * Accessor for station
     * @return String representation of the Station
     */
    public String getStation() {
        return station;
    }

    /**
     * Date Accessor
     * @return String representation of the date
     */
    public String getDate() {
        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
            return formatter.format(date);
    }

    public Date getDateObject() {
        return this.date;
    }

    @Override
    public String toString() {
        return String.format("Station: %s Date: %s", station, date.toString());
    }
}
