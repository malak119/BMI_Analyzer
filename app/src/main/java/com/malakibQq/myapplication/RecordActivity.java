package com.malakibQq.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class RecordActivity extends AppCompatActivity {
    Button saveBtn;
    Button arrow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        arrow = findViewById(R.id.arrow);
        saveBtn = findViewById(R.id.saveButton);

        arrow.setOnClickListener(v -> {
            Intent intent= new Intent(RecordActivity.this,HomeActivity.class);
            startActivity(intent);
        });

        saveBtn.setOnClickListener(v -> {
            Intent intent= new Intent(RecordActivity.this,HomeActivity.class);
            startActivity(intent);
        });
    }
}