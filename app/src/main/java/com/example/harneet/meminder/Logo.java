package com.example.harneet.meminder;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Logo extends Activity implements OnClickListener {

    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        start = (Button)
                findViewById(R.id.button_start);

        start.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button_start){
            Intent getstarted = new Intent(Logo.this,
                    Login.class);
            startActivity(getstarted);
        }
    }
}
