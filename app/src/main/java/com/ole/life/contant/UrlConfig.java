package com.ole.life.contant;


import com.ole.life.http.model.HttpHeaders;
import com.wlh.common.BaseApplication;
import com.wlh.common.BuildConfig;
import com.wlh.common.util.AppTools;
import com.wlh.common.util.SPUtils;


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

    /**
     * 配置请求头
     * @return
     */
    public static HttpHeaders getCommonHeaders() {
        HttpHeaders  httpHeaders= new HttpHeaders();
        httpHeaders.put("Content-Type", "application/json");
        httpHeaders.put("Charset", "utf-8");
        httpHeaders.put("Authorization", SPUtils.getString(SpContant.USER_TOKEN));
        httpHeaders.put("Uid", SPUtils.getString(SpContant.USER_UID));
        httpHeaders.put("Version", AppTools.getVersionName(BaseApplication.getInstance()));
        httpHeaders.put("Device", AppTools.getDeviceId(BaseApplication.getInstance()));
        httpHeaders.put("AppId", "3");
        httpHeaders.put("Phonemodel", AppTools.getSystemModel());
        httpHeaders.put("Phonesystem", AppTools.getSystemVersion());
        return httpHeaders;
    }

}
