package FactoryDesignPattern.Common;

import FactoryDesignPattern.DatabaseVersion1;

public class MangoDBQuery extends QueryNew{
    private String queryText;
    public MangoDBQuery(String queryText)
    {
        this.queryText = queryText;
    }

    @Override
    public void execute() {
        System.out.println("Executes MangoDB query");
    }
}
