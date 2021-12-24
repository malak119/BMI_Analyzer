package com.malakibQq.myapplication.OOP;

public class BMIFood {
    String name;
    String category;
    String calory;

    public BMIFood(String name,String category,String calory) {
        this.name = name;
        this.category= category;
        this.calory = calory;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name; }

    public String getCategory() { return category; }

    public void setCategory(String category) {
        this.category = category; }

    public String getCalory() { return calory; }

    public void setCalory(String calory) {
        this.calory = calory; }
}
