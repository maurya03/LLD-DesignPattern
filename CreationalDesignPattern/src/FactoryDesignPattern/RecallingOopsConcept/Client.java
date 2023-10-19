package FactoryDesignPattern.RecallingOopsConcept;

import FactoryDesignPattern.RecallingOopsConcept.Second.CreatingSocket;
import FactoryDesignPattern.RecallingOopsConcept.Second.IWork;
import FactoryDesignPattern.RecallingOopsConcept.first.A;
import FactoryDesignPattern.RecallingOopsConcept.first.B;
import FactoryDesignPattern.RecallingOopsConcept.first.RecallingTwoOopsConcept;
import com.sun.tools.javac.Main;

public class Client {
    // Client for the Oops Concepts...
    /*RecallingTwoOopsConcept obj = new RecallingTwoOopsConcept();
    obj.fun();
    compile time error
     */
    public static void main(String[] args) {
        // First 1...
        RecallingTwoOopsConcept objA = new A();
//    objA.fun(); need to find why getting error

        RecallingTwoOopsConcept objB = new B();
//    objB.fun(); need to find why getting error
        // Second 2...
        CreatingSocket obj = new CreatingSocket();
        //obj.fun(); run time error
        IWork a = new FactoryDesignPattern.RecallingOopsConcept.Second.A();
        IWork b = new FactoryDesignPattern.RecallingOopsConcept.Second.B();
        obj.setRef(a);
        obj.fun();
        obj.setRef(b);
        obj.fun();
    }

}
