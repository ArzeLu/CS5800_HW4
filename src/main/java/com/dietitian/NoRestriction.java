package com.dietitian;

import java.util.Random;

/// This class is a concrete factory.
/// This class is a singleton.

public class NoRestriction implements DietPlan {
    private static NoRestriction instance;

    Random rand = new Random();

    public NoRestriction() {}

    public static NoRestriction getInstance() {
        if (instance == null) {
            instance = new NoRestriction();
        }
        return instance;
    }

    public Carbs pickCarbs(){
        Carbs carbs = new Carbs();
        carbs.chooseIngredient(rand.nextInt(4));
        return carbs;
    }

    public Protein pickProtein(){
        Protein protein = new Protein();
        protein.chooseIngredient(rand.nextInt(4));
        return protein;
    }

    public Fats pickFats(){
        Fats fats = new Fats();
        fats.chooseIngredient(rand.nextInt(4));
        return fats;
    }
}
