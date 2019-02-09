package ir.terminal724.www.terminal724.Show_Ticket;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ir.terminal724.www.terminal724.Public.BaseActivity;
import ir.terminal724.www.terminal724.R;

public class ShowTicket_Activity extends BaseActivity {
    RecyclerView recycler_showticket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_ticket);
        bind();
        createRecycler();
    }

    void bind() {
        recycler_showticket = findViewById(R.id.recycler_showticket);
    }

    void createRecycler() {
        List<ShowTicket_Model> list = new ArrayList<>();
        ShowTicket_Model one = new ShowTicket_Model("کیش ایر", "1209", "13:40", "9", "A", "23000", R.drawable.kish);
        ShowTicket_Model two = new ShowTicket_Model("کیش ایر", "1209", "13:40", "9", "A", "23000", R.drawable.kish);
        ShowTicket_Model three = new ShowTicket_Model("کیش ایر", "1209", "13:40", "9", "A", "23000", R.drawable.kish);
        ShowTicket_Model four = new ShowTicket_Model("کیش ایر", "1209", "13:40", "9", "A", "23000", R.drawable.kish);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        ShowTicket_Adapter adapter=new ShowTicket_Adapter(list,mContext);
        LinearLayoutManager manager=new LinearLayoutManager(mContext,LinearLayoutManager.VERTICAL,false);
        recycler_showticket.setLayoutManager(manager);
        recycler_showticket.setAdapter(adapter);
    }
}
