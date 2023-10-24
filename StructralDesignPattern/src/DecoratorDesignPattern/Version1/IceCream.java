package DecoratorDesignPattern.Version1;

import java.util.ArrayList;
import java.util.List;

/*
    Main Objective: Dynamically add responsibilities to objects at runtime.

    1. We have a softy vending machine
            MangoCone -> Mango/Vanilla/Strawberry
            Syrup -> Chocolate/Strawberry/Mango
            Scoops -> Strawberry/Piste/Mango
            chips Chocolate/Pineapple/Dry Fruits
            Berries -> Cherry/BlueBerry/BlackBerry
   2. Prepare your ice cream.
   3. Print the description of bill.
   4. Cost of bill.
   So, we will mainly focus on get description and get bills.
 */
public class IceCream {
    private List<ingredient> contents = new ArrayList<>();

    public void addIngredient(ingredient ing)
    {
        contents.add(ing);
    }

    public int getCost()
    {
        int cost = 0;
        for(ingredient i : contents)
        {
            cost += i.getCost();
        }
        return cost;
    }

    public void getDesc()
    {
        for(ingredient i : contents)
        {
            i.getDesc();
        }
        System.out.println("Ingredients are added!");
    }
}
