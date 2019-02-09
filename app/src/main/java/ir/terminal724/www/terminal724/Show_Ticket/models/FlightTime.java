
package ir.terminal724.www.terminal724.Show_Ticket.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightTime {

    @SerializedName("isSystem")
    @Expose
    private Boolean isSystem;
    @SerializedName("flightTime")
    @Expose
    private String flightTime;
    @SerializedName("flightTimeMinPrice")
    @Expose
    private Integer flightTimeMinPrice;
    @SerializedName("flightTimeMaxPrice")
    @Expose
    private Integer flightTimeMaxPrice;

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public Integer getFlightTimeMinPrice() {
        return flightTimeMinPrice;
    }

    public void setFlightTimeMinPrice(Integer flightTimeMinPrice) {
        this.flightTimeMinPrice = flightTimeMinPrice;
    }

    public Integer getFlightTimeMaxPrice() {
        return flightTimeMaxPrice;
    }

    public void setFlightTimeMaxPrice(Integer flightTimeMaxPrice) {
        this.flightTimeMaxPrice = flightTimeMaxPrice;
    }

}
