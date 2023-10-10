package PrototypeDesignPattern;

public class StudentOptimizedApproach3 {
    private String name;
    private int age;
    public String batch;
    public String instName;

    public StudentOptimizedApproach3(){}
    public StudentOptimizedApproach3(StudentOptimizedApproach3 orig)
    {
        this.name = orig.name;
        this.age = orig.age;
        this.batch = orig.batch;
        this.instName = orig.instName;
    }

    StudentOptimizedApproach3 Clone()
    {
        return new StudentOptimizedApproach3(this);
    }
}
