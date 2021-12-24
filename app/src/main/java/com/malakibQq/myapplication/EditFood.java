package com.malakibQq.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class EditFood extends AppCompatActivity {
    Button save;
    Button arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_food);


        arrow = findViewById(R.id.arrow);
        save = findViewById(R.id.save);

        arrow.setOnClickListener(v -> {
            Intent intent= new Intent(EditFood.this,FoodList.class);
            startActivity(intent);
        });

        save.setOnClickListener(v -> {
            Intent intent= new Intent(EditFood.this,FoodList.class);
            startActivity(intent);
        });
    }
}