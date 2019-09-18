package com.wlh.partykt.mvp.video.presenter;

import android.content.Context;

import com.wlh.common.mvp.BasePresenter;
import com.wlh.partykt.mvp.video.contract.VideoContract;
import com.wlh.partykt.mvp.video.model.VideoModel;

/**
 * Created by on 08/29/2019 15:57
 * 版本: 1.0
 * 描述:
 * 修改说明:
 */
public class VideoPresenter extends BasePresenter<VideoModel, VideoContract.View> implements VideoContract.Presenter {

    public VideoPresenter(Context context) {
        super(context);
    }

    @Override
    public VideoModel initModel() {
        return new VideoModel(mContext);
    }

}
