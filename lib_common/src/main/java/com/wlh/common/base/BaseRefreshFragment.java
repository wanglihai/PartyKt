package com.wlh.common.base;

import android.support.annotation.NonNull;
import android.view.View;

import com.wlh.common.mvp.BaseModel;
import com.wlh.common.mvp.BaseRefreshPresenter;
import com.wlh.common.mvp.BaseRefreshView;
import com.wlh.common.util.log.KLog;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

/**
 * Description: <下拉刷新、上拉加载更多的Fragment><br>
 * Author:      mxdl<br>
 * Date:        2018/2/25<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public abstract class BaseRefreshFragment<M extends BaseModel,V extends BaseRefreshView<T>,P extends BaseRefreshPresenter<M,V,T>,T> extends BaseMvpFragment<M,V,P> implements BaseRefreshView<T> {
    protected SmartRefreshLayout mRefreshLayout;

    @Override
    public void initCommonView(View view) {
        super.initCommonView(view);
        initRefreshView(view);
    }

    public void initRefreshView(View view) {
        mRefreshLayout = view.findViewById(onBindRreshLayout());
        mRefreshLayout.setEnableLoadMoreWhenContentNotFull(false);
        mRefreshLayout.setDisableContentWhenLoading(false);
        mRefreshLayout.setDisableContentWhenRefresh(false);
        // 下拉刷新
        mRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                onRefreshEvent();
            }
        });
        // 上拉加载
        mRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                onLoadMoreEvent();
            }
        });
    }
    protected abstract int onBindRreshLayout();
    @Override
    public void enableRefresh(boolean b) {
        mRefreshLayout.setEnableRefresh(b);
    }

    @Override
    public void enableLoadMore(boolean b) {
        mRefreshLayout.setEnableLoadMore(b);
    }

    @Override
    public void enableAutoLoadData(boolean b) {
        if (b) {
            mRefreshLayout.autoRefresh();
        }
    }

    @Override
    public void stopRefresh() {
        mRefreshLayout.finishRefresh();
    }

    @Override
    public void stopLoadMore() {
        mRefreshLayout.finishLoadMore();
    }

}
