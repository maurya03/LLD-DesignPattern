package FactoryDesignPattern;

import FactoryDesignPattern.DB.MangoDB;

public class Client {
    public static void main(String[] args) {
        String queryText= "";
        DatabaseVersion1 db = new MangoDB();
        db.execute(queryText);
    }
    // So In this Version no violation of OCP and SRP.
    // We will learn dependency injection container that will return the specific object.
}
