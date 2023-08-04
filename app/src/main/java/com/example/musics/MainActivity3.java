package com.example.musics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.musics.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {

    ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        home();
        playalist();
        options();

    }

    private void options() {
        binding.options.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity3.this, MainActivity5.class);
            startActivity(intent);
            finish();
        });
    }

    private void playalist() {
        binding.playalist.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
            startActivity(intent);
            finish();
        });

    }

    private void home() {
        binding.home.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
            startActivity(intent);
            finish();
        });
    }


}
