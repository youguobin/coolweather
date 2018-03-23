package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yougb on 2018/3/22.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temprature temprature;

    @SerializedName("cond")
    public More more;

    public class Temprature {
        public String max;

        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }

}
