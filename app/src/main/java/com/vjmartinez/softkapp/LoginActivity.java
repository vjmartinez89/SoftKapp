package com.vjmartinez.softkapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.vjmartinez.softkapp.dto.UserDTO;
import com.vjmartinez.softkapp.utils.Util;

public class LoginActivity extends AppCompatActivity {
    
    private Button btnLogin;
    private TextView txiUsername;
    private TextView txiPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initComponents();
        initAdapters();
        initEvents();
    }

    private void initAdapters() {
        //Not implemented yet
    }

    private void initComponents() {
        btnLogin = (Button)findViewById(R.id.btn_login);
        txiUsername = (TextView) findViewById(R.id.txi_username);
        txiPassword = (TextView)findViewById(R.id.txi_password);
    }

    private void initEvents(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((txiUsername.getText() == null || txiUsername.getText()
                        .toString().trim().length() == 0) ||
                    (txiPassword.getText() == null || txiPassword.getText()
                            .toString().trim().length() == 0)){
                    Toast.makeText(LoginActivity.this,
                            getResources().getString(R.string.mandatory_data_login),
                            Toast.LENGTH_SHORT).show();
                }else{
                    Bundle extras = new Bundle();
                    UserDTO userDTO = new UserDTO();
                    userDTO.setName(String.valueOf(txiUsername.getText()));
                    userDTO.setPassword(String.valueOf(txiPassword.getText()));
                    extras.putSerializable(Util.USER, userDTO /* String.valueOf(txiUsername.getText())*/);
                  //  extras.putString(Util.PASSWORD,String.valueOf(txiPassword.getText()));
                    go(ActivityExample.class, extras);
                }
            }
        });
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
