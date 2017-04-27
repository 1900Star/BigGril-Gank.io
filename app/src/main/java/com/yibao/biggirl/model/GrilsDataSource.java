package com.yibao.biggirl.model;

import com.yibao.biggirl.model.girls.GirlBean;

/**
 * Author：Sid
 * Des：${TODO}
 * Time:2017/4/25 22:59
 */
public interface GrilsDataSource {
    //这个接口用于将数据回调给对应Presenter层
    interface LoadGDataCallback {
        void onLoadDatas(GirlBean girlBean);

        void onDataNotAvailable();

    }

    void getGirls(int size, int page, LoadGDataCallback callback);

}