package com.malakibQq.myapplication.OOP;



import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.malakibQq.myapplication.R;

import java.util.ArrayList;

public class BMIAdapter extends RecyclerView.Adapter<BMIHolder> {
    private ArrayList<BMIRecord> records;
    private Context context;

    public BMIAdapter(ArrayList<BMIRecord> records,Context context){
        this.records=records;
        this.context=context;
    }


    @NonNull
    @Override
    public BMIHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_element_view,parent,false);
        return new BMIHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final BMIHolder holder, int position) {
        BMIRecord record;
        record = records.get(position);
        holder.setBMIRecord(record);
    }

    @Override
    public int getItemCount(){
        return records.size();
    }

}
