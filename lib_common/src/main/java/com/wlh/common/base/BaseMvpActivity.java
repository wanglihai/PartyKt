package com.wlh.common.base;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.wlh.common.mvp.BaseModel;
import com.wlh.common.mvp.BasePresenter;

/**
 * Description: <BaseMvpActivity><br>
 * Author:      mxdl<br>
 * Date:        2018/1/16<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public abstract class BaseMvpActivity<M extends BaseModel, V, P extends BasePresenter<M, V>> extends BaseActivity {

    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        mPresenter = initPresenter();
        if (mPresenter != null) {
            mPresenter.attach((V) this);
            mPresenter.injectLifecycle(this);
        }
        super.onCreate(savedInstanceState);

    }

    public abstract P initPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detach();
        }
    }
}
