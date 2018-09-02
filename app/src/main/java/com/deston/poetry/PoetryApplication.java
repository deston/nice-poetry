package com.deston.poetry;


import com.deston.poetry.net.HttpClient;

/**
 * Created by deston on 2018/8/15
 */
public class PoetryApplication extends App {
    @Override
    public void onCreate() {
        super.onCreate();
        HttpClient.init();
    }
}
