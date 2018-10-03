package com.example.piyus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button schedule_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        schedule_button = (Button)findViewById(R.id.schedule_button);

        schedule_button.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if(v == schedule_button){
            Intent intent = new Intent(this, Main5Activity.class);
            startActivity(intent);
        }
    }
}
