package PrototypeDesignPattern;

public class StudentOptimizedApproach0 {
    /*
        Summary of Scenario to use prototype and registry...
        1. Multiple objects with nearly same objects (only a few difference) might be required.
            1.1 Make a sample
            1.2 Add to the registry
            1.3 On demand
                1.3.1 Get sample
                1.3.2 Make Clone
                1.3.3 Make Changes for new data members
                1.3.4 return.
     */
    private String name;
    private int age;
    public String batch;
    public String instName;

    public StudentOptimizedApproach0(String name, int age, String batch, String instName)
    {
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.instName = instName;
    }

    public StudentOptimizedApproach0(){}

    /*
        1. Create a sample or prototype object.
        2. store this prototype in a registry.
        3. On a demand of a new object
            1. Get relevant prototype from registry.
            2. Clone that prototype object.
            3. Make changes in the cloned object. [for unique property]
            4. Return the object.
     */
}
