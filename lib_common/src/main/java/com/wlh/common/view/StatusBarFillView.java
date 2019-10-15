package com.wlh.common.view;

import android.content.Context;
import android.os.Build;

import android.util.AttributeSet;
import android.view.View;

import com.wlh.common.util.ScreenUtils;

import androidx.annotation.Nullable;

/**
 * author : 指尖的力量
 * date   : 2019/3/4 12:24 PM
 * desc   :
 * version: 1.0
 */

public class StatusBarFillView extends View {

    private int statusBarHeight;

    public StatusBarFillView(Context context) {
        super(context);
    }

    public StatusBarFillView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public StatusBarFillView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (resourceId > 0) {
                statusBarHeight = getResources().getDimensionPixelSize(resourceId);
            }
            setMeasuredDimension(ScreenUtils.getScreenWidth(getContext()), statusBarHeight);
        } else {
            setMeasuredDimension(ScreenUtils.getScreenWidth(getContext()), 0);
        }
    }

    public int getStatusBarHeight() {
        if (statusBarHeight == 0) {
            int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (resourceId > 0) {
                statusBarHeight = getResources().getDimensionPixelSize(resourceId);
            }
        }
        return statusBarHeight;
    }
}
