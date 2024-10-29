package com.dietitian;

public class Meal {
    private Carbs carbs;
    private Protein protein;
    private Fats fats;

    public Meal(Carbs carbs, Protein protein, Fats fats) {
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
    }

    public void setCarbs(Carbs carbs){
        this.carbs = carbs;
    }

    public void setProtein(Protein protein){
        this.protein = protein;
    }

    public void setFats(Fats fats){
        this.fats = fats;
    }

    public Carbs getCarbs() {
        return carbs;
    }

    public Protein getProtein() {
        return protein;
    }

    public Fats getFats() {
        return fats;
    }

    public void showMeal(){
        carbs.viewIngredient();
        protein.viewIngredient();
        fats.viewIngredient();
    }
}
