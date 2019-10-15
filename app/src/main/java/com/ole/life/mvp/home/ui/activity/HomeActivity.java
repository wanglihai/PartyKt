package com.ole.life.mvp.home.ui.activity;

import android.os.Process;
import android.view.KeyEvent;

import com.ole.life.R;
import com.ole.life.mvp.home.contract.HomeContract;
import com.ole.life.mvp.home.model.HomeModel;
import com.wlh.common.base.BaseMvpActivity;

import com.ole.life.mvp.home.presenter.HomePresenter;
import com.wlh.common.util.ToastUtil;

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
    public boolean enableToolbar() {
        return false;
    }

//    @Override
//    public String getTootBarTitle() {
//        return "主页";
//    }
//
//    @Override
//    public int onBindToolbarLayout() {
//        return R.layout.common_toolbar_leftbtn;
//    }

    private long exitTime;
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK
                && event.getAction() == KeyEvent.ACTION_DOWN) {
            if ((System.currentTimeMillis() - exitTime) > 2000) {
                ToastUtil.showToast(R.string.exit_app);
                exitTime = System.currentTimeMillis();
            } else {
                finish();
                System.exit(0);
                Process.killProcess(Process.myPid());
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
