package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Num1, Num2;

    Button Add, Sub, Mul, Div;

    TextView Output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 = findViewById(R.id.Num1);
        Num2 = findViewById(R.id.Num2);

        Add = findViewById(R.id.Add);
        Sub = findViewById(R.id.Sub);
        Mul = findViewById(R.id.Mul);
        Div = findViewById(R.id.Div);

        Output = findViewById(R.id.Output);


        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Num1Val, Num2Val, OutputVal;
                try {
                    Num1Val = Integer.parseInt(Num1.getText().toString());
                    Num2Val = Integer.parseInt(Num2.getText().toString());
                } catch (NumberFormatException e) {
                    Output.setText("Invalid Input!");
                    return;
                }
                OutputVal = Num1Val + Num2Val;
                Output.setText(Integer.toString(OutputVal));
            }
        });
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Num1Val, Num2Val, OutputVal;
                try {
                    Num1Val = Integer.parseInt(Num1.getText().toString());
                    Num2Val = Integer.parseInt(Num2.getText().toString());
                } catch (NumberFormatException e) {
                    Output.setText("Invalid Input!");
                    return;
                }
                OutputVal = Num1Val - Num2Val;
                Output.setText(Integer.toString(OutputVal));
            }
        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Num1Val, Num2Val, OutputVal;
                try {
                    Num1Val = Integer.parseInt(Num1.getText().toString());
                    Num2Val = Integer.parseInt(Num2.getText().toString());
                } catch (NumberFormatException e) {
                    Output.setText("Invalid Input!");
                    return;
                }
                OutputVal = Num1Val * Num2Val;
                Output.setText(Integer.toString(OutputVal));
            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Num1Val, Num2Val, OutputVal;
                try {
                    Num1Val = Integer.parseInt(Num1.getText().toString());
                    Num2Val = Integer.parseInt(Num2.getText().toString());
                } catch (NumberFormatException e) {
                    Output.setText("Invalid Input!");
                    return;
                }
                OutputVal = Num1Val / Num2Val;
                Output.setText(Integer.toString(OutputVal));
            }
        });
    }
}