package com.example.musics;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.musics.databinding.ActivityMain5Binding;
import com.example.musics.databinding.ActivityViewprofileBinding;

public class ViewprofileActivity extends AppCompatActivity {

    ActivityViewprofileBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewprofileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

      edit();
      musiclanguages();
    }

    private void musiclanguages() {
        binding.layoutlanguages.setOnClickListener(view -> {
            Intent intent=new Intent(ViewprofileActivity.this,LanguagesActivity.class);
            startActivity(intent);
        });
    }

    private void edit() {
        binding.edit.setOnClickListener(view -> {
            Intent intent=new Intent(ViewprofileActivity.this,EditprofileActivity.class);
            startActivity(intent);
        });
    }
}