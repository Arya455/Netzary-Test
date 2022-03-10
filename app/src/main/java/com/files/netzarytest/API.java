package com.files.netzarytest;


import com.files.netzarytest.models.ResMain;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {
    @GET("home/")
    Call<ResMain> getData();
}