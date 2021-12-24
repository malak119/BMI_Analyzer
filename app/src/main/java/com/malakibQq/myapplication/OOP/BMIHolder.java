package com.malakibQq.myapplication.OOP;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.malakibQq.myapplication.R;

public class BMIHolder extends RecyclerView.ViewHolder {
    private final TextView date;
    private final TextView weight;
    private final TextView message;
    private final TextView length;
    private BMIRecord records;

    public BMIHolder(@NonNull View itemView){
        super(itemView);
        this.date= itemView.findViewById(R.id.date);
        this.weight= itemView.findViewById(R.id.weight);
        this.message= itemView.findViewById(R.id.time);
        this.length= itemView.findViewById(R.id.length);
    }
    public void setBMIRecord(BMIRecord records){
        this.records = records;
        date.setText(records.getDate());
        message.setText(records.getMessage());
        weight.setText(String.valueOf(records.getWeight()));
        length.setText(String.valueOf(records.getLength()));
    }


}
