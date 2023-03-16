package com.example.maps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    Button goBack, constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        goBack = findViewById(R.id.goBack);
        constraintLayout = findViewById(R.id.constraintLayout);
        Intent intent1 = new Intent(this, MainActivity.class);
        //Constraint Layout
        Intent intent2 = new Intent(this, MainActivity6.class);
        //Go Back to main page

        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent1);
            }
        });

        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent2);
            }
        });
    }
}