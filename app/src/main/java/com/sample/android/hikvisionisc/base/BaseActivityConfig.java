package com.sample.android.hikvisionisc.base;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

import com.sample.android.hikvisionisc.R;

/**
 * Created by HyFun on 2020/3/30.
 * Email: 775183940@qq.com
 * Description:
 */
public class BaseActivityConfig extends com.sdr.lib.base.BaseActivityConfig {
    public BaseActivityConfig(Context context) {
        super(context);
    }

    @Override
    public int onHeaderBarToolbarRes() {
        return R.layout.layout_public_toolbar_white;
    }

    @Override
    public Drawable onHeaderBarDrawable() {
        return new ColorDrawable(context.getResources().getColor(R.color.colorPrimary));
    }
}
