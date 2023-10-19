package StreategyDesignPattern.Version3;

public class GoogleMap1 {
    //Dependency Injection Starts
    private PathFinder ref;
    GoogleMap1(PathFinder obj)
    {
        this.ref = obj;
    }

    void setRef(PathFinder obj)
    {
        this.ref = obj;
    }
    // Dependency Injection ends using constructor.
    void findPath(String from, String to)
    {
        if(ref == null) {
            System.out.println("No Algorithm implemented");
        }
        ref.findPath(from, to);
    }
}
