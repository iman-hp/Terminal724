
package ir.terminal724.www.terminal724.Show_Ticket.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetMobile {

    @SerializedName("flightCount")
    @Expose
    private Integer flightCount;
    @SerializedName("flightPriceMin")
    @Expose
    private Integer flightPriceMin;
    @SerializedName("flightPriceMax")
    @Expose
    private Integer flightPriceMax;
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
    private Integer morningPriceMin;
    @SerializedName("afternoonPriceMin")
    @Expose
    private Integer afternoonPriceMin;
    @SerializedName("eveningPriceMin")
    @Expose
    private Integer eveningPriceMin;
    @SerializedName("charterPriceMin")
    @Expose
    private Integer charterPriceMin;
    @SerializedName("systemPriceMin")
    @Expose
    private Integer systemPriceMin;
    @SerializedName("flightDateNext")
    @Expose
    private String flightDateNext;
    @SerializedName("flightDatePrev")
    @Expose
    private String flightDatePrev;

    public Integer getFlightCount() {
        return flightCount;
    }

    public void setFlightCount(Integer flightCount) {
        this.flightCount = flightCount;
    }

    public Integer getFlightPriceMin() {
        return flightPriceMin;
    }

    public void setFlightPriceMin(Integer flightPriceMin) {
        this.flightPriceMin = flightPriceMin;
    }

    public Integer getFlightPriceMax() {
        return flightPriceMax;
    }

    public void setFlightPriceMax(Integer flightPriceMax) {
        this.flightPriceMax = flightPriceMax;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<Airline> airlines) {
        this.airlines = airlines;
    }

    public List<TicketClas> getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(List<TicketClas> ticketClass) {
        this.ticketClass = ticketClass;
    }

    public List<FlightTime> getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(List<FlightTime> flightTime) {
        this.flightTime = flightTime;
    }

    public List<Weekday> getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(List<Weekday> weekdays) {
        this.weekdays = weekdays;
    }

    public Object getEarlyMorningPriceMin() {
        return earlyMorningPriceMin;
    }

    public void setEarlyMorningPriceMin(Object earlyMorningPriceMin) {
        this.earlyMorningPriceMin = earlyMorningPriceMin;
    }

    public Integer getMorningPriceMin() {
        return morningPriceMin;
    }

    public void setMorningPriceMin(Integer morningPriceMin) {
        this.morningPriceMin = morningPriceMin;
    }

    public Integer getAfternoonPriceMin() {
        return afternoonPriceMin;
    }

    public void setAfternoonPriceMin(Integer afternoonPriceMin) {
        this.afternoonPriceMin = afternoonPriceMin;
    }

    public Integer getEveningPriceMin() {
        return eveningPriceMin;
    }

    public void setEveningPriceMin(Integer eveningPriceMin) {
        this.eveningPriceMin = eveningPriceMin;
    }

    public Integer getCharterPriceMin() {
        return charterPriceMin;
    }

    public void setCharterPriceMin(Integer charterPriceMin) {
        this.charterPriceMin = charterPriceMin;
    }

    public Integer getSystemPriceMin() {
        return systemPriceMin;
    }

    public void setSystemPriceMin(Integer systemPriceMin) {
        this.systemPriceMin = systemPriceMin;
    }

    public String getFlightDateNext() {
        return flightDateNext;
    }

    public void setFlightDateNext(String flightDateNext) {
        this.flightDateNext = flightDateNext;
    }

    public String getFlightDatePrev() {
        return flightDatePrev;
    }

    public void setFlightDatePrev(String flightDatePrev) {
        this.flightDatePrev = flightDatePrev;
    }

}
