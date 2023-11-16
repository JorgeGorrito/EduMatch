package com.mycompany.edumatch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class OperacionesBDPersonaSQL implements IOperacionesCrudDB<Persona> {
    protected Connection conexion;

    public OperacionesBDPersonaSQL(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public void crear(Persona entidad) {
        String consulta = "INSERT INTO persona (codigo, cedula, nombres, apellidos, correoInstitucional) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, entidad.getCodigo());
            statement.setString(2, entidad.getCedula());
            statement.setString(3, entidad.getNombres());
            statement.setString(4, entidad.getApellidos());
            statement.setString(5, entidad.getCorreoInstitucional());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Persona leer(String codigo) {
        String consulta = "SELECT * FROM persona WHERE codigo = ?";
        try {
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, codigo);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String cedula = resultSet.getString("cedula");
                String nombres = resultSet.getString("nombres");
                String apellidos = resultSet.getString("apellidos");
                String correoInstitucional = resultSet.getString("correoInstitucional");
                return new Persona(codigo, cedula, nombres, apellidos, correoInstitucional, null);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void actualizar(Persona entidad) {
        String consulta = "UPDATE persona SET cedula = ?, nombres = ?, apellidos = ?, correoInstitucional = ? WHERE codigo = ?";
        try {
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, entidad.getCedula());
            statement.setString(2, entidad.getNombres());
            statement.setString(3, entidad.getApellidos());
            statement.setString(4, entidad.getCorreoInstitucional());
            statement.setString(5, entidad.getCodigo());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(String codigo) {
        String consulta = "DELETE FROM persona WHERE codigo = ?";
        try {
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, codigo);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Persona> listar() {
        List<Persona> personas = new ArrayList<>();
        String consulta = "SELECT * FROM persona";
        try {
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String codigo = resultSet.getString("codigo");
                String cedula = resultSet.getString("cedula");
                String nombres = resultSet.getString("nombres");
                String apellidos = resultSet.getString("apellidos");
                String correoInstitucional = resultSet.getString("correoInstitucional");
                personas.add(new Persona(codigo, cedula, nombres, apellidos, correoInstitucional, null));
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personas;
    }
}
