package com.vjmartinez.softkapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UserHistory3ConfActivity extends AppCompatActivity {

    private TextView tviName;
    private TextView tviLastName;
    private TextView tviSex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_history3_conf);

        tviName = (TextView)findViewById(R.id.tvi_name);
        tviLastName = (TextView)findViewById(R.id.tvi_last_name);
        tviSex = (TextView)findViewById(R.id.tvi_sex);

        Bundle extras = getIntent().getExtras();
        if (extras != null && !extras.isEmpty()) {
            fillText(extras,"NAME",tviName);
            fillText(extras,"LAST_NAME",tviLastName);
            fillText(extras,"SEX",tviSex);
        }

    }

    private void fillText(Bundle extras, String key, TextView textView)
    {
        String val = extras.getString(key);
        if (val != null && "".equals(val)) {
            textView.setText(val);
        }
    }
}
