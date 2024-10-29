package com.dietitian;

import java.util.Random;

/// Abstract factory

interface DietPlan {
    Random rand = new Random();
    Carbs pickCarbs();
    Protein pickProtein();
    Fats pickFats();
}

