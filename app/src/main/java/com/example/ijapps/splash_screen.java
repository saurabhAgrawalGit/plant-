package com.example.ijapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class splash_screen extends AppCompatActivity {
    LottieAnimationView animationView ,animationView1;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        animationView = findViewById( R.id.animationView);
        textView = findViewById( R.id.te);





        animationView.animate().setDuration(2000);
        textView.animate().translationY(300).setDuration(1200);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // on below line we are
                // creating a new intent
                Intent i = new Intent(splash_screen.this, MainActivity.class);

                // on below line we are
                // starting a new activity.
                startActivity(i);

                // on the below line we are finishing
                // our current activity.
                finish();

            }
        }, 5000);
    }
}