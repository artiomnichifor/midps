package com.example.myapplication;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class Display2ndActivityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display2nd_activity);

        final Chronometer chronometer = (Chronometer) findViewById(R.id.chronometer);
        final Button start = (Button) findViewById(R.id.startBtn);
        final Button stop = (Button) findViewById(R.id.stopBtn);
        final Button reset = (Button) findViewById(R.id.resetBtn);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.start();

            }


        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.stop();
            }


        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.setBase(SystemClock.elapsedRealtime());

            }


        });
    }
}
