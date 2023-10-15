package StreategyDesignPattern.Version2;

import StreategyDesignPattern.Common.Mode;

public class GoogleMap {
    void findPath(String from, String to, Mode mode)
    {
        if(mode == Mode.Car)
        {
            CarPathFinder cpf = new CarPathFinder();
            cpf.findPath(from, to);
        }
        else if(mode == Mode.Bike)
        {
            BikePathFinder bpf = new BikePathFinder();
            bpf.findPath(from, to);
        }
        else if(mode == Mode.Walk)
        {
            WalkPathFinder wpf = new WalkPathFinder();
            wpf.findPath(from, to);
        }
    }
}
/*
    SRP Violation Resolved.
    Problem in Version 2:
        1. OCP Violation still exist. many if-else
        2. Dependency Inversion Principle (DIP) Violation (tight coupling)
            GoogleMap1 is tightly coupled with Car/Bike/Walk Finder.

       Solution:
        We can solve above problem in four ways
            1. Dependency Injection
            2. Practical Factory
            3. Factory Method
            4. Abstract Factory
 */
