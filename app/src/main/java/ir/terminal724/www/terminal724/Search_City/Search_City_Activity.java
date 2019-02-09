package ir.terminal724.www.terminal724.Search_City;


import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import ir.terminal724.www.terminal724.Main.MainActivity;
import ir.terminal724.www.terminal724.MyView.My_EditText;
import ir.terminal724.www.terminal724.Public.BaseActivity;
import ir.terminal724.www.terminal724.Public.PublicMethods;
import ir.terminal724.www.terminal724.Public.tmpApplication;
import ir.terminal724.www.terminal724.R;
import ir.terminal724.www.terminal724.Service.Endpoints;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Search_City_Activity extends BaseActivity {
    ImageView img_back_search;
    My_EditText edt_search_city;
    ListView listview_city_search;

    ArrayAdapter adapter1;
    List<String> persian;
    private ArrayList<Citys> citys;
    private boolean[] selectCity = {false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search__city_);
        bind_Views();
        editTextProcess();
        CreateListPersian();
        createList();
        back_icon();
        cityList();
    }

    void bind_Views() {
        img_back_search = findViewById(R.id.img_back_search);
        edt_search_city = findViewById(R.id.edt_search_city);
        listview_city_search = findViewById(R.id.listview_city_search);



    }

    void cityList() {
        String one = PublicMethods.getValue(mContext,"city", "a");
        if (one.equals("a")) {
            create_data_city();
        } else {
            ArrayList<Citys> response = new Gson().fromJson(one, new TypeToken<List<Citys>>() {
            }.getType());
            citys = response;
            List<String> arrayList = new ArrayList<>();
            for (Citys citys : response) {
                arrayList.add(citys.getAirportName());
            }
            adapter1 = new ArrayAdapter(mContext, android.R.layout.simple_list_item_1, arrayList);
            listview_city_search.setAdapter(adapter1);
        }
    }

    void createList() {
        listview_city_search.setTextFilterEnabled(true);
        listview_city_search.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int currentPosition = 0;
                for (int i = 0; i < citys.size(); i++) {
                    if (citys.get(i).getAirportName().equals(listview_city_search.getAdapter().getItem(position))) {
                        currentPosition = i;
                        break;
                    }
                }
                boolean oneCity = getIntent().getBooleanExtra("OneCity", false);
                if (oneCity) {
                    PublicMethods.saveValue(mContext,"OneCity", new Gson().toJson(citys.get(currentPosition)));
                } else {
                    PublicMethods.saveValue(mContext,"secondCity", new Gson().toJson(citys.get(currentPosition)));
                }
                finish();


            }
        });
    }

    void create_data_city() {
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://www.ravis.ir/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        Endpoints endpoints = retrofit.create(Endpoints.class);
        endpoints.getCities().enqueue(new Callback<ArrayList<Citys>>() {
            @Override
            public void onResponse(Call<ArrayList<Citys>> call, Response<ArrayList<Citys>> response) {
                PublicMethods.saveValue(mContext,"city", new Gson().toJson(response.body()));
                citys = response.body();
                List<String> arrayList = new ArrayList<>();
                for (Citys citys : response.body()) {
                    arrayList.add(citys.getAirportName());
                }
                adapter1 = new ArrayAdapter(mContext, android.R.layout.simple_list_item_1, arrayList);
                listview_city_search.setAdapter(adapter1);


            }

            @Override
            public void onFailure(Call<ArrayList<Citys>> call, Throwable t) {
                Toast.makeText(mContext, "اینترنت خود را متصل کنید", Toast.LENGTH_SHORT).show();
            }
        });
    }


    void back_icon() {
        img_back_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }

    void CreateListPersian() {

        persian = new ArrayList<>();
        for (int i = 0; i < tmpApplication.cities.size(); i++) {
            persian.add(tmpApplication.cities.get(i).getCity_persian());
        }


    }

    void editTextProcess() {
        edt_search_city.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Search_City_Activity.this.adapter1.getFilter().filter(s);
            }
        });


    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}
