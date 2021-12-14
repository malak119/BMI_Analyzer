package com.malakibQq.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.malakibQq.myapplication.OOP.BMIAdapter;
import com.malakibQq.myapplication.OOP.BMIRecord;
import com.malakibQq.myapplication.OOP.User;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    RecyclerView home;
    ArrayList<BMIRecord> records;
    BMIAdapter recordAdapter;
    Button add_record;
    Button add_food;
    Button view_food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        add_record = findViewById(R.id.add_record);
        add_food = findViewById(R.id.add_food);
        view_food = findViewById(R.id.view_food);

        add_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_record();
            }
        });
        add_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_food();
            }
        });

        home = findViewById(R.id.home);
        home.setLayoutManager(new LinearLayoutManager(this));
        records = (new User()).getRecords();
        recordAdapter = new BMIAdapter(records, this);
        home.setAdapter(recordAdapter);

        findViewById(R.id.arrow).setAlpha(0L);
        findViewById(R.id.arrow).setClickable(false);
    }

    public void btn_record() {
        Intent intent = new Intent(HomeActivity.this, RecordActivity.class);
        startActivity(intent);
    }

    public void btn_food() {
        Intent intent = new Intent(HomeActivity.this, AddFoodActivity.class);
        startActivity(intent);
    }
}