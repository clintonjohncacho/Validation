package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username= findViewById(R.id.Email);
        password= findViewById(R.id.Password);

    }

    public void btnfunction(View view) {

        String usename= username.getText().toString();
        String pass = password.getText().toString();

        if(usename.length()==0)
        {
            username.setError("Enter Username");
        }

        else if(pass.length()==0)
        {
            password.setError("Enter Password");
        }

        else if ((usename.contains("clintonjohncacho22@gmail.com")) && (pass.contains("yamero22")))
        {

            Intent intent = new Intent(this, Info1.class);
            startActivity(intent);
        }
        else if((usename.contains("jaymsalamanca13@gmail.com")) && (pass.contains("tangero13")))
        {
            Intent intent1 = new Intent(this,Info2.class);
            startActivity(intent1);
        }

        else if((usename.contains("angelolamadrid12@gmail.com")) && (pass.contains("kaido12")))
        {
            Intent intent2 = new Intent(this,Info3.class);
            startActivity(intent2);
        }
        else if((usename.contains("julieannbasa14@gmail.com")) && (pass.contains("bigmom14")))
        {
            Intent intent3 = new Intent(this,Info4.class);
            startActivity(intent3);
        }

        else {
            username.setError("");
            password.setError("Invalid Account");
        }
    }
}