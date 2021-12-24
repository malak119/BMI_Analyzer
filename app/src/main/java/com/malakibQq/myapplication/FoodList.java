package com.malakibQq.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class FoodList extends AppCompatActivity {
    Button arrow;
    Button edit;
//    ImageButton x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

        arrow = findViewById(R.id.arrow);
        edit = findViewById(R.id.edit);
//        x = findViewById(R.id.delete);


        arrow.setOnClickListener(v -> {
            Intent intent= new Intent(FoodList.this,HomeActivity.class);
            startActivity(intent);
        });

        edit.setOnClickListener(v -> {
            Intent intent= new Intent(FoodList.this,EditFood.class);
            startActivity(intent);
        });

//        x.setOnClickListener(view -> btn_delete());
    }

//    public void btn_delete() { }
    }