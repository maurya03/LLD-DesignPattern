package FactoryDesignPattern.DB;

import FactoryDesignPattern.Common.PostSqlQuery;
import FactoryDesignPattern.Common.QueryNew;
import FactoryDesignPattern.DatabaseVersion1;

public class PostSql extends DatabaseVersion1 {
    @Override
    public QueryNew getQuery(String queryText) {
        return new PostSqlQuery(queryText);
    }
}
