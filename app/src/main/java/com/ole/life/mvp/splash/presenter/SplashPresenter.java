package com.ole.life.mvp.splash.presenter;

import android.content.Context;

import com.ole.common.mvp.BasePresenter;
import com.ole.life.mvp.splash.contract.SplashContract;
import com.ole.life.mvp.splash.model.SplashModel;

/**
 * Created by on 09/18/2019 15:27
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

}
