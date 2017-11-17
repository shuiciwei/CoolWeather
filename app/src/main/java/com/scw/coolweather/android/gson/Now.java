package com.scw.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by scw on 2017/11/17.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
