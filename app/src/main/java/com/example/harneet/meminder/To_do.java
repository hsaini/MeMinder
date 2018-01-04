package com.example.harneet.meminder;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class To_do extends Activity implements View.OnClickListener {

    private Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);

        home = (Button)
                findViewById(R.id.button_back_home);

        home.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.getId() == R.id.button_to_do){
            Intent back = new Intent(To_do.this, Home.class);
            startActivity(back);
        }

    }
}
