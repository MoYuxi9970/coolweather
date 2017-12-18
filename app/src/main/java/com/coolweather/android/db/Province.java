package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 32914 on 2017/12/18.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;//记录省的名称
    private int provinceCode;//记录省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
