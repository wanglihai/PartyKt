package com.wlh.partykt.mvp.splash.ui.activity

import com.wlh.common.base.BaseMvpActivity

import com.wlh.partykt.mvp.splash.contract.SplashContract
import com.wlh.partykt.mvp.splash.presenter.SplashPresenter
import com.wlh.partykt.mvp.splash.model.SplashModel

import com.wlh.partykt.R

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
