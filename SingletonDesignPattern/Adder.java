package SingletonDesignPattern;

public class Adder implements Runnable{
    @Override
    public void run() {
        DBConnectionVersion6 db2 = DBConnectionVersion6.getInstance();
        System.out.println("Hello");
    }
}
