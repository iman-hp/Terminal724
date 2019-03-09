package ir.terminal724.www.terminal724.Enter_Name;


import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import org.angmarch.views.NiceSpinner;

import java.util.ArrayList;
import ir.terminal724.www.terminal724.Public.BaseActivity;
import ir.terminal724.www.terminal724.R;

public class Enter_Name_Activity extends BaseActivity {
    NiceSpinner sex_spinner_en;
    NiceSpinner religion_spinner_en;
    public RecyclerView recycler_expa;
    LinearLayout linear_edit_passengers;
    public ArrayList<Passenger> passengers;
    int adult;
    int child;
    int baby;
    int count;
    public Expa_Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter__name_);
        bind();
       setExpa();



    }

    void bind() {
        sex_spinner_en = findViewById(R.id.sex_spinner_en);
        religion_spinner_en = findViewById(R.id.religion_spinner_en);
        recycler_expa = findViewById(R.id.recycler_expa);
        linear_edit_passengers = findViewById(R.id.linear_edit_passengers);
        linear_edit_passengers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                setExpa();
            }
        });

    }




    void setExpa() {
        passengers = new ArrayList<>();
        adult = getIntent().getIntExtra("adultValue", 1);
        baby = getIntent().getIntExtra("babyValue", 0);
        child = getIntent().getIntExtra("childValue", 0);
        count = adult+baby+child;

        for (int i = 0; i < count; i++) {
            if (adult == 0) {
                if (child == 0) {
                    baby--;
                    passengers.add(new Passenger(3));

                } else {
                    passengers.add(new Passenger(2));
                    child--;
                }
            } else {
                passengers.add(new Passenger(1));
                adult--;
            }
        }

        adult = getIntent().getIntExtra("adultValue", 1);
        baby = getIntent().getIntExtra("babyValue", 0);
        child = getIntent().getIntExtra("childValue", 0);


        adapter = new Expa_Adapter(mContext);
        LinearLayoutManager manager = new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false);
        recycler_expa.setLayoutManager(manager);
        recycler_expa.setAdapter(adapter);
    }
}
