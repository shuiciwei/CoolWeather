package com.scw.coolweather.android;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;

/**
 * Created by scw on 2017/11/17.
 */

public class MyApplication extends Application {
    private static Context context;
    @Override
    public void onCreate(){
        super.onCreate();
        context = getApplicationContext();
        LitePalApplication.initialize(context);
    }
    public static Context getContext(){
        return context;
    }
}
