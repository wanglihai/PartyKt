package com.wlh.common.util;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.wlh.common.base.BaseActivity;


public class GlideUtils {

    /**
     * 加载Gif图片
     *
     * @param context
     * @param res
     * @param imageView
     */
    public static void loadGif(BaseActivity context, int res, ImageView imageView) {
        RequestOptions requestOptions = getRequestOptions();

        Glide.with(context)
                .asGif()
                .apply(requestOptions)
                .load(res)
                .into(imageView);
    }

    private static RequestOptions getRequestOptions() {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.circleCrop();
        return requestOptions;
    }

}
