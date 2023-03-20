package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText number1;
    private EditText number2;

    private TextView numberOutput;

    private int number11;
    private int number22;
    private int number3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.inputNumber1);
        number2 = findViewById(R.id.inputNumber2);
        numberOutput = findViewById(R.id.outputNumber);
    }

    public void addNumber(View view){


        number11 = Integer.parseInt(number1.getText().toString());
        number22 = Integer.parseInt(number2.getText().toString());
        number3 = number11+number22;
        numberOutput.setText(Integer.toString(number3));

    }
    public void minusNumber(View view){
        number11 = Integer.parseInt(number1.getText().toString());
        number22 = Integer.parseInt(number2.getText().toString());
        number3 = number11-number22;
        numberOutput.setText(Integer.toString(number3));

    }
    public void multiplyNumber(View view){
        number11 = Integer.parseInt(number1.getText().toString());
        number22 = Integer.parseInt(number2.getText().toString());
        number3 = number11*number22;
        numberOutput.setText(Integer.toString(number3));

    }
    public void divideNumber(View view){
        number11 = Integer.parseInt(number1.getText().toString());
        number22 = Integer.parseInt(number2.getText().toString());
        number3 = number11/number22;
        numberOutput.setText(Integer.toString(number3));

    }
}