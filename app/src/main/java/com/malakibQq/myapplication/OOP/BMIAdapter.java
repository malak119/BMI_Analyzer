package com.malakibQq.myapplication.OOP;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.malakibQq.myapplication.R;

public class BMIAdapter extends RecyclerView.Adapter<BMIHolder> {
    private User user;
    private Context context;

    public BMIAdapter(User user, Context context){
        this.user= user;
        this.context= context;
    }

    @NonNull
    @Override
    public BMIHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.);
        return new BMIHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BMIHolder bmiHolder, int position) {
        BMIRecord record= user.getRecords().get(position);
        holder.setBMIRecord(record);
    }

    @Override
    public int getItemCount() {
        return user.getRecords().size;
    }
}
