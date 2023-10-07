public class Client {
    public static void main(String[] args) throws InterruptedException {
        //Version 1 of DB Connection...
        /*
        DBConnectionVersion1 db1 = new DBConnectionVersion1("maurya","abc");
        DBConnectionVersion1 db2 = new DBConnectionVersion1("maurya","abc");
        System.out.print(db1);
        System.out.print(db2);
         */
        // From the above code we can create 2 different Instances of classes,Singleton failed...

        /* Version 4
        DBConnectionVersion4 db1 = new DBConnectionVersion4(); -- not possible t create
        DBConnectionVersion4 db1 = DBConnectionVersion4.getInstance();
        DBConnectionVersion4 db2 = DBConnectionVersion4.getInstance();
         */
        /*
        Version 5...
        DBConnectionVersion5 db1 = DBConnectionVersion5.getInstance();
        DBConnectionVersion5 db2 = DBConnectionVersion5.getInstance();
        */
        /*
        Version 6...
        DBConnectionVersion6 db1 = DBConnectionVersion6.getInstance();
        DBConnectionVersion6 db2 = DBConnectionVersion6.getInstance();

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
