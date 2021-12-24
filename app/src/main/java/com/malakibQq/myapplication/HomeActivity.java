package com.malakibQq.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.Button;
import android.widget.TextView;

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
    TextView logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        add_record = findViewById(R.id.add_record);
        add_food = findViewById(R.id.add_food);
        view_food = findViewById(R.id.view_food);
        home = findViewById(R.id.home);
        logout = findViewById(R.id.logout);

        add_record.setOnClickListener(view -> btn_record());
        add_food.setOnClickListener(view -> btn_food());

        view_food.setOnClickListener(v -> {
            Intent intent= new Intent(HomeActivity.this,FoodList.class);
            startActivity(intent);
        });

        logout.setOnClickListener(v -> {
            Intent intent= new Intent(HomeActivity.this,LoginActivity.class);
            startActivity(intent);
        });
        home.setLayoutManager(new LinearLayoutManager(this));
        records = (new User()).getRecords();
        recordAdapter = new BMIAdapter(records, this);
        home.setAdapter(recordAdapter);

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