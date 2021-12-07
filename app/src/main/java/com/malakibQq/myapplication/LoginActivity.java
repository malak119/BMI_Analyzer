package com.malakibQq.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textView= findViewById(R.id.sign_up);
        textView.setOnClickListener(v -> {
            Intent intent= new Intent(LoginActivity.this,RegistrationActivity.class);
            startActivity(intent);
        });

    }
}