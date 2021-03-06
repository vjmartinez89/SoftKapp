package com.vjmartinez.softkapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.vjmartinez.softkapp.dto.UserDTO;
import com.vjmartinez.softkapp.utils.Util;

public class ActivityExample extends AppCompatActivity{

    private Button btnGoHu2;
    private Button btnGoHu3;
    private Button btnGoHu4;
    private Button btnGoHu5;
    private FloatingActionButton fabHu1;
    private TextView tviUserData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_activity);
        initComponents();
        intiEvents();
        initActivity();
    }


    /**
     * Validate intent parameters
     */
    private void initActivity(){
        Intent parentIntent = getIntent();
        if(parentIntent != null && parentIntent.getSerializableExtra(Util.USER) != null){
            UserDTO userDTO = (UserDTO)parentIntent.getSerializableExtra(Util.USER);
            tviUserData.setText("Bienvenido: " + userDTO.getName());
        }
    }

    /**
     * Initialize view components
     */

    private void initComponents() {
        btnGoHu2 = (Button)findViewById(R.id.btn_go_hu2);
        btnGoHu3 =  (Button)findViewById(R.id.btn_go_hu3);
        btnGoHu4 =  (Button)findViewById(R.id.btn_go_hu4);
        btnGoHu5 =  (Button)findViewById(R.id.btn_go_hu5);
        fabHu1 = (FloatingActionButton)findViewById(R.id.fab_hu1);
        tviUserData = (TextView)findViewById(R.id.tvi_user_data);
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

        //Go to user history 4
        btnGoHu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), UserHistory4Activity.class));
                finish();
            }
        });

        //Go to user history 5
        btnGoHu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), FragmentActivity.class));
                finish();
            }
        });

        //Floating action button click
        fabHu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), LoginActivity.class));
                finish();
            }
        });

    }
}
