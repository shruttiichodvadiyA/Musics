package com.example.musics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.musics.databinding.ActivityMain5Binding;

public class MainActivity5 extends AppCompatActivity {

    ActivityMain5Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain5Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        home();
        search();
        playalist();
        viewprofile();
        editprofile();

    }

    private void editprofile() {
        binding.editprofile.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity5.this,EditprofileActivity.class);
            startActivity(intent);
        });
    }

    private void viewprofile() {
        binding.layoutprofile.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity5.this,ViewprofileActivity.class);
            startActivity(intent);
        });
    }

    private void playalist() {
        binding.playalist.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity5.this, MainActivity4.class);
            startActivity(intent);
            finish();
        });
    }

    private void search() {
        binding.search.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity5.this, MainActivity3.class);
            startActivity(intent);
            finish();
        });
    }

    private void home() {
        binding.home.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity5.this, MainActivity2.class);
            startActivity(intent);
            finish();
        });
    }
}