package com.wlh.partykt.mvp.video.ui.activity;

import com.wlh.common.base.BaseMvpActivity;

import com.wlh.partykt.mvp.video.contract.VideoContract;
import com.wlh.partykt.mvp.video.presenter.VideoPresenter;
import com.wlh.partykt.mvp.video.model.VideoModel;

import com.wlh.partykt.R;

/**
 * Created by on 08/29/2019 15:57
 * 版本: 1.0
 * 描述:
 * 修改说明:
 */
public class VideoActivity extends BaseMvpActivity<VideoModel, VideoContract.View, VideoPresenter> implements VideoContract.View {

    @Override
    public int onBindLayout() {
        return R.layout.activity_video;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public VideoPresenter initPresenter() {
        return new VideoPresenter(this);
    }

}
