package com.sharif.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    TextView outputtextview;
    Button tryagainbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        tryagainbutton = (Button)findViewById(R.id.tryagainbuttonid);
        outputtextview=(TextView)findViewById(R.id.outputtextviewid);
        Intent myoutputintent = getIntent();
        int outmarks = myoutputintent.getIntExtra(MainActivity.marksextradata,0);
        if(outmarks==10){
            outputtextview.setText("Your answer is correct and your marks is : 10");
        }
       
        else {
            outputtextview.setText("Your answer is false and your marks is : 0");
        }
    }

    public void tryagainfunction(View view) {
        Intent mynewIntent = new Intent(Activity3.this,MainActivity.class);
        startActivity(mynewIntent);

    }
}