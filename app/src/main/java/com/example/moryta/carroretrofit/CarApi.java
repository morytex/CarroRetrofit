package com.example.moryta.carroretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by logonrm on 19/06/2017.
 */

public interface CarApi {

    @POST("/cars")
    Call<Void> save(@Body Car car);

    @GET("/cars")
    Call<List<Car>> getAll();

}
