package com.example.maps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity7 extends AppCompatActivity {

    EditText result;

    Button submit10, goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        result = findViewById(R.id.googleMaps);
        submit10 = findViewById(R.id.submit);

        goBack = findViewById(R.id.goBack);

        submit10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resultString = result.getText().toString();
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("geo:0,0?q=" + resultString));
                startActivity(intent1);
            }
        });

        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity7.this, MainActivity.class);
                startActivity(intent2);
            }
        });

    }
}
