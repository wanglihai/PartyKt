package com.ole.life.mvp.splash.ui.activity;

import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ole.life.R;
import com.ole.life.mvp.splash.contract.SplashContract;
import com.ole.life.mvp.splash.model.SplashModel;
import com.ole.life.mvp.splash.presenter.SplashPresenter;
import com.wlh.common.base.BaseMvpActivity;
import com.wlh.common.util.GlideUtils;
import com.wlh.common.util.ToastUtil;
import com.wlh.common.util.statusbar.StatusBarUtil;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by on 10/15/2019 15:33
 * 版本: 1.0
 * 描述:
 * 修改说明:
 */
public class SplashActivity extends BaseMvpActivity<SplashModel, SplashContract.View, SplashPresenter> implements SplashContract.View {

    @BindView(R.id.iv_git)
    ImageView ivGit;
    @BindView(R.id.iv_enter)
    ImageView ivEnter;
    @BindView(R.id.tv_jump)
    TextView tvJump;

    @Override
    public int onBindLayout() {
        return R.layout.activity_splash;
    }

    @Override
    public void initView() {
        StatusBarUtil.setStatusOvr(this, false);
        GlideUtils.loadGif(this,R.drawable.icon_gif,ivGit);
    }

    @Override
    public void initData() {
        mPresenter.initDelayTask();
    }

    @OnClick({R.id.iv_enter, R.id.tv_jump})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_enter:
                break;
            case R.id.tv_jump:
                break;
        }
    }

    @Override
    public SplashPresenter initPresenter() {
        return new SplashPresenter(this);
    }

    @Override
    public boolean enableToolbar() {
        return false;
    }

    private long exitTime;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK
                && event.getAction() == KeyEvent.ACTION_DOWN) {
            if ((System.currentTimeMillis() - exitTime) > 2000) {
                ToastUtil.showToast(R.string.exit_app);
                exitTime = System.currentTimeMillis();
            } else {
                finish();
                System.exit(0);
                Process.killProcess(Process.myPid());
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}
