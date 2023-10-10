package PrototypeDesignPattern;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        /*
        Given Object...
         */
        // Brute force Version 0...
        BruteForceApproach original = new BruteForceApproach();
        original.height = 10;
        original.width = 20;
        original.numOfPages = 100;
        original.type = TypeOfPages.Blank;
        // Now, we need to create copy of these 100 object from above given object...
        List<BruteForceApproach> notebook0List = new ArrayList<BruteForceApproach>();
        for(int i=0;i<100;i++)
        {
            BruteForceApproach n = new BruteForceApproach();
            n.type = original.type;
            n.height = original.height;
            n.width = original.width;
            n.numOfPages = original.numOfPages;
            notebook0List.add(n);
        }
        /*
            During creation of the prototype object, we need to create Deep copy, not a shallow copy.
            Problem :
            1. Client class is violating SRP, since client class responsibility is not to create copy of the
               object. Whilst the responsibility is to make an object of a class.
            2. Responsibility of making copy of the class is of Notebook class.
         */

        // Optimized Version 0...
        StudentOptimizedApproach0 orig = new StudentOptimizedApproach0("Akash",20,"A","ABC");
        StudentOptimizedApproach0 copy = orig;
        copy.instName = "B";
        /*
            copy is not a deep copy, it's a shallow copy.
            To verify Shallow/Deep copy, follow following rules...
            1. If changing property value of copy object can change the property value of original copy then it's
               shallow copy else deep copy.
         */
        /*
        Problem in Version 0:
        1. No new object created.
        2. copy and original are references to the same instances.
        3. Change property / data members in one, then the change also shows in the others.
         */

        // Optimized Version 1...
        StudentOptimizedApproach1 orig1 = new StudentOptimizedApproach1("Akash", 10,"D","DEF");
        StudentOptimizedApproach1 copy1 = new StudentOptimizedApproach1();
        copy1.instName = orig1.instName;
        copy1.batch = orig1.batch;
        /*
        Problem in Version 1:
        1. Private data members can't be accessed for a copy.
        2. SRP of client is getting violated, the responsibility of providing a copy should be that of student
           class.
        3. If a student class have an inheritance hierarchy, the client will also show OCP violates.
         */
        // For Optimized Version 1, 2 & 3 have created getStudent()...
    }

    // Looking for OCP Violates...
    /*
    StudentOptimizedApproach1 getStudent(StudentOptimizedApproach1 s)
    {
        if(s instanceof MeritStudent)
        {
            MeritStudent m = new MeritStudent();
            m.batch = s.batch;
            m.instName = s.instName;
            m.discountAmount = 2000;
            return m;
        } else if (s instanceof FinanciallyAidStudent) {
            FinanciallyAidStudent f = new FinanciallyAidStudent();
            f.batch = s.batch;
            f.instName = s.instName;
            f.scholarshipAmount = 3000;
            return f;
        }
        else {
            return s;
        }
    }
     */
    //If we add one more type of students then, one more if condition.
    // It will also violate SRP, that we resolve using separate function for each type of student.

    // Version 2...
/*
    StudentOptimizedApproach2 getStudent(StudentOptimizedApproach2 s)
    {
        if(s instanceof MeritStudent)
        {
            return new MeritStudent((MeritStudent) s);
        } else if (s instanceof FinanciallyAidStudent) {
            return new FinanciallyAidStudent((FinanciallyAidStudent) s);
        }
        else {
            return s;
        }
    }
    Problem: OCP violates still not solved...
 */
    //Version 3...
    StudentOptimizedApproach3 getStudent(StudentOptimizedApproach3 orig)
    {
        return orig.Clone(); // Clone method will be called accordingly, as per orig object type.
    }
}
