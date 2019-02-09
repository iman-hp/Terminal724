
package ir.terminal724.www.terminal724.Show_Ticket.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TicketClas {

    @SerializedName("ticketClass")
    @Expose
    private String ticketClass;
    @SerializedName("ticketClassMinPrice")
    @Expose
    private Integer ticketClassMinPrice;
    @SerializedName("isChecked")
    @Expose
    private Boolean isChecked;

    public String getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(String ticketClass) {
        this.ticketClass = ticketClass;
    }

    public Integer getTicketClassMinPrice() {
        return ticketClassMinPrice;
    }

    public void setTicketClassMinPrice(Integer ticketClassMinPrice) {
        this.ticketClassMinPrice = ticketClassMinPrice;
    }

    public Boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Boolean isChecked) {
        this.isChecked = isChecked;
    }

}
