package com.ole.life.mvp.splash.presenter;

import android.content.Context;
import android.os.Handler;

import com.ole.life.mvp.splash.contract.SplashContract;
import com.wlh.common.mvp.BasePresenter;
import com.ole.life.mvp.splash.model.SplashModel;



/**
 * Created by on 10/15/2019 15:33
 * 版本: 1.0
 * 描述:
 * 修改说明:
 */
public class SplashPresenter extends BasePresenter<SplashModel, SplashContract.View> implements SplashContract.Presenter {

    public SplashPresenter(Context context) {
        super(context);
    }

    @Override
    public SplashModel initModel() {
        return new SplashModel(mContext);
    }

    @Override
    public void initDelayTask() {
        new Handler(mContext.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        }, 1500);//3秒
    }
}
