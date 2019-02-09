
package ir.terminal724.www.terminal724.Show_Ticket.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Airline {

    @SerializedName("airline")
    @Expose
    private String airline;
    @SerializedName("airlineIataCode")
    @Expose
    private String airlineIataCode;
    @SerializedName("airlineMinPrice")
    @Expose
    private Integer airlineMinPrice;
    @SerializedName("isChecked")
    @Expose
    private Boolean isChecked;

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getAirlineIataCode() {
        return airlineIataCode;
    }

    public void setAirlineIataCode(String airlineIataCode) {
        this.airlineIataCode = airlineIataCode;
    }

    public Integer getAirlineMinPrice() {
        return airlineMinPrice;
    }

    public void setAirlineMinPrice(Integer airlineMinPrice) {
        this.airlineMinPrice = airlineMinPrice;
    }

    public Boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Boolean isChecked) {
        this.isChecked = isChecked;
    }

}
