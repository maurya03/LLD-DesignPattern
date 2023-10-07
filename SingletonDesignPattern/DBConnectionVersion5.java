package SingletonDesignPattern;

public class DBConnectionVersion5 {
    String userName;
    String userPassword;

    private static DBConnectionVersion5 instance;

    private DBConnectionVersion5 () {}

    public static DBConnectionVersion5 getInstance()
    {
        instance = new DBConnectionVersion5();
        return instance;
    }
}
