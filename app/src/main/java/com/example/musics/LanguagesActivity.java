package com.example.musics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.Toast;

import com.example.musics.databinding.ActivityLanguagesBinding;
import com.example.musics.databinding.ActivityMain5Binding;

public class LanguagesActivity extends AppCompatActivity {

    ActivityLanguagesBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLanguagesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        switch1();
        switch2();
        switch3();
        switch4();
        switch5();
        switch6();
        switch7();
        switch8();
        switch9();
        switch10();
        switch11();
        switch12();


    }


    private void switch12() {
        Switch simpleSwitch = (Switch) findViewById(R.id.switch12);
        Boolean switchState = simpleSwitch.isChecked();
        binding.switch12.setOnClickListener(view -> {
            Toast.makeText(this, "SPANISH", Toast.LENGTH_SHORT).show();

        });
    }

    private void switch11() {
        Switch simpleSwitch = (Switch) findViewById(R.id.switch11);
        Boolean switchState = simpleSwitch.isChecked();
        binding.switch11.setOnClickListener(view -> {
            Toast.makeText(this, "FRENCH", Toast.LENGTH_SHORT).show();

        });
    }

    private void switch10() {
        Switch simpleSwitch = (Switch) findViewById(R.id.switch10);
        Boolean switchState = simpleSwitch.isChecked();
        binding.switch10.setOnClickListener(view -> {
            Toast.makeText(this, "TELGU", Toast.LENGTH_SHORT).show();

        });
    }

    private void switch9() {
        Switch simpleSwitch = (Switch) findViewById(R.id.switch9);
        Boolean switchState = simpleSwitch.isChecked();
        binding.switch9.setOnClickListener(view -> {
            Toast.makeText(this, "TAMIL", Toast.LENGTH_SHORT).show();

        });
    }

    private void switch8() {
        Switch simpleSwitch = (Switch) findViewById(R.id.switch8);
        Boolean switchState = simpleSwitch.isChecked();
        binding.switch8.setOnClickListener(view -> {
            Toast.makeText(this, "PUNJABI", Toast.LENGTH_SHORT).show();

        });
    }

    private void switch7() {
        Switch simpleSwitch = (Switch) findViewById(R.id.switch7);
        Boolean switchState = simpleSwitch.isChecked();
        binding.switch7.setOnClickListener(view -> {
            Toast.makeText(this, "MARATHI", Toast.LENGTH_SHORT).show();

        });
    }

    private void switch6() {
        Switch simpleSwitch = (Switch) findViewById(R.id.switch6);
        Boolean switchState = simpleSwitch.isChecked();
        binding.switch6.setOnClickListener(view -> {
            Toast.makeText(this, "MALYALAM", Toast.LENGTH_SHORT).show();

        });
    }

    private void switch5() {
        Switch simpleSwitch = (Switch) findViewById(R.id.switch5);
        Boolean switchState = simpleSwitch.isChecked();
        binding.switch5.setOnClickListener(view -> {
            Toast.makeText(this, "KANNADA", Toast.LENGTH_SHORT).show();

        });
    }

    private void switch4() {
        Switch simpleSwitch = (Switch) findViewById(R.id.switch4);
        Boolean switchState = simpleSwitch.isChecked();
        binding.switch4.setOnClickListener(view -> {
            Toast.makeText(this, "GUJRATI", Toast.LENGTH_SHORT).show();

        });
    }

    private void switch3() {
        Switch simpleSwitch = (Switch) findViewById(R.id.switch3);
        Boolean switchState = simpleSwitch.isChecked();
        binding.switch3.setOnClickListener(view -> {
            Toast.makeText(this, "BEGALI", Toast.LENGTH_SHORT).show();

        });
    }

    private void switch2() {
        Switch simpleSwitch = (Switch) findViewById(R.id.switch2);
        Boolean switchState = simpleSwitch.isChecked();
        binding.switch2.setOnClickListener(view -> {
            Toast.makeText(this, "ENGLISH", Toast.LENGTH_SHORT).show();

        });
    }

    private void switch1() {
        Switch simpleSwitch = (Switch) findViewById(R.id.switch1);
        Boolean switchState = simpleSwitch.isChecked();
        binding.switch1.setOnClickListener(view -> {
            Toast.makeText(this, "HINDI", Toast.LENGTH_SHORT).show();

        });
    }
}