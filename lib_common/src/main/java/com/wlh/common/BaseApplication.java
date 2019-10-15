package com.wlh.common;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import androidx.multidex.MultiDex;

import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.stetho.Stetho;
import com.scwang.smartrefresh.header.MaterialHeader;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.DefaultRefreshFooterCreator;
import com.scwang.smartrefresh.layout.api.DefaultRefreshHeaderCreator;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.wlh.common.util.LogcatHelper;
import com.wlh.common.util.log.KLog;

/**
 * Description: <初始化应用程序><br>
 * Author:      mxdl<br>
 * Date:        2018/6/6<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class BaseApplication extends Application {

    private static BaseApplication mApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
        KLog.init(BuildConfig.IS_DEBUG);
        Stetho.initializeWithDefaults(this);
        if (BuildConfig.IS_DEBUG) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this); // 尽可能早，推荐在Application中初始化

        //本地日志打印
        LogcatHelper logcatHelper = LogcatHelper.getInstance(this);
        logcatHelper.init(this);
        logcatHelper.start();


        //https://blog.csdn.net/weixin_38261570/article/details/81046352    系统版本适配的博客
    }

    public static BaseApplication getInstance() {
        return mApplication;
    }

    /**
     * 方法数超限
     *
     * @param base
     */
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    static {
        //设置全局的Header构建器
        SmartRefreshLayout.setDefaultRefreshHeaderCreator(new DefaultRefreshHeaderCreator() {
            @Override
            public RefreshHeader createRefreshHeader(Context context, RefreshLayout layout) {
                Resources resources = context.getResources();
                layout.setPrimaryColorsId(R.color.refresh_bg, android.R.color.white);//全局设置主题颜色
                MaterialHeader header = new MaterialHeader(context);
                header.setColorSchemeColors(Color.parseColor("#ff100e1b"));
                header.setShowBezierWave(false);
                header.setSize(22);
//                ClassicsHeader classicsHeader = new ClassicsHeader(context);
//                classicsHeader.setEnableLastTime(false);
//                classicsHeader.setProgressDrawable(resources.getDrawable(R.drawable.icon_loading_net));
//                classicsHeader.setDrawableProgressSize(22);
//                classicsHeader.setSpinnerStyle(SpinnerStyle.Translate);
//                classicsHeader.setDrawableArrowSize(20);
//                classicsHeader.setDrawableMarginRight(20);
//                classicsHeader.setFinishDuration(150);
//                classicsHeader.setTextSizeTitle(14);
//                classicsHeader.setAccentColor(Color.parseColor("#999999"));
//                layout.setHeaderHeight(resources.getDimension(R.dimen.dp_18));
                return header;//.setTimeFormat(new DynamicTimeFormat("更新于 %s"));//指定为经典Header，默认是 贝塞尔雷达Header
            }
        });
        //设置全局的Footer构建器
        SmartRefreshLayout.setDefaultRefreshFooterCreator(new DefaultRefreshFooterCreator() {
            @Override
            public RefreshFooter createRefreshFooter(Context context, RefreshLayout layout) {
                //指定为经典Footer，默认是 BallPulseFooter
                Resources resources = context.getResources();
                ClassicsFooter classicsFooter = new ClassicsFooter(context);
                classicsFooter.setAccentColor(Color.parseColor("#888888"));
                classicsFooter.setSpinnerStyle(SpinnerStyle.Translate);
                classicsFooter.setProgressDrawable(resources.getDrawable(R.drawable.icon_loading_net));
                classicsFooter.setDrawableProgressSize(20);
                classicsFooter.setTextSizeTitle(14);
                classicsFooter.setFinishDuration(150);
                layout.setFooterHeight(resources.getDimension(R.dimen.refresh_hight));
                return classicsFooter;
            }
        });

    }
}
