package com.yq.coolweather.gson;

/**
 * Created by yq on 2018/4/10.
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;
        public String pm25;
    }
}
