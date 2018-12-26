package com.example.amikom.pamarrayretrofit.Apis;

import com.example.amikom.pamarrayretrofit.Model.ModelListData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by amikom on 26/12/2018.
 */

@SuppressWarnings("unused")
public interface ApiInterface {
    @GET("bins/xavu8")
    Call<List<ModelListData>> ambildata();
}
