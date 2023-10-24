package DecoratorDesignPattern.Version1.Syrup;

import DecoratorDesignPattern.Version1.ingredient;

public class Syrup implements ingredient {
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public void getDesc() {
        System.out.println("Syrup, ");
    }
}
