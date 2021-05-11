package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Info3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info3);
    }

    public void btnlog2(View view) {
        Intent intenmain2 = new Intent(this, MainActivity.class);
        startActivity(intenmain2);
    }
}