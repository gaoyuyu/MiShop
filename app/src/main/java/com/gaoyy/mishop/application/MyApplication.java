package com.gaoyy.mishop.application;

import android.app.Application;
import android.graphics.Bitmap;

import com.gaoyy.mishop.api.RetrofitService;
import com.squareup.picasso.Picasso;

import java.io.File;

import okhttp3.Cache;
import okhttp3.OkHttpClient;


/**
 * Created by gaoyy on 2016/12/28.
 */

public class MyApplication extends Application
{
    private static final String LOG_TAG = MyApplication.class.getSimpleName();

    @Override
    public void onCreate()
    {
        super.onCreate();

        RetrofitService.init(this);
        initPicasso();

    }

    private void initPicasso()
    {
        File file = new File(this.getCacheDir(),"Picasso");
        OkHttpClient client =new OkHttpClient
                .Builder()
                .addInterceptor(new CacheInterceptor(this))
                .cache(new Cache(file, 1024 * 1024 * 100))
                .build();

        Picasso picasso = new Picasso.Builder(this)
                .defaultBitmapConfig(Bitmap.Config.RGB_565)
                .downloader(new ImageDownLoader(client))
                .indicatorsEnabled(false)
                .build();
        Picasso.setSingletonInstance(picasso);
    }


}
