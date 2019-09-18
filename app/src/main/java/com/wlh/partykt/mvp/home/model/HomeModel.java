package com.wlh.partykt.mvp.home.model;

import android.content.Context;

import com.wlh.common.mvp.BaseModel;
import com.wlh.partykt.mvp.home.contract.HomeContract;

/**
 * Created by on 08/29/2019 16:04
 * 版本: 1.0
 * 描述:
 * 修改说明:
 */
public class HomeModel extends BaseModel implements HomeContract.Model {

    public HomeModel(Context context) {
        super(context);
    }
}