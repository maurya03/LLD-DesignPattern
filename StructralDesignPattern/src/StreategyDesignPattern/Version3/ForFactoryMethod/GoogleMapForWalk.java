package StreategyDesignPattern.Version3.ForFactoryMethod;

import StreategyDesignPattern.Version3.GoogleMap4;
import StreategyDesignPattern.Version3.PathFinder;
import StreategyDesignPattern.Version3.WalkPathFinder;

public class GoogleMapForWalk extends GoogleMap4 {
    @Override
    public PathFinder getPathFind() {
        return new WalkPathFinder();
    }
}
