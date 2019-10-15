package com.ole.life.mvp.home.presenter;

import android.content.Context;

import com.ole.life.mvp.home.contract.HomeContract;
import com.ole.life.mvp.home.model.HomeModel;
import com.wlh.common.mvp.BasePresenter;

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
