package com.example.buttonscolorsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

// View.OnClickListener - Implementation of the function "onClick"
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout linearLayout1; // Set LinearLayout
    private Button btnToRed, btnToBlue, btnToYellow; // Set Button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // The design of MainActivity

        initUI();
        initListeners();
    }

    private void initUI() {
        // Id of LinearLayout
        linearLayout1 = findViewById(R.id.linearLayout1);
        // Id of Button
        btnToRed = findViewById(R.id.btnToRed);
        btnToBlue = findViewById(R.id.btnToBlue);
        btnToYellow = findViewById(R.id.btnToYellow);
    }

    private void initListeners() {
        // Give access to elements to be clicked
        btnToRed.setOnClickListener(this);
        btnToBlue.setOnClickListener(this);
        btnToYellow.setOnClickListener(this);
    }

    // Performs tasks after click on the elements
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnToRed:
                // Change the color of linearLayout1 to red
                linearLayout1.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
                break;
            case R.id.btnToBlue:
                // Change the color of linearLayout1 to blue
                linearLayout1.setBackgroundColor(ContextCompat.getColor(this, R.color.blue));
                break;
            case R.id.btnToYellow:
                // Change the color of linearLayout1 to yellow
                linearLayout1.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
                break;
        }
    }

}