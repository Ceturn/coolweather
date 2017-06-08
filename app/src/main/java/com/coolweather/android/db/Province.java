package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/6/7.
 */

public class Province extends DataSupport {
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

    public int getProvimceCode() {
        return provinceCode;
    }

    public void setProvimceCode(int provimceCode) {
        this.provinceCode = provimceCode;
    }

    private int id;
    private String provinceName;
    private int provinceCode;
}
