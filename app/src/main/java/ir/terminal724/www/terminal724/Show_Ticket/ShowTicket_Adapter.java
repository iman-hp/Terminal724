package ir.terminal724.www.terminal724.Show_Ticket;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

import ir.terminal724.www.terminal724.MyView.My_Button;
import ir.terminal724.www.terminal724.MyView.My_Textview;
import ir.terminal724.www.terminal724.R;

public class ShowTicket_Adapter extends RecyclerView.Adapter<ShowTicket_Adapter.Holder> {
    List<ShowTicket_Model> list;
    Context mContext;

    public ShowTicket_Adapter(List<ShowTicket_Model> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ShowTicket_Adapter.Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.showticket_flight_item, viewGroup, false);
        Holder holder = new Holder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ShowTicket_Adapter.Holder holder, int i) {
        holder.flight_number.setText(list.get(i).getFlight_number());
        holder.airline_name.setText(list.get(i).getAirline());
        holder.time.setText(list.get(i).getFlight_time());
        holder.seat.setText(list.get(i).getSeat());
        holder.flight_class.setText(list.get(i).getFlight_class());
        holder.price.setText(list.get(i).getFlight_price());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        My_Textview flight_number;
        My_Textview airline_name;
        My_Textview time;
        My_Textview seat;
        My_Textview flight_class;
        My_Textview price;
        My_Textview systemy;
        ImageView airline_logo;
        My_Button resume;

        public Holder(@NonNull View itemView) {
            super(itemView);
            flight_number = itemView.findViewById(R.id.txt_flight_number_st);
            airline_name = itemView.findViewById(R.id.txt_airline_name_st);
            time = itemView.findViewById(R.id.txt_flight_time_st);
            seat = itemView.findViewById(R.id.txt_seat_st);
            flight_class = itemView.findViewById(R.id.txt_flight_class_st);
            price = itemView.findViewById(R.id.txt_flight_price_st);

            airline_logo = itemView.findViewById(R.id.img_logo_airline_st);
            resume = itemView.findViewById(R.id.btn_resume_st);
        }
    }
}
