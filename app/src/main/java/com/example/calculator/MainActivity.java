package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber;
    EditText editTextNumber2;

    Button sum;
    Button subtract;
    Button multiply;
    Button divide;

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);

        sum = findViewById(R.id.button);
        subtract = findViewById(R.id.button2);
        multiply = findViewById(R.id.button3);
        divide = findViewById(R.id.button4);

        text = findViewById(R.id.textView);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = Integer.parseInt(editTextNumber.getText().toString()) + Integer.parseInt(editTextNumber2.getText().toString());

                text.setText("Sum is: " + result);

            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = Integer.parseInt(editTextNumber.getText().toString()) - Integer.parseInt(editTextNumber2.getText().toString());

                text.setText("Subtraction is: " + result);

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = Integer.parseInt(editTextNumber.getText().toString()) * Integer.parseInt(editTextNumber2.getText().toString());

                text.setText("Multiply is: " + result);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = Integer.parseInt(editTextNumber.getText().toString()) / Integer.parseInt(editTextNumber2.getText().toString());

                text.setText("Divide is: " + result);
            }
        });



    }
}