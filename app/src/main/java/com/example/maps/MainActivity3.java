package com.example.maps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {


    String temp = "";

    float answer = 0f;

    String answerString;

    String operation = "";

    //    Find out which operation is going on.
    String currentOperation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

//Clear All Button
        Button clearButton = findViewById(R.id.clear);

//Buttons numbers.

        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);
        Button three = findViewById(R.id.three);
        Button four = findViewById(R.id.four);
        Button five = findViewById(R.id.five);
        Button six = findViewById(R.id.six);
        Button seven = findViewById(R.id.seven);
        Button eight = findViewById(R.id.eight);
        Button nine = findViewById(R.id.nine);
        Button zero = findViewById(R.id.zero);

//   Operation Button
        Button add = findViewById(R.id.add);
        Button minus = findViewById(R.id.substract);
        Button multiply = findViewById(R.id.multiply);
        Button divide = findViewById(R.id.divide);
        Button mode = findViewById(R.id.modulus);
        Button equal = findViewById(R.id.equal);

//  Go Back
        Button redirect = findViewById(R.id.goBack);


//   Answer
        EditText show = findViewById(R.id.number1);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp += "1";
                show.setText(temp);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp += "2";
                show.setText(temp);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp += "3";
                show.setText(temp);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp += "4";
                show.setText(temp);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp += "5";
                show.setText(temp);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp += "6";
                show.setText(temp);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp += "7";
                show.setText(temp);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp += "8";
                show.setText(temp);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp += "9";
                show.setText(temp);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp += "0";
                show.setText(temp);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer += Integer.parseInt(temp);
                temp = "";
                currentOperation = "+";
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer += Integer.parseInt(temp);
                temp = "";
                currentOperation = "/";
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer += Integer.parseInt(temp);
                temp = "";
                currentOperation = "-";
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer += Integer.parseInt(temp);
                temp = "";
                currentOperation = "*";
            }
        });

        mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer += Integer.parseInt(temp);
                temp = "";
                currentOperation = "%";
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = "";
                answer = 0f;
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (currentOperation.equals("+")) {
                    answer += Integer.parseInt(temp);
                    answerString = Float.toString(answer);
                    show.setText(answerString);
                    temp = "";
                }
                else if (currentOperation.equals("-")) {
                    answer -= Integer.parseInt(temp);
                    answerString = Float.toString(answer);
                    show.setText(answerString);
                    temp = "";
                }
                else if (currentOperation.equals("*")) {
                    answer *= Integer.parseInt(temp);
                    answerString = Float.toString(answer);
                    show.setText(answerString);
                    temp = "";
                }
                else if (currentOperation.equals("/")) {
                    answer /= Integer.parseInt(temp);
                    answerString = Float.toString(answer);
                    show.setText(answerString);
                    temp = "";
                }
                else if (currentOperation.equals("%")) {
                    answer %= Integer.parseInt(temp);
                    answerString = Float.toString(answer);
                    show.setText(answerString);
                    temp = "";
                }

            }
        });

        Intent intent1 = new Intent(this, MainActivity.class);

        redirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent1);
            }
        });
    }
}