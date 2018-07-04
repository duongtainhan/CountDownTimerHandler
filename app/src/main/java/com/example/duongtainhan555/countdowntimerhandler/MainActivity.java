package com.example.duongtainhan555.countdowntimerhandler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imgPicture;
    Button btnRandom;
    int[] r = {R.drawable.ic_facebook, R.drawable.ic_ex, R.drawable.ic_setting, R.drawable.ic_speaker,R.drawable.ic_twitter, R.drawable.ic_vn};
    Random rd;
    int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgPicture = findViewById(R.id.imgPicture);
        btnRandom  = findViewById(R.id.btnRandom);
        rd = new Random();
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index = rd.nextInt(r.length);
                imgPicture.setImageResource(r[index]);
            }
        });

    }
}
