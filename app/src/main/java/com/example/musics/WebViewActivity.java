package com.example.musics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.musics.databinding.ActivityViewprofileBinding;
import com.example.musics.databinding.ActivityWebViewBinding;

public class WebViewActivity extends AppCompatActivity {

    ActivityWebViewBinding binding;
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWebViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        oldnewsong();

    }

    private void oldnewsong() {

       binding.webview.setOnClickListener(view -> {

           String url1=getIntent().getExtras().getString("url");
           webview.loadUrl(url1);

           webview.getSettings().setJavaScriptEnabled(true);

           webview.setWebViewClient(new WebViewClient());
       });
    }


}