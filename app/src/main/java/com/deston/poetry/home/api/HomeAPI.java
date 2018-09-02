package com.deston.poetry.home.api;


import com.deston.poetry.home.api.entity.HomePoemEntity;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HomeAPI {
    @GET
    public Call<HomePoemEntity> getHomePoems();
}
