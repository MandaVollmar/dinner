package com.company;

public class Mexican {
    public String nameOfDish;
    public int caloriesOfDish;
    public boolean isGlutenFree;

    public void setNameOfDish (String dish){
        nameOfDish = dish;
    }
    public String getNameOfDish (){
        return nameOfDish;
    }
    public void setCaloriesOfDish (int calories) {
        caloriesOfDish = calories;
    }
    public int getCaloriesOfDish (){
        return caloriesOfDish;
    }

    public void setIsGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }
}