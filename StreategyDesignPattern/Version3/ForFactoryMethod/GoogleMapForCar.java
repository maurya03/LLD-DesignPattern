package StreategyDesignPattern.Version3.ForFactoryMethod;

import StreategyDesignPattern.Version3.CarPathFinder;
import StreategyDesignPattern.Version3.GoogleMap4;
import StreategyDesignPattern.Version3.PathFinder;

public class GoogleMapForCar extends GoogleMap4 {
    @Override
    public PathFinder getPathFind() {
        return new CarPathFinder();
    }
}
