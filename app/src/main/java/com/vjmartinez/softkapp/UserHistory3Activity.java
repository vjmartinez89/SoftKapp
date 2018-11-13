package com.vjmartinez.softkapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.vjmartinez.softkapp.utils.Util;

public class UserHistory3Activity extends AppCompatActivity {

    private FloatingActionButton backButton;
    private FloatingActionButton forwardButton;
    private TextInputEditText txiName;
    private TextInputEditText txiLastName;
    private RadioButton rMan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_history3);
        initComponents();
        initAdapters();
        initEvents();
    }



    private void initComponents() {
        backButton = (FloatingActionButton)findViewById(R.id.fab_hu3_back);
        forwardButton = (FloatingActionButton)findViewById(R.id.fab_hu3_next);
        txiName = (TextInputEditText)findViewById(R.id.txi_name);
        txiLastName = (TextInputEditText)findViewById(R.id.txi_last_name);
        rMan = (RadioButton)findViewById(R.id.rb_man);
    }

    private void initEvents() {
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go(ActivityExample.class, null);
            }
        });

        forwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), UserHistory3ConfActivity.class);
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
                    go(UserHistory3ConfActivity.class, extras);
                }else{
                    Toast.makeText(UserHistory3Activity.this,
                            getResources().getString(R.string.name_invalid),
                            Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private void initAdapters() {
    //Not necessary here
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            go(ActivityExample.class, null);
        }
        return super.onKeyDown(keyCode, event);
    }

    /**
     * Go back
     */
    private void go(Class classToGo, Bundle extras) {
        Intent intent = new Intent(this, classToGo);
        if(extras!=null) {
            intent.putExtras(extras);
        }
        startActivity(intent);
        finish();
    }
}
