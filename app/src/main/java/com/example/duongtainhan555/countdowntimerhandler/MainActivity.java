package com.example.duongtainhan555.countdowntimerhandler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imgvPicture;
    Button btnRandom;
    int r[] = {};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgvPicture = findViewById(R.id.imgvPicture);
        btnRandom  = findViewById(R.id.btnRandom);

        Random rd = new Random();

    }
}
