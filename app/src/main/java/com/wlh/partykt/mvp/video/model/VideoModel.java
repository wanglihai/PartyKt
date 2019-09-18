package com.wlh.partykt.mvp.video.model;

import android.content.Context;

import com.wlh.common.mvp.BaseModel;
import com.wlh.partykt.mvp.video.contract.VideoContract;

/**
 * Created by on 08/29/2019 15:57
 * 版本: 1.0
 * 描述:
 * 修改说明:
 */
public class VideoModel extends BaseModel implements VideoContract.Model {

    public VideoModel(Context context) {
        super(context);
    }
}