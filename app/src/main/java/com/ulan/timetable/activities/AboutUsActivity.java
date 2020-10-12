package com.ulan.timetable.activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ulan.timetable.R;

public class AboutUsActivity extends AppCompatActivity {

    String message;
    String subject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void openWebsite(View view) {
        String url = "https://www.rmit.edu.au";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void sendMail (View view) {
        message = getString(R.string.emailMessage);
        subject = getString(R.string.emailSubject);

        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:"));
        //set the default address to fluid algorithms
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"info@fluidalgorithms.com.au"});
        //set the subject of the mail
        emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject);
        // set the start of the text
        emailIntent.putExtra(Intent.EXTRA_TEXT,message);


        if (emailIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(emailIntent);
        }

    }

    public void openFacebook(View view) {
        //used test facebook account
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/426253597411506"));
            startActivity(intent);
        } catch(Exception e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/appetizerandroid")));
        }

    }





}