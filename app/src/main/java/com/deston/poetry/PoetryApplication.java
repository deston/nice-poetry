package com.deston.poetry;

import android.app.Application;

/**
 * Created by liudatong on 2018/8/15
 */
public class PoetryApplication extends Application {
    public static Application app;
    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }
}
