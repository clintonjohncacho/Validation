package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Info4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info4);
    }

    public void btnlog3(View view) {
        Intent intentmain3 = new Intent(this, MainActivity.class);
        startActivity(intentmain3);
    }
}