package com.ole.life.mvp.splash.ui.activity

import com.ole.common.base.BaseMvpActivity

import com.ole.life.mvp.splash.contract.SplashContract
import com.ole.life.mvp.splash.presenter.SplashPresenter
import com.ole.life.mvp.splash.model.SplashModel

import com.ole.life.R

/**
 * Created by on 09/18/2019 15:27
 * 版本: 1.0
 * 描述:
 * 修改说明:
 */
class SplashActivity : BaseMvpActivity<SplashModel, SplashContract.View, SplashPresenter>(), SplashContract.View {

    override fun onBindLayout(): Int {
        return R.layout.activity_splash
    }

    override fun initView() {

    }

    override fun initData() {

    }

    override fun initPresenter(): SplashPresenter {
        return SplashPresenter(this)
    }

}
