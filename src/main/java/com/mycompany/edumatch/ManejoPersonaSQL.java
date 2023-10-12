package com.mycompany.edumatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ManejoPersonaSQL implements IManejoBDPersona {

    private ConexionDB conexion = new ConexionDB();
    private Connection conn = conexion.obtenerConexion(); 

    public void guardar(PersonaDTO persona) {
        String insertQuery = "INSERT INTO persona (cedula, nombres, apellidos, correoinstitucional) VALUES (?, ?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
            pstmt.setString(1, persona.getCedula());
            pstmt.setString(2, persona.getNombres());
            pstmt.setString(3, persona.getApellidos());
            pstmt.setString(4, persona.getCorreoInstitucional());

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Persona guardada con éxito.");
            } else {
                System.out.println("No se pudo guardar la persona.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public PersonaDTO cargar(String cedula) {
        String selectQuery = "SELECT * FROM persona WHERE cedula = ?";
        PersonaDTO persona = null;

        try (PreparedStatement pstmt = conn.prepareStatement(selectQuery)) {
            pstmt.setString(1, cedula);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // Construir un objeto PersonaDTO con los datos recuperados de la base de datos
                persona = new PersonaDTO(
                    rs.getString("cedula"),
                    rs.getString("nombres"),
                    rs.getString("apellidos"),
                    rs.getString("correoinstitucional")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return persona;
    }

    public List<PersonaDTO> cargarTodos() {
        String selectAllQuery = "SELECT * FROM persona";
        List<PersonaDTO> personas = new ArrayList<>();

        try (PreparedStatement pstmt = conn.prepareStatement(selectAllQuery)) {
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                // Construir un objeto PersonaDTO por cada fila de resultados
                PersonaDTO persona = new PersonaDTO(
                    rs.getString("cedula"),
                    rs.getString("nombres"),
                    rs.getString("apellidos"),
                    rs.getString("correo_institucional")
                );

                personas.add(persona);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return personas;
    }
}
