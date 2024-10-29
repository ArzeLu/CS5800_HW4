package com.dietitian;

public class Customer {
    private String name;
    private int dietChoice;
    private Meal meal = null;
    private String[] diets = {"No Restriction", "Paleo", "Vegan", "Nut Allergy"};

    /// Input your name and a diet plan choice in the constructor:
    ///    0 for No Restriction
    ///    1 for Paleo
    ///    2 for Vegan
    ///    3 for Nut Allergy
    public Customer(String name, int dietChoice) {
        this.name = name;
        this.dietChoice = dietChoice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDietChoice(int dietChoice) {
        this.dietChoice = dietChoice;
    }

    public String getName() {
        return name;
    }

    public int getDietChoice() {
        return dietChoice;
    }

    public Meal planDiet(){
        if(dietChoice == 0){
            NoRestriction noRestriction = NoRestriction.getInstance();
            this.meal = new Meal(noRestriction.pickCarbs(), noRestriction.pickProtein(), noRestriction.pickFats());
        }else if(dietChoice == 1){
            Paleo paleo = Paleo.getInstance();
            this.meal = new Meal(paleo.pickCarbs(), paleo.pickProtein(), paleo.pickFats());
        }else if(dietChoice == 2){
            Vegan vegan = Vegan.getInstance();
            this.meal = new Meal(vegan.pickCarbs(), vegan.pickProtein(), vegan.pickFats());
        }else if(dietChoice == 3){
            NutAllergy nutAllergy = NutAllergy.getInstance();
            this.meal = new Meal(nutAllergy.pickCarbs(), nutAllergy.pickProtein(), nutAllergy.pickFats());
        }

        return this.meal;
    }

    public void showCustomerInfo(){
        System.out.println("Customer name: " + name);
        System.out.println("Diet choice: " + diets[dietChoice]);
        meal.showMeal();
        System.out.println();
    }
}
