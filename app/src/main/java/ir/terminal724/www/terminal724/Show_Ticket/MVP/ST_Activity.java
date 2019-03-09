package ir.terminal724.www.terminal724.Show_Ticket.MVP;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.cooltechworks.views.shimmer.ShimmerRecyclerView;

import java.util.List;

import ir.terminal724.www.terminal724.MyView.My_Textview;
import ir.terminal724.www.terminal724.Public.BaseActivity;
import ir.terminal724.www.terminal724.Public.PublicMethods;
import ir.terminal724.www.terminal724.R;
import ir.terminal724.www.terminal724.Show_Ticket.models.Flight;
import ir.terminal724.www.terminal724.Show_Ticket.models.RavisFlightRequest;
import ir.terminal724.www.terminal724.Show_Ticket.models.Weekday;

public class ST_Activity extends BaseActivity implements ST_Contract.View {
    RecyclerView recycler_showticket;
    public static String date_weekdate;
    ST_Presenter presenter = new ST_Presenter();
    My_Textview des_top;
    My_Textview origin_top;
    String name_origin;
    String name_destination;
    public String stDate;
    public String stDate_weekdays;
    String origin;
    String destination;
    My_Textview origin_code_top;
    ImageView img_back_st;
    My_Textview destination_code_top;
    My_Textview date_top;
    String abb_origin;
    RecyclerView recycler_weekdays;
    String abb_destination;

    ShimmerRecyclerView shimmerRecycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_ticket);
        init();
        bind();
        getMyIntent();
        getParam();
        goToBack();
        setData_Top();
//  /

    }

    void init() {
        presenter.attachView(this);
    }

    void bind() {
        img_back_st = findViewById(R.id.img_back_st);
        recycler_showticket = findViewById(R.id.recycler_showticket);
        recycler_weekdays = findViewById(R.id.recycler_weekday);
        des_top = findViewById(R.id.txt_des_top_st);
        origin_top = findViewById(R.id.txt_origin_top_st);
        date_top = findViewById(R.id.txt_date_top_st);
        origin_code_top = findViewById(R.id.txt_origin_code_top_st);
        destination_code_top = findViewById(R.id.txt_des_code_top_st);
        shimmerRecycler = findViewById(R.id.shimmer_recycler_view);
    }

    void goToBack() {
        img_back_st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void setData(List<Flight> flight, List<Weekday> weekdays) {
        shimmerRecycler.showShimmerAdapter();
        ShowTicket_Adapter adapter = new ShowTicket_Adapter(flight, mContext);
        LinearLayoutManager manager = new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false);
        recycler_showticket.setLayoutManager(manager);
        recycler_showticket.setAdapter(adapter);
        //weekdat top page
        ST_Weekday_Adapter adapter1 = new ST_Weekday_Adapter(weekdays, mContext);
        LinearLayoutManager manager1 = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        recycler_weekdays.setLayoutManager(manager1);
        recycler_weekdays.setAdapter(adapter1);
        shimmerRecycler.setVisibility(View.GONE);

    }


    @Override
    public void Error(Throwable r) {
        PublicMethods.Toast(mContext, r.toString());
    }

    @Override
    public void fail() {
        PublicMethods.Toast(mContext, "مشکلی رخ داده است");
    }

    public void sendParam (String date){
            RavisFlightRequest values1 = new RavisFlightRequest();
            values1.currentPage = "1";
            values1.source = abb_origin;
            values1.dest = abb_destination;
            values1.stDate = date;
            values1.withFilters = true;
            values1.sortable = "1";
            presenter.getParam(values1);
}


    void getParam() {
        RavisFlightRequest values = new RavisFlightRequest();
        values.currentPage = "1";
        values.source = abb_origin;
        values.dest = abb_destination;
        values.stDate = stDate;
        values.withFilters = true;
        values.sortable = "1";
        presenter.getParam(values);
    }

    void getMyIntent() {
        stDate = getIntent().getStringExtra("dateFlight");
        origin = getIntent().getStringExtra("oneCityName");
        destination = getIntent().getStringExtra("secondCityName");
        abb_origin = getIntent().getStringExtra("oneCityCode");
        abb_destination = getIntent().getStringExtra("secondCityCode");
    }



    void setData_Top() {
        name_origin = origin;
        name_destination = destination;
        origin_top.setText(name_origin);
        des_top.setText(name_destination);
        origin_code_top.setText(abb_origin);
        destination_code_top.setText(abb_destination);
        date_top.setText(stDate.replace("-", "/"));
    }

}


