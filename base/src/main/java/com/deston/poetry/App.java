package com.deston.poetry;

import android.app.Application;
import android.content.Context;

/**
 * Created by deston on 2018/8/23
 */
public class App extends Application {
    private static Context mApplication;
    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
    }
    public static Context getContext() {
        return mApplication;
    }
}
