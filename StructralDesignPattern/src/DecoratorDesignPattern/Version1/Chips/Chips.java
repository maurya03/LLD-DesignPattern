package DecoratorDesignPattern.Version1.Chips;

import DecoratorDesignPattern.Version1.ingredient;

public class Chips implements ingredient {
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public void getDesc() {
        System.out.println("Chips, ");
    }
}
