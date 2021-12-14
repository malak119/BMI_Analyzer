package com.malakibQq.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {
    TextView textView;
    TextView textLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        textView= findViewById(R.id.create);
        textView.setOnClickListener(v -> {
            Intent intent= new Intent(RegistrationActivity.this,CompleteInfo.class);
            startActivity(intent);
        });

        textLogin= findViewById(R.id.login_account);
        textLogin.setOnClickListener(v -> {
            Intent intent= new Intent(RegistrationActivity.this,LoginActivity.class);
            startActivity(intent);
        });


    }
}