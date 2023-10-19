package SingletonDesignPattern;

public class DBConnectionVersion4 {
    String userName;
    String userPassword;

    private DBConnectionVersion4 () {}

    public static DBConnectionVersion4 getInstance()
    {
        return new DBConnectionVersion4();
    }
}
