package com.wlh.partykt.mvp.audio.model;

import android.content.Context;

import com.wlh.common.mvp.BaseModel;
import com.wlh.partykt.mvp.audio.contract.AudioContract;

/**
 * Created by on 08/29/2019 15:58
 * 版本: 1.0
 * 描述:
 * 修改说明:
 */
public class AudioModel extends BaseModel implements AudioContract.Model {

    public AudioModel(Context context) {
        super(context);
    }
}