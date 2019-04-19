package ir.terminal724.www.terminal724.Drawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

import ir.terminal724.www.terminal724.MyView.My_Textview;
import ir.terminal724.www.terminal724.R;

public class Drawer_Adapter extends BaseAdapter {
    List<List_Drawer_Model> list;
    Context mContext;

    public Drawer_Adapter(List<List_Drawer_Model> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= LayoutInflater.from(mContext).inflate(R.layout.drawer_item,parent,false);
        ImageView img_title_list_drawer;
        My_Textview txt_title_list_drawer;
        img_title_list_drawer=v.findViewById(R.id.img_title_list_drawer);
        txt_title_list_drawer=v.findViewById(R.id.txt_title_list_drawer);
        Picasso.get().load(list.get(position).getIcon()).into(img_title_list_drawer);
        txt_title_list_drawer.setText(list.get(position).getTitle());

        return v;
    }
}
