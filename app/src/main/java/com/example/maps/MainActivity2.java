package com.example.maps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        email = findViewById(R.id.email1);
        password = findViewById(R.id.password1);
        Intent intent2 = getIntent();
        Bundle stuff = intent2.getExtras();
        String emailString = stuff.getString("email2");
        String passwordString = stuff.getString("password2");
       email.setText(emailString);
       password.setText(passwordString);
    }
}