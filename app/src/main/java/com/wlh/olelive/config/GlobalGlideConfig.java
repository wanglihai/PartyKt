package com.wlh.olelive.config;

import android.content.Context;
import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.cache.ExternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.request.RequestOptions;

/**
 * 时间: 2019-08-2917:22
 * 版本: 1.0
 * 描述:
 * 修改说明:
 */
@GlideModule
public class GlobalGlideConfig extends AppGlideModule {

    @Override
    public void registerComponents(@NonNull Context context, @NonNull Glide glide, @NonNull Registry registry) {
        super.registerComponents(context, glide, registry);
    }

    @Override
    public boolean isManifestParsingEnabled() {
        return false;
    }

    @Override
    public void applyOptions(@NonNull Context context, @NonNull GlideBuilder builder) {
        super.applyOptions(context, builder);

        //磁盘缓存清理（子线程）
        //GlideApp.get(context).clearDiskCache();
        ////内存缓存清理（主线程）
        //GlideApp.get(context).clearMemory();
        /**
         * DiskCacheStrategy.NONE： 表示不缓存任何内容。
         * DiskCacheStrategy.DATA： 表示只缓存原始图片。
         * DiskCacheStrategy.RESOURCE： 表示只缓存转换过后的图片。
         * DiskCacheStrategy.ALL ： 表示既缓存原始图片，也缓存转换过后的图片。
         * DiskCacheStrategy.AUTOMATIC： 表示让Glide根据图片资源智能地选择使用哪一种缓存策略（默认选项）。
         */
        builder.setDefaultRequestOptions(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.AUTOMATIC));

        /**
         * 优先外部存储作为磁盘缓存目录，防止内部存储文件过大
         * 外部存储目录默认地址为：/sdcard/Android/data/com.sina.weibolite/cache/image_manager_disk_cache
         */
        builder.setDiskCache(new ExternalCacheDiskCacheFactory(context));

        // 设置缓存大小为20mb
        int memoryCacheSizeBytes = 1024 * 1024 * 20; // 20 MB
        int diskCacheSizeBytes = 1024 * 1024 * 150;  //100 MB
        // 设置内存缓存大小
        builder.setMemoryCache(new LruResourceCache(memoryCacheSizeBytes));
        // 根据SD卡是否可用选择是在内部缓存还是SD卡缓存
//        if(SDCardUtils.isSDCardEnable()){
//            builder.setDiskCache(new ExternalPreferredCacheDiskCacheFactory(context, "HYManagerImages", diskCacheSizeBytes));
//        }else {
//            builder.setDiskCache(new InternalCacheDiskCacheFactory(context, "HYManagerImages", memoryCacheSizeBytes));
//        }
    }
}
