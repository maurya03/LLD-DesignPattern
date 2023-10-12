package FactoryDesignPattern.DB;
import FactoryDesignPattern.Common.MangoDBQuery;
import FactoryDesignPattern.Common.QueryNew;
import FactoryDesignPattern.DatabaseVersion1;

public class MangoDB extends DatabaseVersion1 {
    @Override
    public QueryNew getQuery(String queryText) {
        return new MangoDBQuery(queryText);
    }
}
