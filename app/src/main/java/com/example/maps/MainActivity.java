package com.example.maps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText email, password;
    private Button submit, calculator, lifeCycle, layouts, maps, goToUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        submit = findViewById(R.id.submit);
        calculator = findViewById(R.id.calculator);
        lifeCycle = findViewById(R.id.lifeCycle);
        layouts = findViewById(R.id.layouts);
        goToUrl = findViewById(R.id.urlThing);

        maps = findViewById(R.id.maps);

        Intent intent1 = new Intent(this, MainActivity2.class);

        //Calculator
        Intent intent2 = new Intent(this,MainActivity3.class);

        //LifeCycle Methods.
        Intent intent3 = new Intent(this, MainActivity4.class);

        //Layouts
        Intent intent4 = new Intent(this, MainActivity5.class);

        //Maps
        Intent intent5 = new Intent(this,MainActivity7.class);

        Intent intent6 = new Intent(this, MainActivity8.class);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email1 = email.getText().toString();
                String password1 = password.getText().toString();

                Log.d("email", email1);
                Log.d("password", password1);

                intent1.putExtra("email2", email1);
                intent1.putExtra("password2", password1);
                startActivity(intent1);
            }
        });

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent2);
            }
        });

        lifeCycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent3);
            }
        });

        layouts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent4);
            }
        });

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent5);
            }
        });

        goToUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Log.d("works", "it is working without error");
                startActivity(intent6);
            }
        });
    }
}
