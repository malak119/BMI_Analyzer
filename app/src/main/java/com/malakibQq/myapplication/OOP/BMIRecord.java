package com.malakibQq.myapplication.OOP;

public class BMIRecord {
    String date;
    String message;
    int weight;
    int length;

    public BMIRecord(String date,String message, int weight, int length){
        this.date= date;
        this.message= message;
        this.weight= weight;
        this.length= length;
    }

    public String getDate(){ return date;}
    public void setDate(String date){
        this.date= date;
    }

    public int getWeight(){ return weight;}
    public void setWeight(int weight){
        this.weight= weight;
    }

    public int getLength(){ return length;}
    public void setLength(int length){
        this.length= length;
    }

    public String getMessage(){ return message;}
    public void setMessage(String message){
        this.message= message;
    }


}
