package ir.terminal724.www.terminal724.Main;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Date;
import ir.hamsaa.persiandatepicker.Listener;
import ir.hamsaa.persiandatepicker.PersianDatePickerDialog;
import ir.hamsaa.persiandatepicker.util.PersianCalendar;
import ir.huri.jcal.JalaliCalendar;
import ir.terminal724.www.terminal724.MyView.My_Bold_TextView;
import ir.terminal724.www.terminal724.MyView.My_RadioButton;
import ir.terminal724.www.terminal724.MyView.My_Textview;
import ir.terminal724.www.terminal724.Public.BaseActivity;
import ir.terminal724.www.terminal724.Public.PublicMethods;
import ir.terminal724.www.terminal724.R;
import ir.terminal724.www.terminal724.Search_City.Citys;
import ir.terminal724.www.terminal724.Search_City.Search_City_Activity;

public class MainActivity extends BaseActivity implements View.OnClickListener{
    My_RadioButton radiobutton_goinground;
    My_RadioButton radiobutton_go;
    SliderLayout sliderShow;
    ArrayList<String> urlPics;
    LinearLayout search;
    LinearLayout linear_destination;
    LinearLayout linear_origin;
    private boolean searchCity;
    My_Bold_TextView origin;
    My_Bold_TextView destination;
    My_Textview origin_abb;
    My_Textview destination_abb;
    LinearLayout date_origin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bind();
        setFont();
        click();
        slider();
        setCalender_Origin();
    }

    void bind() {
        sliderShow = findViewById(R.id.slider);
        radiobutton_goinground = findViewById(R.id.radiobutton_goinground);
        radiobutton_go = findViewById(R.id.radiobutton_go);
        search = findViewById(R.id.linear_search);
        linear_destination = findViewById(R.id.linear_select_destination);
        linear_origin = findViewById(R.id.linear_select_origin);
        origin = findViewById(R.id.txt_origin_main);
        destination = findViewById(R.id.txt_destination_main);
        origin_abb = findViewById(R.id.txt_origin_abb_main);
        destination_abb = findViewById(R.id.txt_destination_abb_main);
        date_origin = findViewById(R.id.linear_picker_date_origin);


    }

    void setFont() {
        Typeface font = Typeface.createFromAsset(getAssets(), "IRANSans.ttf");
        radiobutton_goinground.setTypeface(font);
        radiobutton_go.setTypeface(font);

    }

    void click() {
        linear_origin.setOnClickListener(this);
        linear_destination.setOnClickListener(this);


    }

    @Override
    protected void onStop() {
        sliderShow.stopAutoCycle();
        super.onStop();
    }

    void slider() {
        urlPics = new ArrayList<>();
        urlPics.add("http://www.airworldtours.com/assets/userfiles/banners_flights.jpg");
        urlPics.add("https://images.via.com/static/dynimg/search_page/76/normal/1044046495-1044046494_intl-banner-994x415jpg.jpg");
        urlPics.add("https://www.cni.my/uploads/strategic_partner/malaysiaairlines_banner.jpg");
        for (int i = 0; i < urlPics.size(); i++) {
            DefaultSliderView textSliderView = new DefaultSliderView(this);
            textSliderView.image(urlPics.get(i)).setScaleType(BaseSliderView.ScaleType.Fit);
            sliderShow.addSlider(textSliderView);
        }
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == linear_origin.getId()) {
            Intent searchintent1 = new Intent(mContext, Search_City_Activity.class);
            searchCity = true;
            searchintent1.putExtra("OneCity", true);
            startActivity(searchintent1);

        } else if (id == linear_destination.getId()) {
            Intent searchintent2 = new Intent(mContext, Search_City_Activity.class);
            searchintent2.putExtra("OneCity", false);
            searchCity = true;
            startActivity(searchintent2);
        }
    }

    @Override
    protected void onResume() {
        if (searchCity) {
            searchCity = false;
            String cityJson = PublicMethods.getValue(mContext, "OneCity", "a");
            String citySecondJson = PublicMethods.getValue(mContext, "secondCity", "b");
            if (cityJson != "a") {
                Citys city = new Gson().fromJson(cityJson, Citys.class);
                origin.setText(city.getAirportName() + "");
                String code[] = city.getAirportCode().split(",");
                origin_abb.setText(code[0].toUpperCase() + "");
            }
            if (citySecondJson != "b") {
                Citys citySecond = new Gson().fromJson(citySecondJson, Citys.class);
                destination.setText(citySecond.getAirportName() + "");
                String codeSecond[] = citySecond.getAirportCode().split(",");
                destination_abb.setText(codeSecond[0].toUpperCase() + "");

            }
        }
        super.onResume();
    }

    void setCalender_Origin() {
        date_origin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calender();


            }
        });

    }

    void calender() {
        PersianCalendar initDate=new PersianCalendar();
        JalaliCalendar jalaliCalendar=new JalaliCalendar(new Date());
        initDate.setPersianDate(jalaliCalendar.getYear(),jalaliCalendar.getMonth(),jalaliCalendar.getDay());
        PersianDatePickerDialog  picker = new PersianDatePickerDialog(this)
                .setPositiveButtonString("باشه")
                .setNegativeButton("بیخیال")
                .setTodayButton("امروز")
                .setTodayButtonVisible(true)
                .setInitDate(initDate)
                .setMaxYear(PersianDatePickerDialog.THIS_YEAR)
                .setMinYear(1300)
                .setActionTextColor(Color.GRAY)
                .setListener(new Listener() {
                    @Override
                    public void onDateSelected(PersianCalendar persianCalendar) {

                    }

                    @Override
                    public void onDismissed() {

                    }
                });

        picker.show();
    }

}
