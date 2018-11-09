package com.vjmartinez.softkapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

public class UserHistory3ConfActivity extends AppCompatActivity {

    private TextView tviName;
    private TextView tviLastName;
    private TextView tviSex;
    private FloatingActionButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_history3_conf);

        tviName = (TextView)findViewById(R.id.tvi_name);
        tviLastName = (TextView)findViewById(R.id.tvi_last_name);
        tviSex = (TextView)findViewById(R.id.tvi_sex);
        backButton = (FloatingActionButton)findViewById(R.id.fab_hu3_conf_back);

        Bundle extras = getIntent().getExtras();
        if (extras != null && !extras.isEmpty()) {
            fillText(extras,"NAME",tviName);
            fillText(extras,"LAST_NAME",tviLastName);
            fillText(extras,"SEX",tviSex);
        }

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), UserHistory3Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            Intent intent = new Intent(getBaseContext(), UserHistory3Activity.class);
            startActivity(intent);
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }

    private void fillText(Bundle extras, String key, TextView textView)
    {
        Object val = extras.get(key);
        if (val != null && !"".equals(val.toString())) {
            textView.setText(val.toString());
        }
    }
}
