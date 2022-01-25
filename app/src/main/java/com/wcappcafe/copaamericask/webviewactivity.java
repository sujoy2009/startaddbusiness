package com.wcappcafe.copaamericask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.wcappcafe.copaamericask.R;

public class webviewactivity extends AppCompatActivity {
    public WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webviewactivity);


        webView = (WebView) findViewById(R.id.webid);
        Toast.makeText(getApplicationContext(), "Loading...please Wait...", Toast.LENGTH_LONG).show();



        Bundle bundle=new Bundle();
        bundle= getIntent().getExtras();
        // String ctg=new String() ;
        String url=new String();
        String name=new String();
        url=bundle.getString("urlkey");
        name=bundle.getString("namekey");
        getSupportActionBar().setTitle(name);






        webView = (WebView) findViewById(R.id.webid);
        webView.loadUrl(url);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new HelloWebViewClient());


    }
    private class HelloWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();

        }
        else {
            super.onBackPressed();

        }
    }
}
