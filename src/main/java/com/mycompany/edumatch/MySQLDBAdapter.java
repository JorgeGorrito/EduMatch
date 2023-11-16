package com.mycompany.edumatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLDBAdapter implements IDBAdapter{
    private static final String DB_PROPERTIES = "META-INF/DBMySQL.properties";

    //Propiedades de los archivos properties
    private static final String DB_NAME_PROP = "dbname";
    private static final String DB_HOST_PROP = "host";
    private static final String DB_PASSWORD_PROP = "password";
    private static final String DB_PORT_PROP = "port";
    private static final String DB_USER_PROP = "user";

    @Override
    public Connection obtenerConexion() {
        try {
            String connectionString = this.createConnectionString();
            Connection conexion = DriverManager.getConnection(connectionString);
            return conexion;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String createConnectionString(){
        Properties prop = PropertiesDBUtil.loadProperty(DB_PROPERTIES);
        String host = prop.getProperty(DB_HOST_PROP);
        String port = prop.getProperty(DB_PORT_PROP);
        String db = prop.getProperty(DB_NAME_PROP);
        String user = prop.getProperty(DB_USER_PROP);
        String password = prop.getProperty(DB_PASSWORD_PROP);

        String connectioString = "jdbc:mysql://"+host+":"+port+"/"
        +db+"?user="+user+"&password="+password;

        System.out.println("Connection String ==> " + connectioString);
        return connectioString;
    }
}