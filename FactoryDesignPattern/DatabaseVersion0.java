package FactoryDesignPattern;

import FactoryDesignPattern.Common.MangoDBQuery;
import FactoryDesignPattern.Common.MySqlQuery;
import FactoryDesignPattern.Common.PostSqlQuery;
import FactoryDesignPattern.Common.QueryNew;

import java.util.Objects;

/*
 Factory method:
        1 How to create objects belongs to class hierarchy
        2 Factories deal with the object creation for a class hierarchy.

        Problem Statement which we implement behalf of Factory method
            We have userService class which help to interact with user table in the database
                1 CreateUser()
                2 deleteUser()
                3 UpdateUser()
                4 getUser(int userId)

                userDetails is a object which have property like name, password, email, address, etc.,
                CreateUser(userDetails user)
                {
                    Database db = new Database("MySQL") // Database can be of many type like MySql, PostGRE, MangoDB
                    db.execute(QueryText from user);
                }


                Now, we are implementing class hierarchy for CreateUser.
 */
public class DatabaseVersion0 {

// Type can be of MySql, PostSql, MangoDB
    private String type;
    public DatabaseVersion0(String type)
    {
        this.type = type;
    }

    void execute(String queryText)
    {
//        QueryNew q = getQuery(queryText);
//        q.execute();

    }
    /*
    ---Uncomment it when testing for Version 0---
    QueryNew getQuery(String queryText)
    {
        if(Objects.equals(type, "MySql"))
            return new MySqlQuery(queryText);
        else if(Objects.equals(type, "MangoDB"))
            return new MangoDBQuery(queryText);
        else
            return new PostSqlQuery(queryText);
    }
     */
    // getQuery method will return query object based on database type.
    /*
    Problem : OCP and SRP Violation...
     */
}
