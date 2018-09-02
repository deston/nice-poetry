package com.deston.poetry.net;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpClient {
    public static String API_URL = "";
    private static Retrofit sRetrofit;
    public static void init() {
        sRetrofit = new Retrofit.Builder()
                .baseUrl(API_URL).client(new OkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static <T> T createAPI(final Class<T> service) {
        return sRetrofit.create(service);
    }

}
