package com.files.netzarytest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RClient {
    private static final String BASE_URL = "https://milkiyat.bangalore2.com/api/";
    public static Retrofit retrofit;

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
