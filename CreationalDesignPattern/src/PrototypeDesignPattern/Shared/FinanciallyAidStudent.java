package PrototypeDesignPattern.Shared;

import PrototypeDesignPattern.StudentOptimizedApproach0;
import PrototypeDesignPattern.StudentOptimizedApproach1;
import PrototypeDesignPattern.StudentOptimizedApproach2;

public class FinanciallyAidStudent extends StudentOptimizedApproach2/*extends StudentOptimizedApproach1*/ {
    //Begin.. Version 1
    public int scholarshipAmount;
    public FinanciallyAidStudent(){}
    //end...
    //begin.. version 2
    public FinanciallyAidStudent(FinanciallyAidStudent orig)
    {
        super(orig);
        this.scholarshipAmount = orig.scholarshipAmount;
    }
    //end

    // Version 3..begin

    FinanciallyAidStudent Clone()
    {
        return new FinanciallyAidStudent(this);
    }
    //end
}
