package com.example.maps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    Button goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        goBack = findViewById(R.id.goBack);
        Intent intent1 = new Intent(this, MainActivity.class);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent1);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("onRestart()", "restart method is triggerd");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStop()", "stop method is triggerd");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart()", "start method is triggered");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume()", "resume method is triggerd");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause()", "pause method is triggered");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy()", "destroy method is triggerd");
    }


}