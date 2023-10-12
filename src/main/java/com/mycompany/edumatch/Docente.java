package com.mycompany.edumatch;

// Clase Docente
public class Docente extends Persona {
    private String codigoDocente;
    public Docente(String cedula, String nombres, String apellidos, String correoInstitucional, Horario horario, String codigoDocente) {
        super(cedula, nombres, apellidos, correoInstitucional, horario);
        this.codigoDocente = codigoDocente;
    }
    
}

