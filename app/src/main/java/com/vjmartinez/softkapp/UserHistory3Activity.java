package com.vjmartinez.softkapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

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
    }

    private void initComponents() {
        backButton = (FloatingActionButton)findViewById(R.id.fab_hu3_back);
        forwardButton = (FloatingActionButton)findViewById(R.id.fab_hu3_next);
        txiName = (TextInputEditText)findViewById(R.id.txi_name);
        txiLastName = (TextInputEditText)findViewById(R.id.txi_last_name);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go(ActivityExample.class);
            }
        });

        forwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), UserHistory3ConfActivity.class);
                intent.putExtra("NAME",txiName.getText());
                intent.putExtra("LAST_NAME",txiLastName.getText());
                intent.putExtra("SEX",rMan.isChecked()? getResources().getString(R.string.man)
                        : getResources().getString(R.string.woman));
                startActivity(intent);
                finish();
            }
        });
    }

    /**
     * Go back
     */
    private void go(Class classToGo) {
        Intent intent = new Intent(this, classToGo);
        startActivity(intent);
        finish();
    }
}
