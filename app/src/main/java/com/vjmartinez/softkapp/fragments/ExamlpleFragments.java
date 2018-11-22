package com.vjmartinez.softkapp.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.vjmartinez.softkapp.R;

public class ExamlpleFragments extends Fragment {

    private EditText editText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.example_fragment, container, false);
        initComponents(view);
        return view;
    }

    private void initComponents(View view){

        editText = view.findViewById(R.id.edtNombre);
    }
}
