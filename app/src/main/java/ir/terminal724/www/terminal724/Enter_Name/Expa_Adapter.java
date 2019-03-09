package ir.terminal724.www.terminal724.Enter_Name;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import org.angmarch.views.NiceSpinner;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import ir.hamsaa.persiandatepicker.Listener;
import ir.hamsaa.persiandatepicker.PersianDatePickerDialog;
import ir.hamsaa.persiandatepicker.util.PersianCalendar;
import ir.huri.jcal.JalaliCalendar;
import ir.terminal724.www.terminal724.MyView.My_Bold_TextView;
import ir.terminal724.www.terminal724.MyView.My_EditText;
import ir.terminal724.www.terminal724.MyView.My_Textview;
import ir.terminal724.www.terminal724.R;

public class Expa_Adapter extends RecyclerView.Adapter<Expa_Adapter.Holder>  {
    Context mContext;
    Expa_Adapter Expa_Adapter;



        public Expa_Adapter(Context mContext) {
            this.mContext = mContext;
            Expa_Adapter = this;

        }

        @NonNull
        @Override
        public Expa_Adapter.Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View v= LayoutInflater.from(mContext).inflate(R.layout.layout_expa_parent,viewGroup,false);
            Holder holder=new Holder(v);
            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull final Expa_Adapter.Holder holder, final int position) {
            final int type = ((Enter_Name_Activity) mContext).passengers.get(position).getType();
            if (type==1){
                holder.txtType.setText("بزرگسال");
                ((Enter_Name_Activity) mContext).passengers.get(position).setTypeName("ADL");
            }else if (type==2){
                holder.txtType.setText("خردسال");
                ((Enter_Name_Activity) mContext).passengers.get(position).setTypeName("CHD");
            }else {
                ((Enter_Name_Activity) mContext).passengers.get(position).setTypeName("INF");
                holder.txtType.setText("نوزاد");
                holder.linearBirthday_show.setVisibility(View.VISIBLE);

            }

            if (position==0){
                holder.linearChild.setVisibility(View.VISIBLE);
            }

            holder.btnBirthday.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    JalaliCalendar jalaliCalendar = new JalaliCalendar(new Date());
                    int maxYear= jalaliCalendar.getYear();
                    int minYear = 1200;

                    if (type == 3) {
                        minYear =  jalaliCalendar.getYear()- 1;
                    }else if(type==2){
                        maxYear = jalaliCalendar.getYear()- 2;
                        minYear =  jalaliCalendar.getYear()- 11;
                    }else {
                        maxYear=jalaliCalendar.getYear()- 11;
                        minYear = 1200;
                    }

                    PersianDatePickerDialog picker = new PersianDatePickerDialog(mContext)
                            .setPositiveButtonString("باشه")
                            .setNegativeButton("بیخیال")
                            .setTodayButton("امروز")
                            .setTodayButtonVisible(true)
//                        .setInitDate(initDate)
                            .setMaxYear(maxYear)
                            .setMinYear(minYear)
                            .setActionTextColor(Color.GRAY)
//                        .setTypeFace(typeface)
                            .setListener(new Listener() {
                                @Override
                                public void onDateSelected(PersianCalendar persianCalendar) {

                                    holder.txtBirthday.setText(persianCalendar.getPersianYear() + "/" + persianCalendar.getPersianMonth() + "/" + persianCalendar.getPersianDay()+"");
                                    Passenger pas = ((Enter_Name_Activity) mContext).passengers.get(position);
                                    pas.setBirthday(persianCalendar.getPersianYear() + "/" + persianCalendar.getPersianMonth() + "/" + persianCalendar.getPersianDay()+"");
                                    ((Enter_Name_Activity)mContext).passengers.set(position,pas);
                                }

                                @Override
                                public void onDismissed() {

                                }
                            });

                    picker.show();
                }
            });
//            String[] itemMajor = new String[]{"اقا", "خانم"};
//            String[] itemNational = new String[]{"ایرانی", "غیر ایرانی"};
            holder.txt_name_passengers_en.setText("مسافر"+""+(position+1));
