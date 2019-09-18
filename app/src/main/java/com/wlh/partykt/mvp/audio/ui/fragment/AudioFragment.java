package com.wlh.partykt.mvp.audio.ui.fragment;

import android.view.View;

import com.wlh.common.base.BaseMvpFragment;
import com.wlh.partykt.mvp.audio.contract.AudioContract;
import com.wlh.partykt.mvp.audio.model.AudioModel;
import com.wlh.partykt.mvp.audio.presenter.AudioPresenter;

import com.wlh.partykt.R;

/**
 * Created by on 08/29/2019 15:58
 * 版本: 1.0
 * 描述:
 * 修改说明:
 */
public class AudioFragment extends BaseMvpFragment<AudioModel, AudioContract.View, AudioPresenter> implements AudioContract.View {

    @Override
    public int onBindLayout() {
        return R.layout.fragment_audio;
    }

    @Override
    public void initView(View view) {

    }

    @Override
    public void initData() {

    }

    @Override
    public String getToolbarTitle() {
        return null;
    }

    @Override
    public AudioPresenter initPresenter() {
        return new AudioPresenter(mActivity);
    }
}
