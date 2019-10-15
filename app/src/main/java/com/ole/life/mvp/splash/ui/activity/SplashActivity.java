package com.ole.life.mvp.splash.ui.activity;

import com.ole.life.R;
import com.ole.life.mvp.splash.contract.SplashContract;
import com.ole.life.mvp.splash.model.SplashModel;
import com.ole.life.mvp.splash.presenter.SplashPresenter;
import com.wlh.common.base.BaseMvpActivity;



/**
 * Created by on 10/15/2019 15:33
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
