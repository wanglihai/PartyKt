package com.ole.life.mvp.splash.contract;

import com.wlh.common.mvp.BaseView;

/**
 * Created by on 10/15/2019 15:33
 * 版本: 1.0
 * 描述:
 * 修改说明:
 */
public interface SplashContract {

    interface Presenter {
        void initDelayTask();
    }

    interface View extends BaseView {

    }

    interface Model {
        void getImageUrl();
    }

}
