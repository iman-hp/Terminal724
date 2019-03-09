package ir.terminal724.www.terminal724.Show_Ticket.MVP;

import java.util.List;

import ir.terminal724.www.terminal724.Show_Ticket.models.Flight;
import ir.terminal724.www.terminal724.Show_Ticket.models.RavisFlightRequest;
import ir.terminal724.www.terminal724.Show_Ticket.models.Weekday;

public interface ST_Contract {
    interface View {
        void setData(List<Flight> flight, List<Weekday> weekdays);

        void Error(Throwable r);

        void fail();
    }

    interface Presenter {
        void attachView(View v);

        void setData(List<Flight> flight, List<Weekday> weekdays);


        void fail();

        void Error(Throwable r);

        void getParam(RavisFlightRequest values);



    }

    interface Model {
        void attachPresenter(ST_Presenter p);
        void getParam(RavisFlightRequest values);




    }
}

