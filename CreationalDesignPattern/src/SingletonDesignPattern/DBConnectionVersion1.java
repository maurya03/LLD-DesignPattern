package SingletonDesignPattern;

public class DBConnectionVersion1 {
    /*
        The basic idea behind Singleton Design Pattern is to....
        Problem:
        1. How can we create a class for which only single class can be created.
        Why Singleton is required:
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
     */
    String userName;
    String userPassword;

    public DBConnectionVersion1(String userName, String userPassword)
    {
        this.userName = userName;
        this.userPassword = userPassword;
    }
}
