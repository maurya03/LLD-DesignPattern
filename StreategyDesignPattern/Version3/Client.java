package StreategyDesignPattern.Version3;

import StreategyDesignPattern.Common.Mode;
import StreategyDesignPattern.Version3.Shared.GoogleMapForCar;

public class Client {
    public static void main(String[] args) {
        //Dependency Injection...
        GoogleMap1 gm = new GoogleMap1(null);
        //gm.findPath("Delhi", "Hyderabad");

        GoogleMap1 gm2 = new GoogleMap1(new CarPathFinder());
        gm2.findPath("Delhi", "Hyderabad");

        // Practical Factory...
        GoogleMap2 gm3 = new GoogleMap2();
        gm3.findPath("Delhi", "Hyderabad", Mode.Bike);

        //Practical Method
        GoogleMap3 gm5 = null;
        Mode mode = Mode.Car;
        gm5 = new GoogleMapForCar();
        gm5.getPathFind();

        // Abstract Factory...
    }
}
