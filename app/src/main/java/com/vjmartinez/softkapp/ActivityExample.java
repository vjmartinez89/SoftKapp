package com.vjmartinez.softkapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityExample extends AppCompatActivity{

    private Button btnGoHu2;
    private Button btnGoHu3;
    private FloatingActionButton fabHu1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_activity);
        initComponents();
        intiEvents();
    }

    /**
     * Initialize view components
     */
    private void initComponents() {
        btnGoHu2 = (Button)findViewById(R.id.btn_go_hu2);
        btnGoHu3 =  (Button)findViewById(R.id.btn_go_hu3);
        fabHu1 = (FloatingActionButton)findViewById(R.id.fab_hu1);
    }

    /**
     * Initialize events
     */
    private void intiEvents() {

        //Go to user history 2
        btnGoHu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), UserHistory2Activity.class));
                finish();
            }
        });

        //Go to user history 3
        btnGoHu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), UserHistory3Activity.class));
                finish();
            }
        });

        //Floating action button click
        fabHu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityExample.this, R.string.hu01_msg, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
