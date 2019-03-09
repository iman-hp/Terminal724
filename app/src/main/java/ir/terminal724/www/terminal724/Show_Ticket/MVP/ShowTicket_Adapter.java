package ir.terminal724.www.terminal724.Show_Ticket.MVP;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.text.DecimalFormat;
import java.util.List;

import ir.terminal724.www.terminal724.MyView.My_Button;
import ir.terminal724.www.terminal724.MyView.My_Textview;
import ir.terminal724.www.terminal724.R;
import ir.terminal724.www.terminal724.Select_Passengers.SelectPassengers_Activity;
import ir.terminal724.www.terminal724.Show_Ticket.models.Flight;
import ir.terminal724.www.terminal724.Show_Ticket.models.ShowTicket_Model;

public class ShowTicket_Adapter extends RecyclerView.Adapter<ShowTicket_Adapter.Holder> {
    List<Flight> list;
    Context mContext;

    public ShowTicket_Adapter(List<Flight> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    public static String splitDigits(int number) {
        return new DecimalFormat("###,###,###").format(number);
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
        double price=list.get(i).getPriceView();
        String p=price+"";
        String substr=p.substring(0,p.length()-2);
        String viewPrice=splitDigits((int) Double.parseDouble(substr)/10);



        holder.flight_number.setText(list.get(i).getFlightNo());
        holder.airline_name.setText(list.get(i).getAirline());
        holder.time.setText(list.get(i).getFlightTime());
        holder.seat.setText(list.get(i).getCap() + "");
        holder.flight_class.setText(list.get(i).getClassName());
        holder.price.setText(viewPrice);
        if (list.get(i).getFlightType().equals("سیستمی")) {
            Picasso.with(mContext).load(R.drawable.systemy).into(holder.systemy);
        } else if (list.get(i).getFlightType().equals("چارتری")) {
            Picasso.with(mContext).load(R.drawable.charter).into(holder.systemy);
        } else {
            Picasso.with(mContext).load(R.drawable.nulll).into(holder.systemy);
        }
        switch (list.get(i).getAirlineIataCode()) {
            case "ZV":
                holder.airline_name.setText("زاگرس");

                break;
            case "EP":
                holder.airline_name.setText("آسمان");
                Picasso.with(mContext).load(R.drawable.aseman).error(R.drawable.nulll).into(holder.airline_logo);
                break;
            case "IR":
                holder.airline_name.setText("ایرلاین");
                Picasso.with(mContext).load(R.drawable.airline).error(R.drawable.nulll).into(holder.airline_logo);
                break;
            case "B9":
                holder.airline_name.setText("ایرتور");
                Picasso.with(mContext).load(R.drawable.airtour).error(R.drawable.nulll).into(holder.airline_logo);
                break;
            case "HH":
                holder.airline_name.setText("تابان");
                Picasso.with(mContext).load(R.drawable.taban).error(R.drawable.nulll).into(holder.airline_logo);
                break;
            case "IV":
                holder.airline_name.setText("کاسپین");
                Picasso.with(mContext).load(R.drawable.caspian).error(R.drawable.nulll).into(holder.airline_logo);
                break;
            case "QB":
                holder.airline_name.setText("قشم ایر");
                Picasso.with(mContext).load(R.drawable.gheshm).error(R.drawable.nulll).into(holder.airline_logo);
                break;
            case "NV":
                holder.airline_name.setText("نفت");
                Picasso.with(mContext).load(R.drawable.naft).error(R.drawable.nulll).into(holder.airline_logo);
                break;
            case "JI":
                holder.airline_name.setText("معراج");
                Picasso.with(mContext).load(R.drawable.meraj).error(R.drawable.nulll).into(holder.airline_logo);
                break;
            case "Y9":
                holder.airline_name.setText("کیش ایر");
                Picasso.with(mContext).load(R.drawable.kish).error(R.drawable.nulll).into(holder.airline_logo);
                break;
            case "I3":
                holder.airline_name.setText("آتا");
                Picasso.with(mContext).load(R.drawable.ata).error(R.drawable.nulll).into(holder.airline_logo);
                break;
            case "Z4":
                holder.airline_name.setText("پویا");
                Picasso.with(mContext).load(R.drawable.pouya).error(R.drawable.nulll).into(holder.airline_logo);
                break;
            case "TF":
                holder.airline_name.setText("تفتان");
                Picasso.with(mContext).load(R.drawable.taftan).error(R.drawable.nulll).into(holder.airline_logo);
                break;
            case "AK":
                holder.airline_name.setText("آترک");
                Picasso.with(mContext).load(R.drawable.atrak).error(R.drawable.nulll).into(holder.airline_logo);
                break;
            case "Z3":
                holder.airline_name.setText("ساها");
                Picasso.with(mContext).load(R.drawable.saha).error(R.drawable.nulll).into(holder.airline_logo);
                break;
            case "Z2":
                holder.airline_name.setText("شپهران");
                Picasso.with(mContext).load(R.drawable.sepehran).error(R.drawable.nulll).into(holder.airline_logo);
                break;
            case "VR":
                holder.airline_name.setText("وارش");
                Picasso.with(mContext).load(R.drawable.varesh).error(R.drawable.nulll).into(holder.airline_logo);
                break;
        }
        holder.resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(mContext, SelectPassengers_Activity.class);
                intent1.putExtra("flights",new Gson().toJson(list.get(i)));
                mContext.startActivity(intent1);
            }
        });
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
        ImageView systemy;
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
            systemy = itemView.findViewById(R.id.img_systemy);
            airline_logo = itemView.findViewById(R.id.img_logo_airline_st);
            resume = itemView.findViewById(R.id.btn_resume_st);
        }
    }
}
