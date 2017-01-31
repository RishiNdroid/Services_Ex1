package com.example.rndroid.services_ex1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonStart, buttonStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonStart = (Button) findViewById(R.id.buttton1);
        buttonStop = (Button) findViewById(R.id.buttton2);
        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttton1 :
                Intent i = new Intent(MainActivity.this, MyService.class);
                startService(i);
                break;
            case R.id.buttton2 :
                Intent i2 = new Intent(MainActivity.this, MyService.class);
                stopService(i2);
                break;
        }
    }
}
