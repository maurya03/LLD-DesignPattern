package StreategyDesignPattern.Version3.Shared;
import StreategyDesignPattern.Common.Mode;
import StreategyDesignPattern.Version3.BikePathFinder;
import StreategyDesignPattern.Version3.GoogleMap3;
import StreategyDesignPattern.Version3.PathFinder;

public class GoogleMapForBike extends GoogleMap3 {
    @Override
    public PathFinder getPathFind() {
        return new BikePathFinder();
    }

    // For Factory Method
}