//            ArrayAdapter<String> adapter = new ArrayAdapter<>(mContext, android.R.layout.simple_spinner_dropdown_item, itemMajor);
//            ArrayAdapter<String> adapter1 = new ArrayAdapter<>(mContext, android.R.layout.simple_spinner_dropdown_item, itemNational);
////set the spinners adapter to the previously created one.
//            holder.spinner_sex.setAdapter(adapter);
//            holder.spinner_religion.setAdapter(adapter1);
            List<String> dataset_sex = new LinkedList<>(Arrays.asList("آقا", "خانم"));
            holder.spinner_sex.attachDataSource(dataset_sex);
            List<String> dataset_religion = new LinkedList<>(Arrays.asList("ایرانی", "غیرایرانی"));
            holder.spinner_religion.attachDataSource(dataset_religion);
            holder.spinner_sex.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position1, long id) {

                    Passenger pas = ((Enter_Name_Activity) mContext).passengers.get(position);
                    if (parent.getSelectedItem().toString().equals("اقا")){
                        pas.setMajor(true);
                    }else {
                        pas.setMajor(false);
                    }

                    ((Enter_Name_Activity)mContext).passengers.set(position,pas);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            holder.spinner_religion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position1, long id) {

                    Passenger pas = ((Enter_Name_Activity) mContext).passengers.get(position);
                    if (parent.getSelectedItem().toString().equals("ایرانی")){
                        holder.code_meli.setHint("کد ملی");
                        pas.setNationality(true);
                    }else if(parent.getSelectedItem().toString().equals("غیرایرانی")) {
                        holder.code_meli.setHint("شماره پاسپورت");
                        pas.setNationality(false);
                    }

                    ((Enter_Name_Activity)mContext).passengers.set(position,pas);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            holder.edt_family_en.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    Passenger pas = ((Enter_Name_Activity) mContext).passengers.get(position);
                    pas.setLastName(s+"");
                    ((Enter_Name_Activity)mContext).passengers.set(position,pas);
                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });

            holder.edt_name_en.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                    Passenger pas = ((Enter_Name_Activity) mContext).passengers.get(position);
                    pas.setName(s+"");
                    ((Enter_Name_Activity)mContext).passengers.set(position,pas);

                }

                @Override
                public void afterTextChanged(Editable s) {

                }

            });
            holder.code_meli.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                    if (!s.toString().isEmpty()){
                        Passenger pas = ((Enter_Name_Activity) mContext).passengers.get(position);
                        pas.setId(s.toString());
                        ((Enter_Name_Activity)mContext).passengers.set(position,pas);

                    }

                }

                @Override
                public void afterTextChanged(Editable s) {

                }

            });
            holder.linearShow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (holder.linearChild.getVisibility()==View.GONE){
                        holder.linearChild.setVisibility(View.VISIBLE);

                        int size = ((Enter_Name_Activity) mContext).passengers.size();
                        for (int i = 0;i<size;i++){
                            if (holder.getPosition()!=i){

                                RecyclerView.LayoutManager layoutManager = ((Enter_Name_Activity)mContext).recycler_expa.getLayoutManager();
                                View view = layoutManager.findViewByPosition(i);
                                LinearLayout linearChild = view.findViewById(R.id.linear_expa_layout);
                                linearChild.setVisibility(View.GONE);

                            }

                        }


                    }else {
                        holder.linearChild.setVisibility(View.GONE);
//
                        boolean majorMr = false;

                        boolean iran = true;


                    }
                }
            });
        }



        @Override
        public int getItemCount() {

            return ((Enter_Name_Activity) mContext).passengers.size();
        }

        public class Holder extends RecyclerView.ViewHolder {
            My_Textview txtBirthday;
            ImageView btnBirthday;
            My_EditText code_meli;
            My_EditText edt_name_en;
            My_EditText edt_family_en;
            NiceSpinner spinner_religion;
            NiceSpinner spinner_sex;
            My_Textview txtType;

            My_Bold_TextView txt_name_passengers_en;




LinearLayout linearBirthday_show;
            RelativeLayout linearShow;
            LinearLayout linearChild;

            public Holder(@NonNull View itemView) {
                super(itemView);
                linearChild = itemView.findViewById(R.id.linear_expa_layout);
                linearShow = itemView.findViewById(R.id.linear_expa_show_child);
                edt_name_en=itemView.findViewById(R.id.edt_name_ec);
//                txt_name_passengers_en=itemView.findViewById(R.id.edt_family_ec);
                edt_family_en=itemView.findViewById(R.id.edt_family_ec);
                code_meli=itemView.findViewById(R.id.edt_code_meli_ec);
                spinner_religion=itemView.findViewById(R.id.religion_spinner_en);
                spinner_sex=itemView.findViewById(R.id.sex_spinner_en);
                txt_name_passengers_en=itemView.findViewById(R.id.txt_name_passengers_en);
                txtType=itemView.findViewById(R.id.txt_age_ep);
                btnBirthday=itemView.findViewById(R.id.img_select_birthday);
                txtBirthday=itemView.findViewById(R.id.txt_birthday_ec);
                linearBirthday_show=itemView.findViewById(R.id.linearBirthday_show);

            }
        }
    }

