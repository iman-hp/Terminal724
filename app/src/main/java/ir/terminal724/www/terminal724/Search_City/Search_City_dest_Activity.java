package ir.terminal724.www.terminal724.Search_City;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

import ir.terminal724.www.terminal724.Main.MainActivity;
import ir.terminal724.www.terminal724.Public.BaseActivity;
import ir.terminal724.www.terminal724.Public.tmpApplication;
import ir.terminal724.www.terminal724.R;

public class Search_City_dest_Activity extends BaseActivity {
    ImageView img_back_search;
    SearchView searchView1;
    ListView listview_city_search;

    Search_City_Adapter adapter1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search__city_dest);
        bind_Views();
        editTextProcess();
//        CreateListPersian();
        create_data_city();
        back_icon();
//        cityList();
    }

    void bind_Views() {
        img_back_search = findViewById(R.id.img_back_search_des);
        searchView1 = findViewById(R.id.searchView2);
        listview_city_search = findViewById(R.id.listview_city_search_des);



    }

//    void cityList() {
//        String one = PublicMethods.getValue(mContext,"city", "a");
//        if (one.equals("a")) {
//            create_data_city();
//        } else {
//            ArrayList<Citys> response = new Gson().fromJson(one, new TypeToken<List<Citys>>() {
//            }.getType());
//            citys = response;
//            List<String> arrayList = new ArrayList<>();
//            for (Citys citys : response) {
//                arrayList.add(citys.getAirportName());
//            }
//            create_data_city();
//        }
//    }

//    void createList() {
//        listview_city_search.setTextFilterEnabled(true);
//        listview_city_search.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                int currentPosition = 0;
//                for (int i = 0; i < citys.size(); i++) {
//                    if (citys.get(i).getAirportName().equals(listview_city_search.getAdapter().getItem(position))) {
//                        currentPosition = i;
//                        break;
//                    }
//                }
//                boolean oneCity = getIntent().getBooleanExtra("OneCity", false);
//                if (oneCity) {
//                    PublicMethods.saveValue(mContext,"OneCity", new Gson().toJson(citys.get(currentPosition)));
//                } else {
//                    PublicMethods.saveValue(mContext,"secondCity", new Gson().toJson(citys.get(currentPosition)));
//                }
//                finish();
//
//
//            }
//        });
//    }

    void create_data_city() {
        List<POJO_Cities> arrayList=tmpApplication.cities;
        adapter1 = new Search_City_Adapter(mContext,arrayList);
        listview_city_search.setAdapter(adapter1);
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

//    void CreateListPersian() {
//
//        persian = new ArrayList<>();
//        for (int i = 0; i < tmpApplication.cities.size(); i++) {
//            persian.add(tmpApplication.cities.get(i).getCity_persian());
//        }
//
//
//    }

    void editTextProcess() {
       searchView1.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
           @Override
           public boolean onQueryTextSubmit(String query) {
               return false;
           }

           @Override
           public boolean onQueryTextChange(String newText) {
               adapter1.getFilter().filter(newText);
               return false;
           }
       });

    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}
