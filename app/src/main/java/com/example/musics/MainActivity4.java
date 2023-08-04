package com.example.musics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.musics.databinding.ActivityMain3Binding;
import com.example.musics.databinding.ActivityMain4Binding;

public class MainActivity4 extends AppCompatActivity {
    ActivityMain4Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMain4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        home();
        search();
        options();
        oldnewsong();
    }

    private void oldnewsong() {
        binding.imgoldnew.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity4.this,WebViewActivity.class);
            intent.putExtra("url","https://www.youtube.com/watch?v=vpDJpeIRn1c");
            startActivity(intent);
        });
    }

    private void options() {
        binding.options.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity4.this,MainActivity5.class);
            startActivity(intent);
            finish();
        });
    }

    private void search() {
        binding.search.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity4.this,MainActivity3.class);
            startActivity(intent);
            finish();
        });
    }

    private void home() {
        binding.home.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity4.this, MainActivity2.class);
            startActivity(intent);
            finish();
        });
    }
}