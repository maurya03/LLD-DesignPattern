package SingletonDesignPattern;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConnectionVersion6 {
    String userName;
    String userPassword;

    private static DBConnectionVersion6 instance;
    private static final Lock lock = new ReentrantLock();

    private DBConnectionVersion6 () {}

    public static DBConnectionVersion6 getInstance()
    {
        if(instance == null) {
            lock.lock();
            if(instance == null) {
                instance = new DBConnectionVersion6();
            }
            lock.unlock();
        }
        return instance;
    }
}
