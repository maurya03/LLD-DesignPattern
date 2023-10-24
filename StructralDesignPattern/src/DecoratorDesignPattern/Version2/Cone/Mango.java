package DecoratorDesignPattern.Version2.Cone;

import DecoratorDesignPattern.Version1.ingredient;
import DecoratorDesignPattern.Version2.IceCream;

public class Mango implements IceCream {
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public void getDesc() {
        System.out.println("Mango Cone");
    }
}
