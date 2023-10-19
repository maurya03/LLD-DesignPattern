package StreategyDesignPattern.Version3;

import StreategyDesignPattern.Common.Mode;

public class PracticalFactory {
    static PathFinder getPathFind(Mode mode)
    {
        if(mode == Mode.Walk)
            return new WalkPathFinder();
        else if(mode == Mode.Bike)
            return new BikePathFinder();
        else if(mode == Mode.Car)
            return new CarPathFinder();
        return null;
    }
}
