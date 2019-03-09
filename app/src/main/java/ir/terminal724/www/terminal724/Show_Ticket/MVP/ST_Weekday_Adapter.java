package ir.terminal724.www.terminal724.Show_Ticket.MVP;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.google.gson.Gson;

import java.text.DecimalFormat;
import java.util.List;

import ir.terminal724.www.terminal724.MyView.My_Textview;
import ir.terminal724.www.terminal724.R;
import ir.terminal724.www.terminal724.Show_Ticket.models.Weekday;

public class ST_Weekday_Adapter extends RecyclerView.Adapter<ST_Weekday_Adapter.Holder> {
    List<Weekday> weekday_list;
    Context mContext;

    public ST_Weekday_Adapter(List<Weekday> weekday_list, Context mContext) {
        this.weekday_list = weekday_list;
        this.mContext = mContext;
    }
    public static String splitDigits(int number) {
        return new DecimalFormat("###,###,###").format(number);
    }
    @NonNull
    @Override
    public ST_Weekday_Adapter.Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.st_layout_weeldays_item, viewGroup, false);
        Holder holder = new Holder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ST_Weekday_Adapter.Holder holdet, int i) {
        double price=weekday_list.get(i).getPrice();
        String p=price+"";
        String substr=p.substring(0,p.length()-2);
        String viewPrice=splitDigits((int) Double.parseDouble(substr)/10);
        holdet.day.setText(weekday_list.get(i).getRooz());
        holdet.date.setText(weekday_list.get(i).getDate().replace("-","/"));
        holdet.price.setText(viewPrice);








        holdet.relative_weekday.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String date_week=new Gson().toJson(weekday_list.get(i).getDate());
            ((ST_Activity)mContext).stDate_weekdays = date_week;
            ((ST_Activity)mContext).sendParam(date_week);
        }
    });
    }

    @Override
    public int getItemCount() {
        return weekday_list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        My_Textview date;
        My_Textview price;
        RelativeLayout relative_weekday;
        My_Textview day;

        public Holder(@NonNull View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.txt_weekday_date);
            price = itemView.findViewById(R.id.txt_weekday_price);
            day = itemView.findViewById(R.id.txt_weekday_day);
            relative_weekday=itemView.findViewById(R.id.relative_weekday);
        }
    }
}
