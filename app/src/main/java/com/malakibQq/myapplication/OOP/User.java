package com.malakibQq.myapplication.OOP;

import java.util.ArrayList;

public class User {
    private final ArrayList<BMIRecord> records;

    public User(){
        this.records= new ArrayList<>();
        records.add(new BMIRecord("11/9/1999", 50,165));
        records.add(new BMIRecord("9/6/1995", 60,166));
        records.add(new BMIRecord("11/11/1994", 50,160));
        records.add(new BMIRecord("9/8/2002", 65,175));

    }
    public ArrayList<BMIRecord> getRecords(){
        return records;
    }
}
