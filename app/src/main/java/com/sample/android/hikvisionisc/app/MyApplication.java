package com.sample.android.hikvisionisc.app;

import android.app.Application;

import com.sample.android.hikvisionisc.base.BaseActivityConfig;
import com.sdr.lib.SDR_LIBRARY;

/**
 * Created by HyFun on 2020/3/30.
 * Email: 775183940@qq.com
 * Description:
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDR_LIBRARY.register(this,new BaseActivityConfig(this));
    }
}
