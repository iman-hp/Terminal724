package ir.terminal724.www.terminal724.Select_Passengers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.gson.Gson;

import java.util.List;

import ir.terminal724.www.terminal724.Enter_Name.Enter_Name_Activity;
import ir.terminal724.www.terminal724.MyView.My_Bold_TextView;
import ir.terminal724.www.terminal724.MyView.My_Button;
import ir.terminal724.www.terminal724.MyView.My_Textview;
import ir.terminal724.www.terminal724.Public.BaseActivity;
import ir.terminal724.www.terminal724.Public.PublicMethods;
import ir.terminal724.www.terminal724.R;
import ir.terminal724.www.terminal724.Show_Ticket.models.Flight;

public class SelectPassengers_Activity extends BaseActivity implements View.OnClickListener {
    My_Bold_TextView origin;
    My_Bold_TextView des;
    My_Textview time;
    My_Textview date;
    My_Bold_TextView origin_abb;
    My_Bold_TextView des_abb;
    ir.terminal724.www.terminal724.Show_Ticket.models.Flight flight;
    ImageView img_min_baby_sp;
    ImageView img_max_baby_sp;
    ImageView img_min_child_sp;
    ImageView img_max_child_sp;
    ImageView img_min_adult_sp;
    ImageView img_max_adult_sp;

    int adult_Count = 0;
    int child_Count = 0;
    int baby_Count = 0;
    My_Textview txt_adult_count;
    My_Textview txt_baby_count;
    My_Textview txt_child_count;
    My_Button btn_resume;
    My_Button btn_cancell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_passengers_);
        bind();
        setDate_Flight();
        click();

    }

    void bind() {
        flight = new Gson().fromJson(getIntent().getStringExtra("flights"), ir.terminal724.www.terminal724.Show_Ticket.models.Flight.class);
        origin = findViewById(R.id.txt_origin_sp);
        des = findViewById(R.id.txt_des_sp);
        time = findViewById(R.id.txt_time_sp);
        date = findViewById(R.id.txt_date_sp);
        origin_abb = findViewById(R.id.txt_origin_abb_sp);
        des_abb = findViewById(R.id.txt_des_abb_sp);
        txt_adult_count = findViewById(R.id.txt_adult_count);
        txt_baby_count = findViewById(R.id.txt_baby_count);
        txt_child_count = findViewById(R.id.txt_child_count);
        img_min_baby_sp = findViewById(R.id.img_min_baby_sp);
        img_max_baby_sp = findViewById(R.id.img_max_baby_sp);
        img_min_child_sp = findViewById(R.id.img_min_child_sp);
        img_max_child_sp = findViewById(R.id.img_max_child_sp);
        img_max_adult_sp = findViewById(R.id.img_max_adult_sp);
        img_min_adult_sp = findViewById(R.id.img_min_adult_sp);
        btn_resume = findViewById(R.id.btn_resume_sp);
        btn_cancell = findViewById(R.id.btn_cancell_sp);
    }

    void setDate_Flight() {
        if (flight.getSource().equals("تهران مهرآباد")) {
            origin.setText("تهران");
        }
        if (flight.getDestinate().equals("تهران مهرآباد")) {
            des.setText("تهران");
        }

        time.setText(flight.getFlightTime());
        date.setText(flight.getFlightDate());
        origin_abb.setText(flight.getIataCodSource().toUpperCase());
        des_abb.setText(flight.getIataCodDestinate().toUpperCase());
    }


    void click() {
        img_min_baby_sp.setOnClickListener(this);
        img_max_baby_sp.setOnClickListener(this);
        img_min_child_sp.setOnClickListener(this);
        img_max_child_sp.setOnClickListener(this);
        img_max_adult_sp.setOnClickListener(this);
        img_min_adult_sp.setOnClickListener(this);
        btn_resume.setOnClickListener(this);
        btn_cancell.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == img_min_baby_sp.getId()) {
            if (!(baby_Count == 0)) {
                baby_Count = baby_Count - 1;
                txt_baby_count.setText(baby_Count + "");

            } else {
                PublicMethods.Toast(mContext, "عدد نامعتبر است");
            }


        } else if (id == img_max_baby_sp.getId()) {

            baby_Count = baby_Count + 1;
            txt_baby_count.setText(baby_Count + "");


        } else if (id == img_min_child_sp.getId()) {
            if (child_Count == 0) {
                PublicMethods.Toast(mContext, "عدد نامعتبر است");
            } else {
                child_Count = child_Count - 1;
                txt_child_count.setText(child_Count + "");
            }


        } else if (id == img_max_child_sp.getId()) {

            child_Count = child_Count + 1;
            txt_child_count.setText(child_Count + "");


        } else if (id == img_min_adult_sp.getId()) {
            if (adult_Count == 0) {
                PublicMethods.Toast(mContext, "عدد نامعتبر است");
            } else {
                adult_Count = adult_Count - 1;
                txt_adult_count.setText(adult_Count + "");
            }


        } else if (id == img_max_adult_sp.getId()) {

            adult_Count = adult_Count + 1;
            txt_adult_count.setText(adult_Count + "");
        } else if (id == btn_resume.getId()) {
            Intent resumeIntent = new Intent(mContext, Enter_Name_Activity.class);
            resumeIntent.putExtra("adultValue", adult_Count);
            resumeIntent.putExtra("babyValue", baby_Count);
            resumeIntent.putExtra("childValue", child_Count);
            startActivity(resumeIntent);


        } else if (id == btn_cancell.getId()) {
            finish();
        }

    }



}
