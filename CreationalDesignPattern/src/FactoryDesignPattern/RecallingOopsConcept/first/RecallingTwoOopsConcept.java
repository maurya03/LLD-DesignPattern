package FactoryDesignPattern.RecallingOopsConcept.first;

public abstract class RecallingTwoOopsConcept {

    abstract void work();
    void fun()
    {
        System.out.println("pre work");
        work();
        System.out.println("post work");
    }
}
