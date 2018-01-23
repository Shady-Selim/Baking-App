package com.shady_selim.bakingapp;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by Shady on 9/10/2017.
 */

public interface iAPI {
    @GET("2017/May/59121517_baking/baking.json")
    Call<ArrayList<Recipes>> listRecipes();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://d17h27t6h515a5.cloudfront.net/topher/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
