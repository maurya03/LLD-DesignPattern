package PrototypeDesignPattern.Shared;

import PrototypeDesignPattern.StudentOptimizedApproach1;
import PrototypeDesignPattern.StudentOptimizedApproach2;

public class MeritStudent extends StudentOptimizedApproach2/*extends StudentOptimizedApproach1*/ {
    public int discountAmount;

    //Begin.. Version 2
    public MeritStudent(MeritStudent orig)
    {
        super(orig);
        this.discountAmount = orig.discountAmount;
    }
    //End...
    //Begin Version 3...
    MeritStudent Clone()
    {
        return new MeritStudent(this);
    }
    //End...
}
