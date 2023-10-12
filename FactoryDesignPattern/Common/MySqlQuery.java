package FactoryDesignPattern.Common;

import FactoryDesignPattern.DatabaseVersion1;

public class MySqlQuery extends QueryNew{
    private String queryText;
    public MySqlQuery(String queryText)
    {
        this.queryText = queryText;
    }

    @Override
    public void execute() {
        System.out.println("Executes MySqlQuery query");
    }
}
