package ir.terminal724.www.terminal724.Show_Ticket.MVP;

import java.util.List;

import ir.terminal724.www.terminal724.Show_Ticket.models.Flight;

import ir.terminal724.www.terminal724.Show_Ticket.models.RavisFlightRequest;
import ir.terminal724.www.terminal724.Show_Ticket.models.Weekday;

public class ST_Presenter implements ST_Contract.Presenter {
    private ST_Contract.View view;
    ST_Model model = new ST_Model();

    @Override
    public void attachView(ST_Contract.View v) {
        this.view = v;
        model.attachPresenter(this);
    }

    @Override
    public void setData(List<Flight> flight, List<Weekday> weekdays) {
        view.setData(flight, weekdays);
    }



    @Override
    public void fail() {
        view.fail();
    }


    @Override
    public void Error(Throwable r) {
        view.Error(r);
    }

    @Override
    public void getParam(RavisFlightRequest values) {
        model.getParam(values);
    }



}
