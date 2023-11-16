package com.mycompany.edumatch;

// Clase Persona
public class Persona {
    private String cedula;
    private String codigoInstitucional;
    private String nombres;
    private String apellidos;
    private String correoInstitucional;
    private Horario horario;

    public Persona(String codigo, String cedula, String nombres, String apellidos, String correoInstitucional, Horario horario) {
        this.codigoInstitucional = codigo;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoInstitucional = correoInstitucional;
        this.horario = horario;
    }

    public Persona(PersonaDTO persona) {
        this.cedula = persona.getCedula();
        this.nombres = persona.getNombres();
        this.apellidos = persona.getApellidos();
        this.correoInstitucional = persona.getCorreoInstitucional();
    }

    // Método mostrarPersona 
    public void mostrarPersona() {
        // Usa el método println para imprimir cada atributo y su valor 
        System.out.println("Código Institucional: " + this.codigoInstitucional);
        System.out.println("Cédula: " + this.cedula);
        System.out.println("Nombres: " + this.nombres);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("Correo institucional: " + this.correoInstitucional);
        System.out.println("Horario: " + this.horario);
    }

    // Getters y setters

    public String getCodigo() {
        return this.codigoInstitucional;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public Horario getHorario() {
        return horario;
    }
}
