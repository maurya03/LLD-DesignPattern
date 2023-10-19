package FactoryDesignPattern.DB;
import FactoryDesignPattern.Common.MySqlQuery;
import FactoryDesignPattern.Common.QueryNew;
import FactoryDesignPattern.DatabaseVersion1;

public class MySqlDB extends DatabaseVersion1 {
    @Override
    public QueryNew getQuery(String queryText) {
        return new MySqlQuery(queryText);
    }
}
