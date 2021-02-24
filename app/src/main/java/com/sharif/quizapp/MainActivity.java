package com.sharif.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
RadioGroup myradiogroup;
RadioButton myradiobuttonid;
int marks =0;

public static String marksextradata="I am from first activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myradiogroup = (RadioGroup) findViewById(R.id.radiogroupid);

    }



    public void nextfunction(View view) {
        int selectradiobuttonid = myradiogroup.getCheckedRadioButtonId();
        myradiobuttonid = findViewById(selectradiobuttonid);
        if(myradiobuttonid.getText().toString().equals("Dhaka")){
            marks=5;
            Intent myintent = new Intent(MainActivity.this,SecondActivity.class);
            myintent.putExtra(marksextradata,marks);
            startActivity(myintent);
        }
        else {
            marks=0;
            Intent myintent = new Intent(MainActivity.this,SecondActivity.class);
            myintent.putExtra(marksextradata,marks);
            startActivity(myintent);

        }
    }
}