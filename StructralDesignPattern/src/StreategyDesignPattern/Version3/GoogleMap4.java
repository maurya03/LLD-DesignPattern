package StreategyDesignPattern.Version3;

import StreategyDesignPattern.Common.Mode;

public abstract class GoogleMap4 {
    void findPath(String from, String to, Mode mode)
    {
        PathFinder pf = getPathFind();
        pf.findPath(from, to);
    }
    public abstract PathFinder getPathFind();
}
