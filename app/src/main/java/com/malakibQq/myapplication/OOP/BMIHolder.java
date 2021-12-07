package com.malakibQq.myapplication.OOP;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class BMIHolder extends RecyclerView.ViewHolder {
    private final TextView date;
    private final TextView weight;
    private final TextView message;
    private final TextView length;
    private BMIRecord record;
    private View itemView;

    public BMIHolder(@NonNull View itemView){
        super(itemView);
        this.itemView= itemView;
        this.date= itemView.findViewById(R.id.date);
        this.weight= itemView.findViewById(R.id.weight);
        this.message= itemView.findViewById(R.id.message);
        this.length= itemView.findViewById(R.id.length);
    }




}
