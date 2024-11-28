package com.example.addtwonumbers;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //link UI elements
        EditText number1= findViewById(R.id.number1);
        EditText number2= findViewById(R.id.number2);
        Button addButton=findViewById(R.id.addButton);
        Button subButton=findViewById(R.id.subButton);
        Button divButton=findViewById(R.id.divButton);
        Button modButton=findViewById(R.id.modButton);
        TextView resultText=findViewById(R.id.resultText);

        //setup click  listener for the button
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get input numbers
                String num1= number1.getText().toString();
                String num2= number2.getText().toString();
                //check if inputs are not empty
                if(!num1.isEmpty()&& !num2.isEmpty()){
                    //parse numbers and calculate sum
                    int sum= Integer.parseInt(num1)+ Integer.parseInt(num2);
                    //Display result
                    resultText.setText("Result:"+ sum);
                }else {
                    resultText.setText("Please Enter Both Numbers");
                }
            }

        });
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get input numbers
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();
                //check if inputs are not empty
                if (!num1.isEmpty() && !num2.isEmpty()) {
                    //parse numbers and calculate sum
                    int sub = Integer.parseInt(num1) - Integer.parseInt(num2);
                    //Display result
                    resultText.setText("Result:" + sub);
                } else {
                    resultText.setText("Please Enter Both Numbers");
                }
            }
        });
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get input numbers
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();
                //check if inputs are not empty
                if (!num1.isEmpty() && !num2.isEmpty()) {
                    //parse numbers and calculate sum
                    float div = Integer.parseInt(num1) / Integer.parseInt(num2);
                    //Display result
                    resultText.setText("Result:" + div);
                } else {
                    resultText.setText("Please Enter Both Numbers");
                }
            }
        });
        modButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get input numbers
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();
                //check if inputs are not empty
                if (!num1.isEmpty() && !num2.isEmpty()) {
                    //parse numbers and calculate sum
                    int mod = Integer.parseInt(num1) % Integer.parseInt(num2);
                    //Display result
                    resultText.setText("Result:" + mod);
                } else {
                    resultText.setText("Please Enter Both Numbers");
                }
            }
        });
    }
}