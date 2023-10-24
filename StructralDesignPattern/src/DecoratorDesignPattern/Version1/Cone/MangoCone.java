package DecoratorDesignPattern.Version1.Cone;

import DecoratorDesignPattern.Version1.ingredient;

public class MangoCone implements ingredient {
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public void getDesc() {
        System.out.println("MangoCone, ");
    }
}
