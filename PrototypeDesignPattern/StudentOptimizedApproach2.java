package PrototypeDesignPattern;

public class StudentOptimizedApproach2 {
    private String name;
    private int age;
    public String batch;
    public String instName;

    public StudentOptimizedApproach2(){}
    public StudentOptimizedApproach2(StudentOptimizedApproach2 orig)
    {
        this.name = orig.name;
        this.age = orig.age;
        this.batch = orig.batch;
        this.instName = orig.instName;
    }
}
