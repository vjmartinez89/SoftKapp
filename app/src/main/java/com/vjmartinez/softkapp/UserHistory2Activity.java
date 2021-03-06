package com.vjmartinez.softkapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.Arrays;

public class UserHistory2Activity extends AppCompatActivity {

    private Spinner spinnerCity;
    private ImageView imgCity;
    private FloatingActionButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_history2);
        initComponents();
        initAdapters();
        initEvents();
    }

    private void initComponents() {
        spinnerCity = (Spinner)findViewById(R.id.spn_city);
        imgCity = (ImageView)findViewById(R.id.img_city);
        backButton = (FloatingActionButton)findViewById(R.id.fab_hu2_back);
    }

    private void initAdapters() {
        spinnerCity.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                getResources().getStringArray(R.array.ciudades)));
        ((ArrayAdapter)spinnerCity.getAdapter()).setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    }


    private void initEvents() {
        spinnerCity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        imgCity.setVisibility(View.INVISIBLE);
                        break;
                    case 1: //Armenia
                        imgCity.setImageResource(R.drawable.ar);
                        imgCity.setVisibility(View.VISIBLE);
                        break;
                    case 2: //Bogota
                        imgCity.setImageResource(R.drawable.bo);
                        imgCity.setVisibility(View.VISIBLE);
                        break;
                    case 3: //Cali
                        imgCity.setImageResource(R.drawable.ca);
                        imgCity.setVisibility(View.VISIBLE);
                        break;
                    case 4: //Barranquilla
                        imgCity.setImageResource(R.drawable.ba);
                        imgCity.setVisibility(View.VISIBLE);
                        break;
                    default:
                        imgCity.setVisibility(View.INVISIBLE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                imgCity.setVisibility(View.INVISIBLE);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });
    }

    /**
     * Go to Main Activity when user touch back button
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            goBack();
        }
        return super.onKeyDown(keyCode, event);
    }

    /**
     * Go back
     */
    private void goBack() {
        Intent intent = new Intent(this, ActivityExample.class);
        startActivity(intent);
        finish();
    }
}
