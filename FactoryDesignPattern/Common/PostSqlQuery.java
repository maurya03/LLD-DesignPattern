package FactoryDesignPattern.Common;

import FactoryDesignPattern.DatabaseVersion1;

public class PostSqlQuery extends QueryNew{
    private String queryText;
    public PostSqlQuery(String queryText)
    {
        this.queryText = queryText;
    }

    @Override
    public void execute() {
        System.out.println("Executes PostSqlQuery query");
    }
}
