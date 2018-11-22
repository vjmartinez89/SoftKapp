package com.vjmartinez.softkapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.Toast;

import com.vjmartinez.softkapp.ActivityExample;
import com.vjmartinez.softkapp.R;
import com.vjmartinez.softkapp.UserHistory3Activity;
import com.vjmartinez.softkapp.UserHistory3ConfActivity;
import com.vjmartinez.softkapp.utils.Util;

public class UserHistory3Fragment extends Fragment {

    private FloatingActionButton backButton;
    private FloatingActionButton forwardButton;
    private TextInputEditText txiName;
    private TextInputEditText txiLastName;
    private RadioButton rMan;
    private FragmentActivity activity;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_user_history3, container, false);
        activity = getActivity();
        initComponents(view);
        initAdapters();
        initEvents();
        return view;
    }


    private void initComponents(View view) {
        backButton = (FloatingActionButton)view.findViewById(R.id.fab_hu3_back);
        forwardButton = (FloatingActionButton)view.findViewById(R.id.fab_hu3_next);
        txiName = (TextInputEditText)view.findViewById(R.id.txi_name);
        txiLastName = (TextInputEditText)view.findViewById(R.id.txi_last_name);
        rMan = (RadioButton)view.findViewById(R.id.rb_man);
    }

    private void initEvents() {
       /*  backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  go(ActivityExample.class, null);
            }
        });

       forwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity.getBaseContext(), UserHistory3ConfActivity.class);
                Bundle extras = new Bundle();
                String username = "";
                String lastName = "";
                if((txiName.getText() != null && txiName.getText().toString().trim().length() > 0) &&
                        (txiLastName.getText() != null && txiLastName.getText()
                                .toString().trim().length() > 0)) {
                    username =  txiName.getText().toString();
                    extras.putString(Util.NAME, username);
                    extras.putString(Util.LAST_NAME, txiLastName.getText().toString());
                    extras.putString(Util.SEX, rMan.isChecked()? getResources().getString(R.string.man)
                            : getResources().getString(R.string.woman));
                  //  go(UserHistory3ConfActivity.class, extras);
                }else{
                    Toast.makeText(activity.getBaseContext(),
                            getResources().getString(R.string.name_invalid),
                            Toast.LENGTH_SHORT).show();
                }

            }
        });*/
    }

    private void initAdapters() {
        //Not necessary here
    }


}
