package FactoryDesignPattern;

import FactoryDesignPattern.Common.MangoDBQuery;
import FactoryDesignPattern.Common.MySqlQuery;
import FactoryDesignPattern.Common.PostSqlQuery;
import FactoryDesignPattern.Common.QueryNew;

import java.util.Objects;
// Problem in version 0 was OCP and SRP violation because of getQuery method.
// So to solve that we make that abstract method..
public abstract class DatabaseVersion1 {
    private String type;
    public DatabaseVersion1(String type)
    {
        this.type = type;
    }

    protected DatabaseVersion1() {
    }

    public void execute(String queryText)
    {
        QueryNew q = getQuery(queryText);
        q.execute();
    }
    public abstract QueryNew getQuery(String queryText);
    /*
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
}
