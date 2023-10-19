package SingletonDesignPattern;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        //Version 1 of DB Connection...
        /*
        SingletonDesignPattern.DBConnectionVersion1 db1 = new SingletonDesignPattern.DBConnectionVersion1("maurya","abc");
        SingletonDesignPattern.DBConnectionVersion1 db2 = new SingletonDesignPattern.DBConnectionVersion1("maurya","abc");
        System.out.print(db1);
        System.out.print(db2);
         */
        // From the above code we can create 2 different Instances of classes,Singleton failed...

        /* Version 4
        SingletonDesignPattern.DBConnectionVersion4 db1 = new SingletonDesignPattern.DBConnectionVersion4(); -- not possible t create
        SingletonDesignPattern.DBConnectionVersion4 db1 = SingletonDesignPattern.DBConnectionVersion4.getInstance();
        SingletonDesignPattern.DBConnectionVersion4 db2 = SingletonDesignPattern.DBConnectionVersion4.getInstance();
         */
        /*
        Version 5...
        SingletonDesignPattern.DBConnectionVersion5 db1 = SingletonDesignPattern.DBConnectionVersion5.getInstance();
        SingletonDesignPattern.DBConnectionVersion5 db2 = SingletonDesignPattern.DBConnectionVersion5.getInstance();
        */
        /*
        Version 6...
        SingletonDesignPattern.DBConnectionVersion6 db1 = SingletonDesignPattern.DBConnectionVersion6.getInstance();
        SingletonDesignPattern.DBConnectionVersion6 db2 = SingletonDesignPattern.DBConnectionVersion6.getInstance();

        Note: Above code is fine for single threaded application, but for multi-thread application, it can still
        create multiple objects due to the race conditions.
         */
        /*
        Version 7 with multi-Thread application...
         */
        DBConnectionVersion6 db1 = DBConnectionVersion6.getInstance();
        Thread t1 = new Thread(new Adder());
        Thread t2 = new Thread(new Subtract());
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
