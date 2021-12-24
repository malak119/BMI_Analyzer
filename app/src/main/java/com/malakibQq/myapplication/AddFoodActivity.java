package com.malakibQq.myapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class AddFoodActivity extends AppCompatActivity {
    Button save;
    Button arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_food);

        save = findViewById(R.id.save);
        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(v -> {
            Intent intent= new Intent(AddFoodActivity.this,HomeActivity.class);
            startActivity(intent);
        });

        save.setOnClickListener(v -> {
            Intent intent= new Intent(AddFoodActivity.this,HomeActivity.class);
            startActivity(intent);
        });

    }
}