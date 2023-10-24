package DecoratorDesignPattern.Version1;

import DecoratorDesignPattern.Version1.Cone.MangoCone;
import DecoratorDesignPattern.Version1.IceCream;
import DecoratorDesignPattern.Version1.Scoops.VanillaScoop;
import DecoratorDesignPattern.Version1.ingredient;
import DecoratorDesignPattern.Version2.Cone.Mango;

public class Client {
    public static void main(String[] args) {
        // Version 1
        // Mango MangoCone with two vanilla Scoops.
        IceCream ic = new IceCream();
        ingredient mc = new MangoCone();
        ingredient vc1 = new VanillaScoop();
        ingredient vc2 = new VanillaScoop();
        ic.addIngredient(mc);
        ic.addIngredient(vc1);
        ic.addIngredient(vc2);

        int cost = ic.getCost();
        System.out.println("Cost is: " + cost + " and following: ");
        ic.getDesc();
        /*
        Problems in version 1...

        1. Not all ingredients are equal, but in version1 everything is equal.
                A cone is same as a cherry.
        In reality, not every ingredient is same.
        Ingredients
            1. Necessary / Base ingredients
            2. Add on / Decorations ingredients.
         */
    }
}
