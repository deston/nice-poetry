package com.deston.poetry.utils;

import android.content.Context;

import com.deston.poetry.PoetryApplication;

/**
 * Created by liudatong on 2018/8/15
 */
public class DeviceUtil {
    public static int dp2px(float dp) {
        float scale = PoetryApplication.app.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }
}
