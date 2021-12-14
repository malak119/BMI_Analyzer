package com.malakibQq.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView textView;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textView= findViewById(R.id.sign_up);
        textView.setOnClickListener(v -> {
            Intent intent= new Intent(LoginActivity.this,RegistrationActivity.class);
            startActivity(intent);
        });

        login = findViewById(R.id.loginButton);
        login.setOnClickListener(v -> {
            Intent intent= new Intent(LoginActivity.this,HomeActivity.class);
            startActivity(intent);
    });
    }
}