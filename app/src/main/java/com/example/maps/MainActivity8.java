package com.example.maps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity8 extends AppCompatActivity {

    private EditText url1;

    private  Button submit, goBack;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        Intent intent1 = new Intent(this, MainActivity.class);
        goBack = findViewById(R.id.goBack);

        submit = findViewById(R.id.submit);

        url1 = findViewById(R.id.url);



        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              startActivity(intent1);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlString = url1.getText().toString();
                Intent goToUrl = new Intent(Intent.ACTION_VIEW, Uri.parse(urlString));
                startActivity(goToUrl);
            }
        });


    }
}