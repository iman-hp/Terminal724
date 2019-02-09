package ir.terminal724.www.terminal724.Public;

import android.content.Context;
import android.preference.PreferenceManager;
import android.widget.Toast;

import com.google.gson.Gson;

import static ir.terminal724.www.terminal724.Public.tmpApplication.context;

public class PublicMethods {


    public static void Toast(Context mContext, String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_LONG).show();
    }

    public static void saveValue(Context mContext, String key, String value) {
        PreferenceManager.getDefaultSharedPreferences(mContext).edit().putString(key, value).apply();
    }

    public static String getValue(Context mContext,String key, String def) {
       String value= PreferenceManager.getDefaultSharedPreferences(mContext).getString(key,def);
    return value;
    }
}