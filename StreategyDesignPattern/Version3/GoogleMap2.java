package StreategyDesignPattern.Version3;

import StreategyDesignPattern.Common.Mode;

public class GoogleMap2 {
    // Practical Factory Method
    void findPath(String from, String to, Mode mode)
    {
        PathFinder pf = PracticalFactory.getPathFind(mode);
        pf.findPath(from, to);
    }
}
