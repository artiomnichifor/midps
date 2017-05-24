package com.example.myapplication;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class Game extends AppCompatActivity {
    ImageView milkbottle;
    Button nextBtn;
    Random r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        r = new Random();
        milkbottle = (ImageView) findViewById(R.id.milkbottle);
        nextBtn = (Button) findViewById(R.id.nextBtn);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RotateAnimation rotate = new RotateAnimation(0, r.nextInt(3600) + 360,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setFillAfter(true);
                rotate.setDuration(1000);
                rotate.setInterpolator(new AccelerateDecelerateInterpolator());

                milkbottle.startAnimation(rotate);

            }
        });
    }
}
