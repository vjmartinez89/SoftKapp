package com.vjmartinez.softkapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityExample extends AppCompatActivity{

    Button btnGoHu2;
    Button btnGoHu3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_activity);
        initComponents();
    }

    private void initComponents() {
        btnGoHu2 = (Button)findViewById(R.id.btn_go_hu2);
        btnGoHu3 =  (Button)findViewById(R.id.btn_go_hu3);
        btnGoHu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), UserHistory2Activity.class));
                finish();
            }
        });

        btnGoHu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), UserHistory3Activity.class));
                finish();
            }
        });
    }
}
