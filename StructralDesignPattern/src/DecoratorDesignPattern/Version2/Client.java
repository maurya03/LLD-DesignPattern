package DecoratorDesignPattern.Version2;
import DecoratorDesignPattern.Version2.AddOn.Cherry;
import DecoratorDesignPattern.Version2.AddOn.VanillaScoop;
import DecoratorDesignPattern.Version2.Cone.Mango;

public class Client {
    public static void main(String[] args) {
        //Version 2
        // MangoCone + Vanilla + cherry + vanilla + cherry
        IceCream mc = new Mango();
        IceCream mcWVS = new VanillaScoop(mc);
        IceCream mcWVSWC = new Cherry(mcWVS);
        IceCream mcWVSWCWVS = new VanillaScoop(mcWVSWC);
        int cost = mcWVSWCWVS.getCost();
        System.out.println(cost);
    }
}
/*
    Real life use of decorator...
            JDK
              1.Writer
                1.1 File Writer
                1.2 Console Writer
               AddOn
                1. Compression Writer (has Writer w inside it)
                2. Encryption writer (has Writer w inside it)
                3. New line writer (has Writer w inside it)

 */
