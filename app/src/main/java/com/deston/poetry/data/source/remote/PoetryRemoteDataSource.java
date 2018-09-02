package com.deston.poetry.data.source.remote;

import com.deston.poetry.data.source.PoetryDataSource;
import com.deston.poetry.home.api.HomeAPI;
import com.deston.poetry.home.api.entity.HomePoemEntity;
import com.deston.poetry.net.HttpClient;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Retrofit;

public class PoetryRemoteDataSource implements PoetryDataSource {
    @Override
    public HomePoemEntity getHomePoems() throws IOException {
        HomeAPI api = HttpClient.createAPI(HomeAPI.class);
        Call<HomePoemEntity> call = api.getHomePoems();
        return call.execute().body();
    }
}
