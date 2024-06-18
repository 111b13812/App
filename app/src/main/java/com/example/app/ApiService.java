package com.example.app.api;

import com.example.app.DataResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("A01010000C-000674-011")
    Call<DataResponse> getSpeedEnforcementLocations();
}
