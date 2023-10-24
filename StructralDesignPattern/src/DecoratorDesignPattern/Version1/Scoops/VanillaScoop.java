package DecoratorDesignPattern.Version1.Scoops;

import DecoratorDesignPattern.Version1.ingredient;

public class VanillaScoop implements ingredient {
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public void getDesc() {
        System.out.println("Chips, ");
    }
}
