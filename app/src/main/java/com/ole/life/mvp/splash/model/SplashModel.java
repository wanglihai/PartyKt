package com.ole.life.mvp.splash.model;

import android.content.Context;

import com.ole.life.mvp.splash.contract.SplashContract;

import com.wlh.common.mvp.BaseModel;


/**
 * Created by on 10/15/2019 15:33
 * 版本: 1.0
 * 描述:
 * 修改说明:
 */
public class SplashModel extends BaseModel implements SplashContract.Model {

    public SplashModel(Context context) {
        super(context);
    }

    @Override
    public void getImageUrl() {
//        EasyHttp.post(UrlContants.PEOPLE_GETLAUCH)
//                .execute(new CallBackProxy<CustomApiResult<String>, String>(new SimpleCallBack<String>() {
//                    @Override
//                    public void onError(ApiException e) {
//
//                    }
//
//                    @Override
//                    public void onSuccess(String s) {
//
//                    }
//                }){
//
//                } );
    }
}