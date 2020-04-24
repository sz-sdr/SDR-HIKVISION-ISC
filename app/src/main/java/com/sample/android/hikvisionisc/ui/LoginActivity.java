package com.sample.android.hikvisionisc.ui;

import android.os.Bundle;

import com.sample.android.hikvisionisc.R;
import com.sdr.lib.base.BaseActivity;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("登录");

    }
}
