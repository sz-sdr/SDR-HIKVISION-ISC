package com.sample.android.hikvisionisc;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.sdr.lib.base.BaseActivity;
import com.sdr.android.library.isc.SDR_HIKVISION_ISC;

public class MainActivity extends BaseActivity {

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(getResources().getString(R.string.app_name));

        editText = findViewById(R.id.edit_text);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String address = editText.getText().toString().trim();
                if (TextUtils.isEmpty(address)) {
                    return;
                }
                SDR_HIKVISION_ISC.getInstance().start(MainActivity.this, address, "lallalalala");
            }
        });
    }
}
