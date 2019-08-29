package com.wlh.olelive.mvp.audio.presenter;

import android.content.Context;

import com.wlh.common.mvp.BasePresenter;
import com.wlh.olelive.mvp.audio.contract.AudioContract;
import com.wlh.olelive.mvp.audio.model.AudioModel;

/**
 * Created by on 08/29/2019 15:58
 * 版本: 1.0
 * 描述:
 * 修改说明:
 */
public class AudioPresenter extends BasePresenter<AudioModel, AudioContract.View> implements AudioContract.Presenter {

    public AudioPresenter(Context context) {
        super(context);
    }

    @Override
    public AudioModel initModel() {
        return new AudioModel(mContext);
    }

}
