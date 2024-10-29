package com.dietitian;

import java.util.Random;

/// This class is a concrete factory.
/// This class is a singleton.

public class Vegan {
    private static Vegan instance;

    Random rand = new Random();

    public Vegan(){}

    public static Vegan getInstance(){
        if(instance == null){
            instance = new Vegan();
        }
        return instance;
    }

    public Carbs pickCarbs(){
        Carbs carbs = new Carbs();
        carbs.chooseIngredient(rand.nextInt(3) + 1);
        return carbs;
    }

    public Protein pickProtein(){
        Protein protein = new Protein();
        protein.chooseIngredient(3);
        return protein;
    }

    public Fats pickFats(){
        Fats fats = new Fats();
        int[] allowed = {0, 3};
        fats.chooseIngredient(allowed[rand.nextInt(2)]);
        return fats;
    }
}
