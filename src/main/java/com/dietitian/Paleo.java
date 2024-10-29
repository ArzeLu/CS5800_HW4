package com.dietitian;

import java.util.Random;

/// This class is a concrete factory.
/// This class is a singleton.

public class Paleo {
    private static Paleo instance;

    Random rand = new Random();

    public Paleo(){}

    public static Paleo getInstance(){
        if(instance == null){
            instance = new Paleo();
        }
        return instance;
    }

    public Carbs pickCarbs(){
        Carbs carbs = new Carbs();
        carbs.chooseIngredient(3);
        return carbs;
    }

    public Protein pickProtein(){
        Protein protein = new Protein();
        protein.chooseIngredient(rand.nextInt(3));
        return protein;
    }

    public Fats pickFats(){
        Fats fats = new Fats();
        int[] allowed = {0, 2, 3};
        fats.chooseIngredient(allowed[rand.nextInt(3)]);
        return fats;
    }
}
