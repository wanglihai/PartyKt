package com.wlh.partykt.mvp.splash.ui.activity;

import com.wlh.common.base.BaseMvpActivity;

import com.wlh.partykt.mvp.splash.contract.SplashContract;
import com.wlh.partykt.mvp.splash.presenter.SplashPresenter;
import com.wlh.partykt.mvp.splash.model.SplashModel;

import com.wlh.partykt.R;

/**
 * Created by on 09/18/2019 15:27
 * 版本: 1.0
 * 描述:
 * 修改说明:
 */
public class SplashActivity extends BaseMvpActivity<SplashModel, SplashContract.View, SplashPresenter> implements SplashContract.View {

    @Override
    public int onBindLayout() {
        return R.layout.activity_splash;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public SplashPresenter initPresenter() {
        return new SplashPresenter(this);
    }

}
