package com.mycompany.edumatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String URL = "jdbc:postgresql://localhost:5432/software2lab";
    private static final String USUARIO = "postgres";
    private static final String CONTRASENA = "admin";
    private static Connection conexion = null;

    public static Connection obtenerConexion() {
        try {
            if (conexion == null){
                conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            } 
            return conexion;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al establecer la conexión a la base de datos.");
        }
    }
}
