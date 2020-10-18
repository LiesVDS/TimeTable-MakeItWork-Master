package com.ulan.timetable.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class SplashScreen extends AppCompatActivity {

    SharedPreferences onBoardingScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        onBoardingScreen = getSharedPreferences("onBoardingScreen", MODE_PRIVATE);
        boolean isFirstTime = onBoardingScreen.getBoolean("firstTime", true);

        startActivity(new Intent(this, OnBoardingActivity.class) );


        if(isFirstTime) {
            SharedPreferences.Editor editor = onBoardingScreen.edit();
            editor.putBoolean("firstTime", false);
            editor.commit();

            startActivity(new Intent(this, OnBoardingActivity.class) );
            finish();
        } else {
            startActivity(new Intent(this, MainActivity.class) );
        }


    }
}
