package ir.terminal724.www.terminal724.SplashScreen;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import ir.terminal724.www.terminal724.Main.MainActivity;
import ir.terminal724.www.terminal724.Public.BaseActivity;
import ir.terminal724.www.terminal724.R;

public class Splash_Screen extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
        goToMain();
    }
    void goToMain(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(mContext,MainActivity.class);
                startActivity(intent);
            }
        },2000);


    }
}
