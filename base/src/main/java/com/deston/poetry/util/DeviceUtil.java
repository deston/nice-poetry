package com.deston.poetry.util;

import android.content.Context;

import com.deston.poetry.App;


/**
 * Created by deston on 2018/8/15
 */
public class DeviceUtil {
    public static int dp2px(float dp) {
        float scale = App.getContext().getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }
}
