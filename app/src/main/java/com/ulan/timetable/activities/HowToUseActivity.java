package com.ulan.timetable.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ulan.timetable.R;

public class HowToUseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_use);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}