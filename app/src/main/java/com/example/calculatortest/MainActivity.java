package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonDot;

    TextView infoTextView;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = "0";

        initview();

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == "0") {
                    result = button0.getText().toString();
                }else {
                    result = result + button0.getText().toString();
                }
                infoTextView.setText(result);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == "0") {
                    result = button1.getText().toString();
                }else {
                    result = result + button1.getText().toString();
                }
                infoTextView.setText(result);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == "0") {
                    result = button2.getText().toString();
                }else {
                    result = result + button2.getText().toString();
                }
                infoTextView.setText(result);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == "0") {
                    result = button3.getText().toString();
                }else {
                    result = result + button3.getText().toString();
                }
                infoTextView.setText(result);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == "0") {
                    result = button4.getText().toString();
                }else {
                    result = result + button4.getText().toString();
                }
                infoTextView.setText(result);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == "0") {
                    result = button5.getText().toString();
                }else {
                    result = result + button5.getText().toString();
                }
                infoTextView.setText(result);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == "0") {
                    result = button6.getText().toString();
                }else {
                    result = result + button6.getText().toString();
                }
                infoTextView.setText(result);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == "0") {
                    result = button7.getText().toString();
                }else {
                    result = result + button7.getText().toString();
                }
                infoTextView.setText(result);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == "0") {
                    result = button8.getText().toString();
                }else {
                    result = result + button8.getText().toString();
                }
                infoTextView.setText(result);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == "0") {
                    result = button9.getText().toString();
                }else {
                    result = result + button9.getText().toString();
                }
                infoTextView.setText(result);
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + buttonDot.getText().toString();
                infoTextView.setText(result);
            }
        });


    }

    private void initview() {
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonDot = findViewById(R.id.buttonDot);
        infoTextView = findViewById(R.id.infoTextView);

    }
}
