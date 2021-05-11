package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Info2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info2);
    }

    public void btnlog1(View view) {
        Intent intentmain1 = new Intent(this, MainActivity.class);
        startActivity(intentmain1);
    }
}