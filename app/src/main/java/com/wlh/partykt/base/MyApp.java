package com.wlh.partykt.base;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;

import com.wlh.common.BaseApplication;
import com.wlh.common.util.log.KLog;
import com.wlh.common.util.log.KLogUtil;
import com.wlh.partykt.config.AutoSizeConfigUtil;
import com.wlh.partykt.utils.EasyHttpUtils;

import java.util.Locale;

import me.jessyan.autosize.AutoSize;
import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.external.ExternalAdaptInfo;
import me.jessyan.autosize.external.ExternalAdaptManager;
import me.jessyan.autosize.internal.CustomAdapt;
import me.jessyan.autosize.onAdaptListener;

/**
 * 时间: 2019-08-2716:03
 * 版本: 1.0
 * 描述:
 * 修改说明:
 */
public class MyApp extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        //https://github.com/zhou-you/RxEasyHttp
        EasyHttpUtils.init(this);
        AutoSizeConfigUtil.setAutoSizeConfig(this);
    }

    /**
     * 设置字体大小不随系统设置而改变
     *
     * @param newConfig
     */
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        if (newConfig.fontScale != 1)//非默认值
            getResources();
        super.onConfigurationChanged(newConfig);
    }

    /**
     * 设置字体默认值
     *
     * @return
     */
    @Override
    public Resources getResources() {
        Resources res = super.getResources();
        if (res.getConfiguration().fontScale != 1) {//非默认值
            Configuration newConfig = new Configuration();
            newConfig.setToDefaults();//设置默认
            res.updateConfiguration(newConfig, res.getDisplayMetrics());
        }
        return res;
    }



}
