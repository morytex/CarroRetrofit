package com.example.moryta.carroretrofit;

/**
 * Created by logonrm on 19/06/2017.
 */

public class ApiUtils {
    public ApiUtils() {
    }

    public static final String BASE_URL = "http://10.3.1.6:3000";

    public static CarApi getCarApiService() {
        return RetrofitClient.getClient(BASE_URL).create(CarApi.class);
    }
}
