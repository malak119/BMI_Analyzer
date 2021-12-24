package com.malakibQq.myapplication.OOP;

import java.util.ArrayList;

public class User {
    private final ArrayList<BMIRecord> records;
    private ArrayList<BMIFood> foods;

    public User(){
        this.records= new ArrayList<>();
        records.add(new BMIRecord("11/9/1999", "Normal",65,160));
        records.add(new BMIRecord("11/9/1999", "Normal",165,160));
        records.add(new BMIRecord("11/9/1999", "Normal",165,160));
        records.add(new BMIRecord("11/9/1999", "Normal",165,160));

        this.foods= new ArrayList<BMIFood>();
        foods.add(new BMIFood("Salamon", "Fish", "22 cal/g"));
        foods.add(new BMIFood("Rais", "Carbohydrates", "30 cal/g"));
        foods.add(new BMIFood("Apple", "Fruit", "4 cal/g"));
        foods.add(new BMIFood("Orange", "Fruit", "2 cal/g"));
    }

    public ArrayList<BMIRecord> getRecords(){
        return records;
    }
    public ArrayList<BMIFood> getFood() {
        return foods;
    }
}
