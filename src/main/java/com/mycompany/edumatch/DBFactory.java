package com.mycompany.edumatch;

import java.util.Properties;

public class DBFactory {
    private final String DB_FACTORY_PROPERTY_URL = "META-INF/DBFactory.properties";
    private final String DEFAULT_DB_CLASS_PROP = "defaultDBClass";
    
    public static DBFactory dbfactory = null;
    
    private DBFactory(){}
    
    
    public static DBFactory getInstance(){
        if (dbfactory == null) dbfactory = new DBFactory();
        return dbfactory;
    }
    
    public IDBAdapter getDBadapter(DBType dbType) {
        switch (dbType){
            case MySQL:
                return new MySQLDBAdapter(); 
            case Postgresql:
                return new PostgresqlDBAdapter(); 
            default:
                throw new IllegalArgumentException("Gestor de BD no soportado");
        }
    }
    
    public IDBAdapter getDefaultDBAdapter(){
        try{
            Properties prop = PropertiesDBUtil.loadProperty(DB_FACTORY_PROPERTY_URL);
            String defaultDBClass = prop.getProperty(DEFAULT_DB_CLASS_PROP);
            System.out.println("DefaultDBClass ==> " + defaultDBClass);
            return (IDBAdapter) Class.forName(defaultDBClass).newInstance();
        } catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
