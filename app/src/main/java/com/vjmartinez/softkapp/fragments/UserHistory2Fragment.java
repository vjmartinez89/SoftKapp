package com.vjmartinez.softkapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import com.vjmartinez.softkapp.ActivityExample;
import com.vjmartinez.softkapp.R;

public class UserHistory2Fragment extends Fragment {

    private Spinner spinnerCity;
    private ImageView imgCity;
    private FloatingActionButton backButton;
    private EditText editText;
    private FragmentActivity activity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_user_history2, container, false);
        activity = getActivity();
        initComponents(view);
        initAdapters();
        initEvents();
        return view;
    }

    private void initComponents(View view) {
        spinnerCity = (Spinner)view.findViewById(R.id.spn_city);
        imgCity = (ImageView)view.findViewById(R.id.img_city);
        backButton = (FloatingActionButton)view.findViewById(R.id.fab_hu2_back);
    }

    private void initAdapters() {
        spinnerCity.setAdapter(new ArrayAdapter<String>(activity.getBaseContext(),
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

      /*  backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });*/
    }



    /**
     * Go back
     */
    private void goBack() {
        Intent intent = new Intent(activity.getBaseContext(), ActivityExample.class);
        startActivity(intent);
        activity.finish();
    }
}
