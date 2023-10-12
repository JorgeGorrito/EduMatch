package com.mycompany.edumatch;

import java.sql.*;
import java.util.List;



public class EduMatch {
    
    public static void main(String[] args) throws SQLException {
         // Crear una instancia de iManejoPersonaSQL
        IManejoBDPersona manejadorPersona;// = (IManejoBDPersona) new ManejoPersonaSQL();
        IManejoBDPersonaGuardar manejadorPersonaGuardar;
        IManejoBDPersonaCargar manejadorPersonaCargar;
        manejadorPersona = new ManejoPersonaCSV();
        manejadorPersonaGuardar = manejadorPersona;
        manejadorPersonaCargar = manejadorPersona;
        
        // Ejemplo de guardar una persona
        PersonaDTO persona1 = new PersonaDTO("123456", "Juan", "Pérez", "juan@example.com");
        manejadorPersonaGuardar.guardar(persona1);
        
        // Ejemplo de cargar una persona por cédula
        String cedulaABuscar = "123456";
        PersonaDTO personaCargada = manejadorPersonaCargar.cargar(cedulaABuscar);

        if (personaCargada != null) {
            System.out.println("Persona cargada:");
            System.out.println("Cédula: " + personaCargada.getCedula());
            System.out.println("Nombres: " + personaCargada.getNombres());
            System.out.println("Apellidos: " + personaCargada.getApellidos());
            System.out.println("Correo Institucional: " + personaCargada.getCorreoInstitucional());
        } else {
            System.out.println("No se encontró ninguna persona con la cédula: " + cedulaABuscar);
        }

        // Ejemplo de cargar todas las personas
        List<PersonaDTO> todasLasPersonas = manejadorPersona.cargarTodos();

        System.out.println("Todas las personas en la base de datos:");
        for (PersonaDTO persona : todasLasPersonas) {
            System.out.println("Cédula: " + persona.getCedula());
            System.out.println("Nombres: " + persona.getNombres());
            System.out.println("Apellidos: " + persona.getApellidos());
            System.out.println("Correo Institucional: " + persona.getCorreoInstitucional());
            System.out.println("------------------------");
        }

        DocenteDTO docente1 = new DocenteDTO("123456", "Juan", "Pérez", "juan@example.com");
        Persona persona2 = new Persona(docente1);
        persona2.mostrarPersona();

        EstudianteDTO estudiante1 = new EstudianteDTO("123456", "Juan", "Pérez", "juan@example.com");
        Persona persona3 = new Persona(estudiante1);
        persona3.mostrarPersona();
    }
}
