/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.edumatch;

/**
 *
 * @author jorge
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

public class OperacionesBDPersonaMySQL extends OperacionesBDPersonaSQL{
    public OperacionesBDPersonaMySQL(Connection conexion){
        super(conexion);
    }
    
    
 public Timestamp obtenerFechaYHora() {
    try {
        // Crear una sentencia para ejecutar la consulta
        Statement stmt = conexion.createStatement();
        // Ejecutar la consulta y obtener el resultado
        ResultSet rs = stmt.executeQuery("SELECT NOW()");
        if (rs.next()) {
            // Obtener el timestamp como un objeto Timestamp
            Timestamp timestamp = rs.getTimestamp(1);
            // Cerrar los recursos
            rs.close();
            stmt.close();
            // Retornar el timestamp
            return timestamp;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    // Si algo sale mal, retornar un valor por defecto
    return null;
}


}
