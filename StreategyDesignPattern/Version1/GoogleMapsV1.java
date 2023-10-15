package StreategyDesignPattern.Version1;

import StreategyDesignPattern.Common.Mode;

/*
    Prerequisites:
        Interface and loose Coupling
            For Example: Music System and Car
    Categories of Design Pattern
    1. Creational Design Pattern
        1.1 Bother themselves with the activity of object creation.
            1.1.1 How many objects to create.
            1.1.2 How to create objects.
            Ex: a. Singleton
                b. Builder
                c. Factory - Factory Method/Abstract Factory/Practical Factory
                d. Prototype
    2. Structural Design Pattern
        2.1. Bother themselves about structure of classes
        2.2 What attributes to add
        Ex. Composite Design Pattern
            Class Node {
                int data;
                ArrayList<Node> children;
                --- Defining Structure of node ---
            }
    3. Behavioural Design Pattern
        3.1 Bothers about how to add behaviours to classes.
        Ex. 1. Iterator Design Pattern -- we will iterate ( apply iterator on each element of above create
                                                               Node).
            2. Strategy Design Pattern
 */
/*
    Story Which will be implemented as part of Strategy Design Pattern
        -- We have seen a Google map, in which we have an origin and destination text box to fill the from
        and to then press the Go button and Google will let us know the shortest path.
        Apart from this we also a type of vehicle like Car/Bike/Walk/etc.,

        So we will implement Google Maps class as per above feature using Strategy Design Pattern.
 */
public class GoogleMapsV1 {
    String From;
    String To;
    Mode mode;

    GoogleMapsV1(String from, String to, Mode mode)
    {
        this.From = from;
        this.To = to;
        this.mode = mode;
    }

    void findPath()
    {
        if(mode == Mode.Car)
            System.out.println("Path Via Car");
        else if(mode == Mode.Walk)
            System.out.println("Path Via Walk");
        else if(mode == Mode.Bike)
            System.out.println("Path Via Bike");
    }
}
/*
    Problem in above code
        1. SRP Violation --  All the type of map Bike/Car/Walk in one Class
        2. OCP Violation --  many if-else
    Now, We will Move to V2.
 */
