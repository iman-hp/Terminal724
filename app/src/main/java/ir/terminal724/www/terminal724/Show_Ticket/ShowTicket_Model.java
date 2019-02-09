package ir.terminal724.www.terminal724.Show_Ticket;

public class ShowTicket_Model {
    String airline;
    String flight_number;
    String flight_time;
    String seat;
    String flight_class;
    String flight_price;
    int airline_logo;

    public ShowTicket_Model(String airline, String flight_number, String flight_time, String seat, String flight_class, String flight_price, int airline_logo) {
        this.airline = airline;
        this.flight_number = flight_number;
        this.flight_time = flight_time;
        this.seat = seat;
        this.flight_class = flight_class;
        this.flight_price = flight_price;
        this.airline_logo = airline_logo;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    public String getFlight_time() {
        return flight_time;
    }

    public void setFlight_time(String flight_time) {
        this.flight_time = flight_time;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getFlight_class() {
        return flight_class;
    }

    public void setFlight_class(String flight_class) {
        this.flight_class = flight_class;
    }

    public String getFlight_price() {
        return flight_price;
    }

    public void setFlight_price(String flight_price) {
        this.flight_price = flight_price;
    }

    public int getAirline_logo() {
        return airline_logo;
    }

    public void setAirline_logo(int airline_logo) {
        this.airline_logo = airline_logo;
    }
}
