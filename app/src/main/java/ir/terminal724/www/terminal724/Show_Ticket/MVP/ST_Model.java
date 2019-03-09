package ir.terminal724.www.terminal724.Show_Ticket.MVP;

import java.util.List;

import ir.terminal724.www.terminal724.Public.Constants;
import ir.terminal724.www.terminal724.Show_Ticket.models.Flight;
import ir.terminal724.www.terminal724.Show_Ticket.models.FlightsNew;
import ir.terminal724.www.terminal724.Show_Ticket.models.RavisFlightRequest;
import ir.terminal724.www.terminal724.Show_Ticket.models.Weekday;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ST_Model implements ST_Contract.Model {
    private ST_Presenter presenter;

    @Override
    public void attachPresenter(ST_Presenter p) {
        this.presenter = p;
    }

    @Override
    public void getParam(RavisFlightRequest values) {
        Constants.endpoints.showFlights(
//                Constants.token,
                values.currentPage,
                values.source,
                values.dest,
                values.stDate,
                values.withFilters,
                values.sortable).enqueue(new Callback<FlightsNew>() {
            @Override
            public void onResponse(Call<FlightsNew> call, Response<FlightsNew> response) {
                if (response.code() == 200) {
                    if (response.body()==null || response.body().getFlights().isEmpty()){
                      presenter.fail();
                    }else {
                        List<Flight> flights = response.body().getFlights();
                        List<Weekday> weekdays = response.body().getWeekdays();
                        presenter.setData(flights, weekdays);
                    }

                } else {
                    presenter.fail();
                }

            }

            @Override
            public void onFailure(Call<FlightsNew> call, Throwable t) {
                presenter.Error(t);
            }
        });


    }



}