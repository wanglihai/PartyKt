package com.wlh.common.arouter;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * 时间: 2019-08-2916:59
 * 版本: 1.0
 * 描述:
 * 修改说明:
 */
@Interceptor(priority = 1,name = "登录拦截")
public class LoginInterceptor implements IInterceptor {

    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        String groups = postcard.getGroup();
        if("needLogin".equals(groups)){
            if(true) {//登录判断
                Log.e("你需要登录", "你需要登录");
                ARouter.getInstance().build("/login/LoginActivity").navigation();
                callback.onInterrupt(null);
            }
        }else{
            callback.onContinue(postcard);
        }
    }

    @Override
    public void init(Context context) {
        Log.e("TestInterceptor","init");

    }
}
