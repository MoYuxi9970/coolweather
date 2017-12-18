package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 32914 on 2017/12/18.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;//县的名称
    private String weatherId;//当前县的天气id
    private int cityId;//当前县所属市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
