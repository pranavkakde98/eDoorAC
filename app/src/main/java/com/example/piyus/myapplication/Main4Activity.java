package com.example.piyus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {


    private Button  next2_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        next2_button = (Button) findViewById(R.id.next2_button);
        next2_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v == next2_button){
            Intent intent = new Intent(this, Main5Activity.class);
            startActivity(intent);
        }

    }
}
