package com.dietitian;

/// Concrete product; doesn't need to be a singleton

public class Carbs implements Macronutrient{
    private final String[] ingredients = {"Cheese", "Bread", "Lentils", "Pistachio"};
    private int choice;

    /// 0 for Cheese, 1 for Bread, 2 for Lentils, 3 for Pistachio
    public void chooseIngredient(int choice){
        this.choice = choice;
    }

    public void viewIngredient(){
        System.out.println("Carb of choice: " + ingredients[choice]);
    }
}
