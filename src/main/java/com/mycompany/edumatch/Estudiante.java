package com.mycompany.edumatch;

// Clase Estudiante
public class Estudiante extends Persona {
    private String codigoEstudiante;
    public Estudiante(String cedula, String nombres, String apellidos, String correoInstitucional, Horario horario, String codigoEstudiante) {
        super(cedula, nombres, apellidos, correoInstitucional, horario);
        this.codigoEstudiante = codigoEstudiante;
    }

}
