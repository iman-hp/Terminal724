package ir.terminal724.www.terminal724.Search_City;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import ir.terminal724.www.terminal724.MyView.My_Textview;
import ir.terminal724.www.terminal724.R;

public class Search_City_Adapter extends BaseAdapter implements Filterable {
    Context c;
    List<POJO_Cities> list;
    CustomFilter filter;
    List<POJO_Cities> filterList;

    public Search_City_Adapter(Context c, List<POJO_Cities> list) {
        this.c = c;
        this.list = list;
        this.filterList=list;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return list.size();
    }

    @Override
    public Object getItem(int pos) {
        // TODO Auto-generated method stub
        return list.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        // TODO Auto-generated method stub
        return list.indexOf(getItem(pos));
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        LayoutInflater inflater=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.city_layout_item, null);
        }

        My_Textview city_fa=convertView.findViewById(R.id.txt_city_fa_sc);
        My_Textview city_country=convertView.findViewById(R.id.txt_city_country_sc);
        My_Textview city_code=convertView.findViewById(R.id.txt_city_code_sc);

        //SET DATA TO THEM
        city_fa.setText(list.get(pos).getCity_persian());
        city_country.setText(list.get(pos).getCountry());
        city_code.setText(list.get(pos).getCity_code());


        return convertView;
    }

    @Override
    public Filter getFilter() {
        // TODO Auto-generated method stub
        if(filter == null)
        {
            filter=new CustomFilter();
        }

        return filter;
    }

    //INNER CLASS
    class CustomFilter extends Filter{

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            // TODO Auto-generated method stub

            FilterResults results=new FilterResults();

            if(constraint != null && constraint.length()>0)
            {
                //CONSTARINT TO UPPER
                constraint=constraint.toString();

                List<POJO_Cities> filters=new ArrayList<>();

                //get specific items
                for(int i=0;i<filterList.size();i++) {
                    if(filterList.get(i).getCity_persian().contains(constraint))
                    {
                        POJO_Cities p=new POJO_Cities(filterList.get(i).getCity_persian(), filterList.get(i).getCountry(),filterList.get(i).getCity_code());

                        filters.add(p);
                    }
                }

                results.count=filters.size();
                results.values=filters;

            }else
            {
                results.count=filterList.size();
                results.values=filterList;

            }

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            // TODO Auto-generated method stub
            notifyDataSetChanged();
            list=(List<POJO_Cities>) results.values;

        }

    }
}
