
package ir.terminal724.www.terminal724.Show_Ticket.models;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightsNew implements Parcelable
{

    @SerializedName("flightCount")
    @Expose
    private Integer flightCount;
    @SerializedName("flightPriceMin")
    @Expose
    private Double flightPriceMin;
    @SerializedName("flightPriceMax")
    @Expose
    private Double flightPriceMax;
    @SerializedName("flights")
    @Expose
    private List<Flight> flights = null;
    @SerializedName("airlines")
    @Expose
    private List<Airline> airlines = null;
    @SerializedName("ticketClass")
    @Expose
    private List<TicketClas> ticketClass = null;
    @SerializedName("flightTime")
    @Expose
    private List<FlightTime> flightTime = null;
    @SerializedName("weekdays")
    @Expose
    private List<Weekday> weekdays = null;
    @SerializedName("earlyMorningPriceMin")
    @Expose
    private Object earlyMorningPriceMin;
    @SerializedName("morningPriceMin")
    @Expose
    private Double morningPriceMin;
    @SerializedName("afternoonPriceMin")
    @Expose
    private Double afternoonPriceMin;
    @SerializedName("eveningPriceMin")
    @Expose
    private Double eveningPriceMin;
    @SerializedName("charterPriceMin")
    @Expose
    private Double charterPriceMin;
    @SerializedName("systemPriceMin")
    @Expose
    private Double systemPriceMin;
    @SerializedName("flightDateNext")
    @Expose
    private String flightDateNext;
    @SerializedName("flightDatePrev")
    @Expose
    private String flightDatePrev;
    public final static Creator<FlightsNew> CREATOR = new Creator<FlightsNew>() {


        @SuppressWarnings({
            "unchecked"
        })
        public FlightsNew createFromParcel(Parcel in) {
            return new FlightsNew(in);
        }

        public FlightsNew[] newArray(int size) {
            return (new FlightsNew[size]);
        }

    }
    ;

    protected FlightsNew(Parcel in) {
        this.flightCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.flightPriceMin = ((Double) in.readValue((Double.class.getClassLoader())));
        this.flightPriceMax = ((Double) in.readValue((Double.class.getClassLoader())));
        in.readList(this.flights, (ir.terminal724.www.terminal724.Show_Ticket.models.Flight.class.getClassLoader()));
        in.readList(this.airlines, (ir.terminal724.www.terminal724.Show_Ticket.models.Airline.class.getClassLoader()));
        in.readList(this.ticketClass, (ir.terminal724.www.terminal724.Show_Ticket.models.TicketClas.class.getClassLoader()));
        in.readList(this.flightTime, (ir.terminal724.www.terminal724.Show_Ticket.models.FlightTime.class.getClassLoader()));
        in.readList(this.weekdays, (ir.terminal724.www.terminal724.Show_Ticket.models.Weekday.class.getClassLoader()));
        this.earlyMorningPriceMin = in.readValue((Object.class.getClassLoader()));
        this.morningPriceMin = ((Double) in.readValue((Double.class.getClassLoader())));
        this.afternoonPriceMin = ((Double) in.readValue((Double.class.getClassLoader())));
        this.eveningPriceMin = ((Double) in.readValue((Double.class.getClassLoader())));
        this.charterPriceMin = ((Double) in.readValue((Double.class.getClassLoader())));
        this.systemPriceMin = ((Double) in.readValue((Double.class.getClassLoader())));
        this.flightDateNext = ((String) in.readValue((String.class.getClassLoader())));
        this.flightDatePrev = ((String) in.readValue((String.class.getClassLoader())));
    }

    public FlightsNew() {
    }

    public Integer getFlightCount() {
        return flightCount;
    }

    public void setFlightCount(Integer flightCount) {
        this.flightCount = flightCount;
    }

    public FlightsNew withFlightCount(Integer flightCount) {
        this.flightCount = flightCount;
        return this;
    }

    public Double getFlightPriceMin() {
        return flightPriceMin;
    }

    public void setFlightPriceMin(Double flightPriceMin) {
        this.flightPriceMin = flightPriceMin;
    }

    public FlightsNew withFlightPriceMin(Double flightPriceMin) {
        this.flightPriceMin = flightPriceMin;
        return this;
    }

    public Double getFlightPriceMax() {
        return flightPriceMax;
    }

    public void setFlightPriceMax(Double flightPriceMax) {
        this.flightPriceMax = flightPriceMax;
    }

    public FlightsNew withFlightPriceMax(Double flightPriceMax) {
        this.flightPriceMax = flightPriceMax;
        return this;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public FlightsNew withFlights(List<Flight> flights) {
        this.flights = flights;
        return this;
    }

    public List<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<Airline> airlines) {
        this.airlines = airlines;
    }

    public FlightsNew withAirlines(List<Airline> airlines) {
        this.airlines = airlines;
        return this;
    }

    public List<TicketClas> getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(List<TicketClas> ticketClass) {
        this.ticketClass = ticketClass;
    }

    public FlightsNew withTicketClass(List<TicketClas> ticketClass) {
        this.ticketClass = ticketClass;
        return this;
    }

    public List<FlightTime> getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(List<FlightTime> flightTime) {
        this.flightTime = flightTime;
    }

    public FlightsNew withFlightTime(List<FlightTime> flightTime) {
        this.flightTime = flightTime;
        return this;
    }

    public List<Weekday> getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(List<Weekday> weekdays) {
        this.weekdays = weekdays;
    }

    public FlightsNew withWeekdays(List<Weekday> weekdays) {
        this.weekdays = weekdays;
        return this;
    }

    public Object getEarlyMorningPriceMin() {
        return earlyMorningPriceMin;
    }

    public void setEarlyMorningPriceMin(Object earlyMorningPriceMin) {
        this.earlyMorningPriceMin = earlyMorningPriceMin;
    }

    public FlightsNew withEarlyMorningPriceMin(Object earlyMorningPriceMin) {
        this.earlyMorningPriceMin = earlyMorningPriceMin;
        return this;
    }

    public Double getMorningPriceMin() {
        return morningPriceMin;
    }

    public void setMorningPriceMin(Double morningPriceMin) {
        this.morningPriceMin = morningPriceMin;
    }

    public FlightsNew withMorningPriceMin(Double morningPriceMin) {
        this.morningPriceMin = morningPriceMin;
        return this;
    }

    public Double getAfternoonPriceMin() {
        return afternoonPriceMin;
    }

    public void setAfternoonPriceMin(Double afternoonPriceMin) {
        this.afternoonPriceMin = afternoonPriceMin;
    }

    public FlightsNew withAfternoonPriceMin(Double afternoonPriceMin) {
        this.afternoonPriceMin = afternoonPriceMin;
        return this;
    }

    public Double getEveningPriceMin() {
        return eveningPriceMin;
    }

    public void setEveningPriceMin(Double eveningPriceMin) {
        this.eveningPriceMin = eveningPriceMin;
    }

    public FlightsNew withEveningPriceMin(Double eveningPriceMin) {
        this.eveningPriceMin = eveningPriceMin;
        return this;
    }

    public Double getCharterPriceMin() {
        return charterPriceMin;
    }

    public void setCharterPriceMin(Double charterPriceMin) {
        this.charterPriceMin = charterPriceMin;
    }

    public FlightsNew withCharterPriceMin(Double charterPriceMin) {
        this.charterPriceMin = charterPriceMin;
        return this;
    }

    public Double getSystemPriceMin() {
        return systemPriceMin;
    }

    public void setSystemPriceMin(Double systemPriceMin) {
        this.systemPriceMin = systemPriceMin;
    }

    public FlightsNew withSystemPriceMin(Double systemPriceMin) {
        this.systemPriceMin = systemPriceMin;
        return this;
    }

    public String getFlightDateNext() {
        return flightDateNext;
    }

    public void setFlightDateNext(String flightDateNext) {
        this.flightDateNext = flightDateNext;
    }

    public FlightsNew withFlightDateNext(String flightDateNext) {
        this.flightDateNext = flightDateNext;
        return this;
    }

    public String getFlightDatePrev() {
        return flightDatePrev;
    }

    public void setFlightDatePrev(String flightDatePrev) {
        this.flightDatePrev = flightDatePrev;
    }

    public FlightsNew withFlightDatePrev(String flightDatePrev) {
        this.flightDatePrev = flightDatePrev;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(flightCount);
        dest.writeValue(flightPriceMin);
        dest.writeValue(flightPriceMax);
        dest.writeList(flights);
        dest.writeList(airlines);
        dest.writeList(ticketClass);
        dest.writeList(flightTime);
        dest.writeList(weekdays);
        dest.writeValue(earlyMorningPriceMin);
        dest.writeValue(morningPriceMin);
        dest.writeValue(afternoonPriceMin);
        dest.writeValue(eveningPriceMin);
        dest.writeValue(charterPriceMin);
        dest.writeValue(systemPriceMin);
        dest.writeValue(flightDateNext);
        dest.writeValue(flightDatePrev);
    }

    public int describeContents() {
        return  0;
    }

}
