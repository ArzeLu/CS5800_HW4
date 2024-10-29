package com.pizza_design_pattern;

import java.util.ArrayList;

//Immutable pizzas
public class Pizza {
    private final ArrayList<String> toppings;
    private final int size;

    ///Choose size:
    ///    1 for small
    ///    2 for medium
    ///    3 for large
    public Pizza(PizzaBuilder builder){
        this.toppings = builder.toppings;
        this.size = builder.size;
    }

    public void eat(){
        System.out.println("Size: " + size);
        System.out.print("Toppings: ");
        for(String topping : toppings)
            System.out.print(topping + ", ");
        System.out.println();
        System.out.println();
    }

    public static class PizzaBuilder{
        private final ArrayList<String> toppings = new ArrayList<String>();
        private final int size;

        public PizzaBuilder(int size){
            this.size = size;
        }

        public PizzaBuilder addPepperoni(){
            toppings.add("Pepperoni");
            return this;
        }
        public PizzaBuilder addSausage(){
            toppings.add("Sausage");
            return this;
        }
        public PizzaBuilder addMushrooms(){
            toppings.add("Mushrooms");
            return this;
        }
        public PizzaBuilder addBacon(){
            toppings.add("Bacon");
            return this;
        }
        public PizzaBuilder addOnions(){
            toppings.add("Onions");
            return this;
        }
        public PizzaBuilder addExtraCheese(){
            toppings.add("Extra Cheese");
            return this;
        }
        public PizzaBuilder addPeppers(){
            toppings.add("Peppers");
            return this;
        }
        public PizzaBuilder addChicken(){
            toppings.add("Chicken");
            return this;
        }
        public PizzaBuilder addOlives(){
            toppings.add("Olives");
            return this;
        }
        public PizzaBuilder addSpinach(){
            toppings.add("Spinach");
            return this;
        }
        public PizzaBuilder addTomatoBasil(){
            toppings.add("Tomato and Basil");
            return this;
        }
        public PizzaBuilder addBeef(){
            toppings.add("Beef");
            return this;
        }
        public PizzaBuilder addHam(){
            toppings.add("Ham");
            return this;
        }
        public PizzaBuilder addPesto(){
            toppings.add("Pesto");
            return this;
        }
        public PizzaBuilder addSpicyPork(){
            toppings.add("Spicy Pork");
            return this;
        }
        public PizzaBuilder addHamPineapple(){
            toppings.add("Ham and Pineapple");
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }
}

class Driver {
    public static void main(String[] args) {
        Pizza small = new Pizza.PizzaBuilder(1)
                .addChicken()
                .addPeppers()
                .addSpinach()
                .build();

        Pizza medium = new Pizza.PizzaBuilder(2)
                .addSpicyPork()
                .addSpinach()
                .addBacon()
                .addMushrooms()
                .addOnions()
                .addOnions()
                .build();

        Pizza large = new Pizza.PizzaBuilder(3)
                .addSausage()
                .addSpinach()
                .addBeef()
                .addOnions()
                .addExtraCheese()
                .addMushrooms()
                .addTomatoBasil()
                .addPesto()
                .build();

        small.eat();
        medium.eat();
        large.eat();
    }
}