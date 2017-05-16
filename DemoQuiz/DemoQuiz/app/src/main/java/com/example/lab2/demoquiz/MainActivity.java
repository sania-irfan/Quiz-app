package com.example.lab2.demoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg1;
    RadioGroup rg2;
    RadioGroup rg3;
    Button btn;
    String answer1;
    String answer2;
    String answer3;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);

        rg1 = (RadioGroup) findViewById(R.id.rg1);
        rg2 = (RadioGroup) findViewById(R.id.rg2);
        rg3 = (RadioGroup) findViewById(R.id.rg3);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.rb1) {
                    RadioButton rb1 = (RadioButton) findViewById(R.id.rb1);
                    answer1 = rb1.getText().toString();
                } else if (checkedId == R.id.rb2) {
                    RadioButton rb2 = (RadioButton) findViewById(R.id.rb2);
                    answer1 = rb2.getText().toString();
                } else if (checkedId == R.id.rb3) {
                    RadioButton rb3 = (RadioButton) findViewById(R.id.rb3);
                    answer1 = rb3.getText().toString();
                }
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                if (checkedId == R.id.rb4) {
                    RadioButton rb4 = (RadioButton) findViewById(R.id.rb4);
                    answer2 = rb4.getText().toString();
                } else if (checkedId == R.id.rb5) {
                    RadioButton rb5 = (RadioButton) findViewById(R.id.rb5);
                    answer2 = rb5.getText().toString();
                } else if (checkedId == R.id.rb6) {
                    RadioButton rb6 = (RadioButton) findViewById(R.id.rb6);
                    answer2 = rb6.getText().toString();
                }
            }
        });

        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.rb7) {
                    RadioButton rb7 = (RadioButton) findViewById(R.id.rb7);
                    answer3 = rb7.getText().toString();
                } else if (checkedId == R.id.rb8) {
                    RadioButton rb8 = (RadioButton) findViewById(R.id.rb8);
                    answer3 = rb8.getText().toString();
                } else if (checkedId == R.id.rb10) {
                    RadioButton rb10 = (RadioButton) findViewById(R.id.rb10);
                    answer3 = rb10.getText().toString();
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer1 != null && answer2 != null && answer3 != null) {

                    if (answer1.equals("Java") && answer2.equals("C#") && answer3.equals("int")) {
                        Toast.makeText(MainActivity.this, "Correct Answers", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        checkAnswer1();
                        checkAnswer2();
                        checkAnswer3();
                    }
                }
                else {

                    Toast.makeText(MainActivity.this, "Answer all questions", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void checkAnswer1(){
        if (!answer1.equals("Java")) {
            Toast.makeText(MainActivity.this, "Question 1 wrong", Toast.LENGTH_SHORT).show();
        }
    }
    public void checkAnswer2(){
        if (!answer2.equals("C#")) {
            Toast.makeText(MainActivity.this, "Question 2 wrong", Toast.LENGTH_SHORT).show();
        }
    }
    public void checkAnswer3(){
        if (!answer3.equals("int"))
        {
            Toast.makeText(MainActivity.this, "Question 3 wrong", Toast.LENGTH_SHORT).show();
        }
    }
}
