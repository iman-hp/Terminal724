package ir.terminal724.www.terminal724.Service;

import java.util.ArrayList;
import java.util.List;

import ir.terminal724.www.terminal724.Search_City.Citys;
import ir.terminal724.www.terminal724.Show_Ticket.models.Flight;
import ir.terminal724.www.terminal724.Show_Ticket.models.FlightsNew;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface Endpoints {

    @FormUrlEncoded
    @POST("api/flights/getflights")
    Call<FlightsNew> showFlights (
//            @Header ("RequestVerificationToken" )String RequestVerificationToken,
                              @Field("currentPage") String currentPage,
                              @Field("source") String source,
                              @Field("dest") String dest,
                              @Field("stDate") String stDate,
                              @Field("withFilters") boolean withFilters,
                              @Field("sortable") String sortable);

    @GET("/api/flights/getAirports")
    Call<ArrayList<Citys>> getCities();







}
