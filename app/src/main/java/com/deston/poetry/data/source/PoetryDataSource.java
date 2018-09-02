package com.deston.poetry.data.source;

import com.deston.poetry.home.api.entity.HomePoemEntity;

import java.io.IOException;

public interface PoetryDataSource {
    public HomePoemEntity getHomePoems() throws IOException;
}
