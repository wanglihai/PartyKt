package com.wlh.partykt.mvp.audio.ui.activity;

import com.wlh.common.base.BaseMvpActivity;

import com.wlh.partykt.mvp.audio.contract.AudioContract;
import com.wlh.partykt.mvp.audio.presenter.AudioPresenter;
import com.wlh.partykt.mvp.audio.model.AudioModel;

import com.wlh.partykt.R;

/**
 * Created by on 08/29/2019 15:58
 * 版本: 1.0
 * 描述:
 * 修改说明:
 */
public class AudioActivity extends BaseMvpActivity<AudioModel, AudioContract.View, AudioPresenter> implements AudioContract.View {

    @Override
    public int onBindLayout() {
        return R.layout.activity_audio;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public AudioPresenter initPresenter() {
        return new AudioPresenter(this);
    }

}
