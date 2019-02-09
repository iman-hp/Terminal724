package ir.terminal724.www.terminal724.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ir.terminal724.www.terminal724.Public.Constants;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Service_Generator {
    public static Retrofit retrofit ;

    public static Endpoints apiInterface;
    public static Endpoints getRetrofit(){
        if (apiInterface == null) {
            OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            clientBuilder.addInterceptor(loggingInterceptor);

            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();

            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(clientBuilder.build())
                    .baseUrl(Constants.BASE_URL)
                    .build();
            apiInterface = retrofit.create(Endpoints.class);
        }
        return apiInterface;
}
}