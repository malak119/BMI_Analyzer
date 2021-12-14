package com.malakibQq.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class CompleteInfo extends AppCompatActivity {
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_info);

        save = findViewById(R.id.saveButton);
        save.setOnClickListener(v -> {
            Intent intent= new Intent(CompleteInfo.this,HomeActivity.class);
            startActivity(intent); });
    }
}