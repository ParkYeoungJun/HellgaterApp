package com.hybrid.hellgater.hellgater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.hybrid.hellgater.hellgater.activities.SplashActivity;

import static com.hybrid.hellgater.hellgater.utils.URL.HELLGATER_URL;

public class MainActivity extends AppCompatActivity {

    private WebView mainWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(this, SplashActivity.class));

        initialize();
    }

    private void initialize()
    {

        /*
         *  webview setting
         */

        mainWeb = (WebView) findViewById(R.id.main_webview);
        mainWeb.setWebViewClient(new WebViewClient());

        WebSettings webSettings = mainWeb.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mainWeb.loadUrl(HELLGATER_URL);

    }

}
