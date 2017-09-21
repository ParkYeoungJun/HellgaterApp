package com.hybrid.hellgater.hellgater.activities;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

import com.hybrid.hellgater.hellgater.R;

/**
 * Created by Park on 2017-09-19.
 */

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                finish();
            }
        }, 2000);
    }
}
