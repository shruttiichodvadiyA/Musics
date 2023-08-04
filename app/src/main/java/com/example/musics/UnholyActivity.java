package com.example.musics;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.example.musics.databinding.ActivityUnholyBinding;

public class UnholyActivity extends AppCompatActivity {

    ActivityUnholyBinding unholyBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        unholyBinding = ActivityUnholyBinding.inflate(getLayoutInflater());
        setContentView(unholyBinding.getRoot());

//        playpause();
    }

    private void playpause() {

        MediaPlayer mp1 = MediaPlayer.create(this, R.raw.unholy);
        unholyBinding.btnplay.setOnClickListener(view -> {
            mp1.start();
        });

//
//        MediaPlayer mp1=MediaPlayer.create(this,R.raw.heatwaves);
        unholyBinding.btnpause.setOnClickListener(view -> {
            mp1.stop();
        });
    }
}
