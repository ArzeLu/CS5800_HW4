package com.dietitian;

/// Concrete product; doesn't need to be a singleton

public class Fats implements Macronutrient{
    private final String[] ingredients = {"Avocado", "Sour Cream", "Tuna", "Peanuts"};
    private int choice;

    /// 0 for Avocado, 1 for Sour Cream, 2 for Tuna, 3 for Peanuts
    public void chooseIngredient(int choice){
        this.choice = choice;
    }

    public void viewIngredient(){
        System.out.println("Protein of choice: " + ingredients[choice]);
    }
}
