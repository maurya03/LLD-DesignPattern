package DecoratorDesignPattern.Version1.Berry;

import DecoratorDesignPattern.Version1.ingredient;

public class Berry implements ingredient {
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public void getDesc() {
        System.out.println("Berry, ");
    }
}
