package DecoratorDesignPattern.Version2.AddOn;

import DecoratorDesignPattern.Version2.IceCream;

public class Cherry implements IceCream {
    IceCream ic;

    public Cherry(IceCream ref)
    {
        this.ic = ref;
    }
    @Override
    public int getCost()
    {
        return 7 + ic.getCost();
    }

    @Override
    public void getDesc() {
        System.out.println(" With Cherry ");
    }
}
