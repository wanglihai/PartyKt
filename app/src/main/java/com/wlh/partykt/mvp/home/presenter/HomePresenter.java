package com.wlh.partykt.mvp.home.presenter;

import android.content.Context;

import com.wlh.common.mvp.BasePresenter;
import com.wlh.partykt.mvp.home.contract.HomeContract;
import com.wlh.partykt.mvp.home.model.HomeModel;

/**
 * Created by on 08/29/2019 16:04
 * 版本: 1.0
 * 描述:
 * 修改说明:
 */
public class HomePresenter extends BasePresenter<HomeModel, HomeContract.View> implements HomeContract.Presenter {

    public HomePresenter(Context context) {
        super(context);
    }

    @Override
    public HomeModel initModel() {
        return new HomeModel(mContext);
    }

}
