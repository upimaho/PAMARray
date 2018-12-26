package com.example.amikom.pamarrayretrofit.Apis;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by amikom on 26/12/2018.
 */

@SuppressWarnings("unused")
public class ApiService {
    private static Retrofit retrofit ;
    private  static final String BASE_URL = "https://api.myjson.com/";

    public static Retrofit getDataPemain(){
        if (retrofit == null){
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
