package com.ole.common.mvp;

import android.content.Context;

import com.trello.rxlifecycle2.LifecycleProvider;

/**
 * Description: <BaseModel><br>
 * Author:      mxdl<br>
 * Date:        2018/3/18<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class BaseModel {

    private Context mContext;

    private LifecycleProvider lifecycle;

    public BaseModel(Context context) {
        mContext = context;
    }

    public void injectLifecycle(LifecycleProvider lifecycle) {
        this.lifecycle = lifecycle;
    }

    public LifecycleProvider getLifecycle() {
        return lifecycle;
    }

    public Context getContext() {
        return mContext;
    }

    public void destory() {

    }
}
