package StreategyDesignPattern.Version3.Shared;

import StreategyDesignPattern.Version3.CarPathFinder;
import StreategyDesignPattern.Version3.GoogleMap3;
import StreategyDesignPattern.Version3.PathFinder;

public class GoogleMapForCar extends GoogleMap3 {
    @Override
    public PathFinder getPathFind() {
        return new CarPathFinder();
    }
}
