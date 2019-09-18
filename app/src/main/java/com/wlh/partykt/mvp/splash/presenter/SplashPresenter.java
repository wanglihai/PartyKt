package com.wlh.partykt.mvp.splash.presenter;

import android.content.Context;

import com.wlh.common.mvp.BasePresenter;
import com.wlh.partykt.mvp.splash.contract.SplashContract;
import com.wlh.partykt.mvp.splash.model.SplashModel;

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
