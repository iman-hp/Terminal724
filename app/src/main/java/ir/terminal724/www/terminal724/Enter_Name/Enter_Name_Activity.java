package ir.terminal724.www.terminal724.Enter_Name;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.angmarch.views.NiceSpinner;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import ir.terminal724.www.terminal724.R;

public class Enter_Name_Activity extends AppCompatActivity {
NiceSpinner sex_spinner_en;
NiceSpinner religion_spinner_en;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter__name_);
        bind();
        sex_Spinner();
        religion_Spinner();

    }
    void bind(){
        sex_spinner_en =findViewById(R.id.sex_spinner_en);
        religion_spinner_en =findViewById(R.id.religion_spinner_en);

    }
    void sex_Spinner(){
        List<String> dataset_sex = new LinkedList<>(Arrays.asList("آقا", "خانم"));
        sex_spinner_en.attachDataSource(dataset_sex);
    }
    void religion_Spinner(){
        List<String> dataset_religion = new LinkedList<>(Arrays.asList("ایرانی", "غیرایرانی"));
        religion_spinner_en.attachDataSource(dataset_religion);
    }


}
