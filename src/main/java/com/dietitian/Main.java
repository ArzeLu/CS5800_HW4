package com.dietitian;

public class Main {
    public static void main(String[] args) {
        Customer JoeBama = new Customer("Joe Bama", 0);
        Customer SomeoneElse = new Customer("Someone Else", 1);
        Customer KayaAbles = new Customer("KayaAbles", 2);
        Customer ZackaryMuncher = new Customer("ZackaryMuncher", 3);
        Customer JayBobo = new Customer("Jay Bobo", 0);
        Customer KentuckyChickener = new Customer("Kentucky Chickener", 2);
        Customer GioDinasay = new Customer("Gio Dinasay", 1);

        JoeBama.planDiet();
        SomeoneElse.planDiet();
        KayaAbles.planDiet();
        ZackaryMuncher.planDiet();
        JayBobo.planDiet();
        KentuckyChickener.planDiet();
        GioDinasay.planDiet();

        JoeBama.showCustomerInfo();
        SomeoneElse.showCustomerInfo();
        KayaAbles.showCustomerInfo();
        ZackaryMuncher.showCustomerInfo();
        JayBobo.showCustomerInfo();
        KentuckyChickener.showCustomerInfo();
        GioDinasay.showCustomerInfo();
    }
}
