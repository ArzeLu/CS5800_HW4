package com.pizza_design_pattern;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Pizza> pizzaHut = new ArrayList<>();
        ArrayList<Pizza> littleCaesars = new ArrayList<>();
        ArrayList<Pizza> dominos = new ArrayList<>();

        pizzaHut.add(new Pizza.PizzaBuilder(3)
                .addPepperoni()
                .addExtraCheese()
                .addPesto()
                .build());
        pizzaHut.add(new Pizza.PizzaBuilder(1)
                .addHamPineapple()
                .addOlives()
                .build());

        littleCaesars.add(new Pizza.PizzaBuilder(2)
                .addSausage()
                .addSpinach()
                .addBeef()
                .addOnions()
                .addExtraCheese()
                .addMushrooms()
                .addTomatoBasil()
                .addPesto()
                .build());
        littleCaesars.add(new Pizza.PizzaBuilder(1)
                .addSpicyPork()
                .addSpinach()
                .addBacon()
                .addMushrooms()
                .addOnions()
                .addOnions()
                .build());

        dominos.add(new Pizza.PizzaBuilder(1)
                .addHamPineapple()
                .build());
        dominos.add(new Pizza.PizzaBuilder(3)
                .addChicken()
                .addPeppers()
                .addSpinach()
                .build());

        pizzaHut.getFirst().eat();
        pizzaHut.getLast().eat();
        littleCaesars.getFirst().eat();
        littleCaesars.getLast().eat();
        dominos.getFirst().eat();
        dominos.getLast().eat();
    }
}
