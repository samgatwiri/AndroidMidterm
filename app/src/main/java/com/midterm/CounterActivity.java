package com.midterm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    public TextView Countpoint;
    public Button plusbtn;
    public Button minusbtn;
    public Button clearbtn;
    double counter = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        Countpoint = findViewById(R.id.Countpoint);
        plusbtn = findViewById(R.id.plusbtn);
        minusbtn = findViewById(R.id.minusbtn);
        clearbtn = findViewById(R.id.clearbtn);

       // Countpoint.setText(String.valueOf(counter));
    }


    public void minus (View view) {
         counter--;
         Countpoint.setText(String.valueOf(counter));
    }

    public void add (View view) {
        counter++;
        Countpoint.setText(String.valueOf(counter));
    }

    public void clear (View view) {
        counter = 0.00;
        Countpoint.setText(String.valueOf(counter));
    }

}
