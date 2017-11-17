package com.scw.coolweather.android.gson;

/**
 * Created by scw on 2017/11/17.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
