package ir.terminal724.www.terminal724.Show_Ticket.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RavisFlightRequest {


    @SerializedName("sortable")
    @Expose
    public String sortable;

    @SerializedName("source")
    @Expose
    public String source;

    @SerializedName("dest")
    @Expose
    public String dest;

//    @SerializedName("stDate")
//    @Expose
    public String stDate;

    @SerializedName("currentPage")
    @Expose
    public String currentPage;

    @SerializedName("withFilters")
    @Expose
    public boolean withFilters;

}
