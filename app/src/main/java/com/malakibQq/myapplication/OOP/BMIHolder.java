package com.malakibQq.myapplication.OOP;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.malakibQq.myapplication.R;

public class BMIHolder extends RecyclerView.ViewHolder {
    private final TextView date;
    private final TextView weight;
    private final TextView message;
    private final TextView length;
    private BMIRecord record;

    public BMIHolder(@NonNull View itemView){
        super(itemView);
        this.date= itemView.findViewById(R.id.date);
        this.weight= itemView.findViewById(R.id.weight);
        this.message= itemView.findViewById(R.id.message);
        this.length= itemView.findViewById(R.id.length);
    }
    public void setBMIRecord(BMIRecord record){
        this.record = record;
        date.setText(record.getDate());
        message.setText(record.getMessage());
        weight.setText(String.valueOf(record.getWeight()));
        length.setText(String.valueOf(record.getLength()));
    }


}
