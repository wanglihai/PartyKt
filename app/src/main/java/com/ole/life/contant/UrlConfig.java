package com.ole.life.contant;


import com.wlh.common.BuildConfig;

public class UrlConfig {

    public static String BASE_URL = "";
    public static String BASE_H5_URL = "";

    public static String BASE_NEW_URL = "";
    public static String BASE_NEW_H5_URL = "";

    /**
     * 配置网络地址
     */
    public static  void httpUrlConfig(){
        if (BuildConfig.DEBUG) {
            BASE_URL ="http://test.api.ppparty.cn";
            BASE_H5_URL ="http://t.ppparty.cn/test";
            BASE_NEW_URL ="http://api.shop.ppparty.cn";  //测试环境
//            BASE_NEW_URL="http://api.testshop.ppparty.cn";  //预生产环境
            BASE_NEW_H5_URL ="http://test.h5.oleip.io";
        } else {
            BASE_URL ="http://ole.api.ppparty.cn";
            BASE_H5_URL ="http://t.ppparty.cn/prod";
            BASE_NEW_URL ="http://api.oleshop.ppparty.cn";
            BASE_NEW_H5_URL ="http://t.ppparty.cn/test";
        }
    }

}
