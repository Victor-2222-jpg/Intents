package com.example.intents;

import static com.example.intents.R.id.*;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Button buttonExplicit1 = findViewById(R.id.button1);
        Button buttonExplicit2 = findViewById(R.id.button2);
        Button buttonImplicit1 = findViewById(R.id.button3);
        Button buttonImplicit2 = findViewById(R.id.button4);
        Button buttonImplicit3 = findViewById(R.id.button5);
        Button buttonImplicit4 = findViewById(R.id.button6);


        buttonExplicit1.setOnClickListener(this);
        buttonExplicit2.setOnClickListener(this);
        buttonImplicit1.setOnClickListener(this);
        buttonImplicit2.setOnClickListener(this);
        buttonImplicit3.setOnClickListener(this);
        buttonImplicit4.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.button1) {
            Intent explicitIntent1 = new Intent(splash.this, vista2.class);
            startActivity(explicitIntent1);
        } else if (view.getId() == R.id.button2) {
            Intent explicitIntent2 = new Intent(splash.this, vista3.class);
            startActivity(explicitIntent2);
        } else if (view.getId() == R.id.button3) {
            Intent implicitIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
            startActivity(implicitIntent1);
        } else if (view.getId() == R.id.button4) {
            Intent implicitIntent2 = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:example@example.com"));
            startActivity(implicitIntent2);
        }
    }
}