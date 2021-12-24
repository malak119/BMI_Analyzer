package com.malakibQq.myapplication.OOP;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.malakibQq.myapplication.R;

import java.util.ArrayList;

public class BMIFoodAdapter extends RecyclerView.Adapter<BMIFoodHolder> {
    private ArrayList<BMIFood> foods;
    private Context context;

    public BMIFoodAdapter(ArrayList<BMIFood> foods,Context context){
        this.foods=foods;
        this.context=context;
    }


    @NonNull
    @Override
    public BMIFoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_food_list,parent,false);
        return new BMIFoodHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final BMIFoodHolder holder, int position) {
        BMIFood food;
        food = foods.get(position);
        holder.setBMIFood(food);
    }

    @Override
    public int getItemCount(){
        return foods.size();
    }

}



