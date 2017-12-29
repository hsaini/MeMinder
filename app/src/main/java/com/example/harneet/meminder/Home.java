package com.example.harneet.meminder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends Activity implements View.OnClickListener {

    private Button to_do;
    private Button completed;
    private Button calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        to_do = (Button)
                findViewById(R.id.button_to_do);
        completed = (Button)
                findViewById(R.id.button_complete);
        calendar = (Button)
                findViewById(R.id.button_calendar);

        to_do.setOnClickListener(this);
        completed.setOnClickListener(this);
        calendar.setOnClickListener(this);
    }


    @Override
    public void onClick(View v){
        if(v.getId() == R.id.button_to_do){
            Intent assignment = new Intent(Home.this, To_do.class);
            startActivity(assignment);
        }
        if(v.getId() == R.id.button_complete){
            Intent course = new Intent(Home.this, Completed.class);
            startActivity(course);
        }
        if(v.getId() == R.id.button_calendar){
            Intent calendar = new Intent(Home.this, Calendar.class);
            startActivity(calendar);
        }
    }
}
