package FactoryDesignPattern.RecallingOopsConcept.Second;

public class CreatingSocket {
    private IWork ref;

    public void setRef(IWork ref)
    {
        this.ref = ref;
    }

    public void fun()
    {
        System.out.println("Pre Work");
        ref.work();
        System.out.println("Post Work");
    }
}
