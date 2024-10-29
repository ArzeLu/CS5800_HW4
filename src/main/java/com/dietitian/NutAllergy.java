package com.dietitian;

import java.util.Random;

/// This class is a concrete factory.
/// This class is a singleton.

public class NutAllergy {
    private static NutAllergy instance;

    Random rand = new Random();

    public NutAllergy() {}

    public static NutAllergy getInstance() {
        if (instance == null) {
            instance = new NutAllergy();
        }
        return instance;
    }

    public Carbs pickCarbs(){
        Carbs carbs = new Carbs();
        carbs.chooseIngredient(rand.nextInt(3));
        return carbs;
    }

    public Protein pickProtein(){
        Protein protein = new Protein();
        protein.chooseIngredient(rand.nextInt(4));
        return protein;
    }

    public Fats pickFats(){
        Fats fats = new Fats();
        fats.chooseIngredient(rand.nextInt(3) + 1);
        return fats;
    }
}
