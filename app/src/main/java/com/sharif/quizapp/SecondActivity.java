package com.sharif.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView outputtextview;
Button tryagainbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tryagainbutton = (Button)findViewById(R.id.tryagainbuttonid);
        outputtextview=(TextView)findViewById(R.id.outputtextviewid);
        Intent myoutputintent = getIntent();
        int outmarks = myoutputintent.getIntExtra(MainActivity.marksextradata,0);
        if(outmarks==5){
            outputtextview.setText("Your answer is correct and your marks is : 5");
        }else {
            outputtextview.setText("Your answer is false and your marks is : 0");
        }
    }

    public void tryagainfunction(View view) {
     Intent mynewIntent = new Intent(SecondActivity.this,MainActivity.class);
     startActivity(mynewIntent);
    }
}