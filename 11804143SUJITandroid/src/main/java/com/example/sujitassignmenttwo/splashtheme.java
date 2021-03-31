package com.example.sujitassignmenttwo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class splashtheme extends AppCompatActivity {
    Handler h;
    Runnable r;//It is interface which is responsible to run the task
    Long delaytime;
    Long t=3000L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashtheme);
        h= new Handler();
        r=new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(splashtheme.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        };
    }
    @Override
    protected void onResume() {
        super.onResume();
        h.postDelayed(r,t);
        t=System.currentTimeMillis();
    }
    @Override
    protected void onStop() {
        super.onStop();
        h.removeCallbacks(r);
    }
}