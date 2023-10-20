# LLD-DesignPattern
I will cover mostly 12 widely used design pattern

The basic idea behind Singleton Design Pattern is to solve the following problem.
        Problem:
        -> How can we create a class for which only single class can be created.
        -> Why Singleton is required:
            1. For Costly shared resources e.g., database connection
            Object creation of database connection is costly [takes time] because this object can be created only
            after tcp connection is established between app server & db server [ requires a 3-way hand-shake]
            2. DB Connection
            It is costly to create
            It can be shared between modules
            like users, products, employee.

            java Code:
            AppServer
            {
                User :
                Product :
                Employees :
            }
            All above three modules are needed DB Connection, that's why DB Connection is shared instead creating
            separately for each one.


Categories of Design Pattern
1. Creational Design Pattern
1.1 Bother themselves with the activity of object creation.
1.1.1 How many objects to create.
1.1.2 How to create objects.
Ex: a. Singleton
b. Builder
c. Factory - Factory Method/Abstract Factory/Practical Factory
d. Prototype
2. Structural Design Pattern
2.1. Bother themselves about structure of classes
2.2 What attributes to add
Ex. Composite Design Pattern
Class Node {
int data;
ArrayList<Node> children;
--- Defining Structure of node ---
}
3. Behavioural Design Pattern
   3.1 Bothers about how to add behaviours to classes.
   Ex. 1. Iterator Design Pattern -- we will iterate ( apply iterator on each element of above create
          Node).
       2. Strategy Design Pattern
