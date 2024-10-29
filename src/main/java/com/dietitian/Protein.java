package com.dietitian;

/// Concrete product; doesn't need to be a singleton

public class Protein implements Macronutrient{
    private final String[] ingredients = {"Fish", "Chicken", "Beef", "Tofu"};
    private int choice;

    /// 0 for Fish. 1 for Chicken. 2 for Beef, 3 for Tofu
    public void chooseIngredient(int choice){
        this.choice = choice;
    }

    public void viewIngredient(){
        System.out.println("Protein of choice: " + ingredients[choice]);
    }
}
