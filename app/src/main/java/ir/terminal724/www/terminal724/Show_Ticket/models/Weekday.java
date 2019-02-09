
package ir.terminal724.www.terminal724.Show_Ticket.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Weekday {

    @SerializedName("flag")
    @Expose
    private Boolean flag;
    @SerializedName("isActive")
    @Expose
    private Boolean isActive;
    @SerializedName("rooz")
    @Expose
    private String rooz;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("price")
    @Expose
    private Integer price;

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getRooz() {
        return rooz;
    }

    public void setRooz(String rooz) {
        this.rooz = rooz;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
