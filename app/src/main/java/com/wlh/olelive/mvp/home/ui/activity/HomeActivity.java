package com.wlh.olelive.mvp.home.ui.activity;

import android.widget.Toolbar;

import com.wlh.common.base.BaseMvpActivity;

import com.wlh.olelive.mvp.home.contract.HomeContract;
import com.wlh.olelive.mvp.home.presenter.HomePresenter;
import com.wlh.olelive.mvp.home.model.HomeModel;

import com.wlh.olelive.R;

/**
 * Created by on 08/29/2019 16:04
 * 版本: 1.0
 * 描述:
 * 修改说明:
 */
public class HomeActivity extends BaseMvpActivity<HomeModel, HomeContract.View, HomePresenter> implements HomeContract.View {

    @Override
    public int onBindLayout() {
        return R.layout.activity_home;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public HomePresenter initPresenter() {
        return new HomePresenter(this);
    }

    @Override
    public String getTootBarTitle() {
        return "主页";
    }

    @Override
    public int onBindToolbarLayout() {
        return R.layout.common_toolbar_leftbtn;
    }
}
