package com.madhours.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.madhours.R;

public class ActivityLogin extends AppCompatActivity {
    Button login,btn_signup,btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login);
        login = (Button) findViewById(R.id.login);
        btn_signup= (Button) findViewById(R.id.signup);
        btn_login= (Button) findViewById(R.id.btn_login);
        /*login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this,Login.class);
                startActivity(intent);
            }
        });*/
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityLogin.this,ActivitySignUp.class);
                startActivity(intent);
                finish();
            }
        });
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityLogin.this,ActivityNavigationDrawer.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
