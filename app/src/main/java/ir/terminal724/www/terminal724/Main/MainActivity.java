package ir.terminal724.www.terminal724.Main;

import android.content.Intent;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ir.he.meowdatetimepicker.date.DatePickerDialog;
import ir.he.meowdatetimepicker.utils.PersianCalendar;
import ir.huri.jcal.JalaliCalendar;
import ir.terminal724.www.terminal724.Drawer.Drawer_Adapter;
import ir.terminal724.www.terminal724.Drawer.List_Drawer_Model;
import ir.terminal724.www.terminal724.MyView.My_Bold_TextView;
import ir.terminal724.www.terminal724.MyView.My_RadioButton;
import ir.terminal724.www.terminal724.MyView.My_Textview;
import ir.terminal724.www.terminal724.Public.BaseActivity;
import ir.terminal724.www.terminal724.Public.PublicMethods;
import ir.terminal724.www.terminal724.R;
import ir.terminal724.www.terminal724.Search_City.Citys;
import ir.terminal724.www.terminal724.Search_City.Search_City_Origin_Activity;
import ir.terminal724.www.terminal724.Search_City.Search_City_dest_Activity;
import ir.terminal724.www.terminal724.Show_Ticket.MVP.ST_Activity;

public class MainActivity extends BaseActivity implements View.OnClickListener, DatePickerDialog.OnDateSetListener {
    My_RadioButton radiobutton_goinground;
    My_RadioButton radiobutton_go;
    SliderLayout sliderShow;
    ArrayList<String> urlPics;
    DrawerLayout drawer;
    LinearLayout search;
    LinearLayout linear_destination;
    LinearLayout linear_origin;
    private boolean searchCity;
    My_Bold_TextView origin;
    My_Bold_TextView destination;
    My_Textview origin_abb;
    My_Textview destination_abb;
    LinearLayout date_origin;
    My_Bold_TextView txt_depart_date;
    String oneCity;
    String secondCity;
    String name_origin;
    String name_destination;
    String date_flight;
    ListView listview_drawer;
    ImageView img_open_drawer;
    ir.he.meowdatetimepicker.utils.PersianCalendar initDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bind();

        click();
        slider();
        createDrawer();
    }

    void bind() {
        sliderShow = findViewById(R.id.slider);
        radiobutton_goinground = findViewById(R.id.radiobutton_goinground);
        radiobutton_go = findViewById(R.id.radiobutton_go);
        txt_depart_date = findViewById(R.id.txt_depart_date);
        search = findViewById(R.id.linear_search);
        linear_destination = findViewById(R.id.linear_select_destination);
        linear_origin = findViewById(R.id.linear_select_origin);
        origin = findViewById(R.id.txt_origin_main);
        destination = findViewById(R.id.txt_destination_main);
        origin_abb = findViewById(R.id.txt_origin_abb_main);
        destination_abb = findViewById(R.id.txt_destination_abb_main);
        date_origin = findViewById(R.id.linear_picker_date_origin);
        drawer = findViewById(R.id.drawer);
        img_open_drawer = findViewById(R.id.img_open_drawer);
        listview_drawer = findViewById(R.id.listview_drawer);


    }



    void click() {
        linear_origin.setOnClickListener(this);
        linear_destination.setOnClickListener(this);
        date_origin.setOnClickListener(this);
        search.setOnClickListener(this);
        img_open_drawer.setOnClickListener(this);

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
            Intent searchintent1 = new Intent(mContext, Search_City_Origin_Activity.class);
            searchCity = true;
            startActivity(searchintent1);

        } else if (id == linear_destination.getId()) {
            Intent searchintent2 = new Intent(mContext, Search_City_dest_Activity.class);

            searchCity = true;
            startActivity(searchintent2);
        } else if (id == date_origin.getId()) {
            calender();
        } else if (id == search.getId()) {
            Intent searchIntent = new Intent(mContext, ST_Activity.class);
            searchIntent.putExtra("oneCityCode", oneCity);
            searchIntent.putExtra("secondCityCode", secondCity);
            searchIntent.putExtra("oneCityName", name_origin);
            searchIntent.putExtra("secondCityName", name_destination);
            searchIntent.putExtra("dateFlight", date_flight);
            startActivity(searchIntent);
        } else if (id == img_open_drawer.getId()) {
            drawer.openDrawer(Gravity.END);
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
                name_origin = city.getAirportName();
                String code[] = city.getAirportCode().split(",");
                oneCity = code[0].toUpperCase() + "";
                origin_abb.setText(code[0].toUpperCase() + "");
            }
            if (citySecondJson != "b") {
                Citys citySecond = new Gson().fromJson(citySecondJson, Citys.class);
                destination.setText(citySecond.getAirportName() + "");
                name_destination = citySecond.getAirportName();
                String codeSecond[] = citySecond.getAirportCode().split(",");
                secondCity = codeSecond[0].toUpperCase() + "";
                destination_abb.setText(codeSecond[0].toUpperCase() + "");

            }
        }
        super.onResume();
    }


    void calender() {
        initDate = new ir.he.meowdatetimepicker.utils.PersianCalendar();
        JalaliCalendar jalaliCalendar = new JalaliCalendar(new Date());
        initDate.setPersianDate(jalaliCalendar.getYear(), jalaliCalendar.getMonth(), jalaliCalendar.getDay());
        ir.he.meowdatetimepicker.utils.PersianCalendar persianCalendar = new PersianCalendar();
        DatePickerDialog datePickerDialog = DatePickerDialog.newInstance(
                MainActivity.this,
                persianCalendar.getPersianYear(),
                persianCalendar.getPersianMonth(),
                persianCalendar.getPersianDay()
        );
        datePickerDialog.setMinDate(persianCalendar);
        datePickerDialog.setYearRange(1397, 1399);


        datePickerDialog.show(getFragmentManager(), "Datepickerdialog");
    }

    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
        String date = year + "/" + (monthOfYear + 1) + "/" + dayOfMonth;
        txt_depart_date.setText(date);
        date_flight = date.replace("/", "-");
    }

    void createDrawer() {
        List<List_Drawer_Model> model = new ArrayList<>();
        List_Drawer_Model my_tickets = new List_Drawer_Model("بلیط های من", R.drawable.success);
        List_Drawer_Model tracker_buy = new List_Drawer_Model("پیگیری خرید", R.drawable.success);
        List_Drawer_Model points = new List_Drawer_Model("امتیازات", R.drawable.success);
        List_Drawer_Model shop = new List_Drawer_Model("بازارچه", R.drawable.success);
        List_Drawer_Model massage = new List_Drawer_Model("پیام ها", R.drawable.success);
        List_Drawer_Model suggest = new List_Drawer_Model("پیشنهاد به دوستان", R.drawable.success);
        model.add(my_tickets);
        model.add(tracker_buy);
        model.add(points);
        model.add(shop);
        model.add(massage);
        model.add(suggest);
        Drawer_Adapter adapter = new Drawer_Adapter(model, mContext);
        listview_drawer.setAdapter(adapter);
    }
}

