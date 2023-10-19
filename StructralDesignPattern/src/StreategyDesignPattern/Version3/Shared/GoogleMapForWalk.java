package StreategyDesignPattern.Version3.Shared;

import StreategyDesignPattern.Version3.GoogleMap3;
import StreategyDesignPattern.Version3.PathFinder;
import StreategyDesignPattern.Version3.WalkPathFinder;

public class GoogleMapForWalk extends GoogleMap3 {
    @Override
    public PathFinder getPathFind() {
        return new WalkPathFinder();
    }
}
