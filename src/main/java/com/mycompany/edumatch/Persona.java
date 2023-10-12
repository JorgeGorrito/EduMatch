package com.mycompany.edumatch;

// Clase Persona
public class Persona {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String correoInstitucional;
    private Horario horario;

    public Persona(String cedula, String nombres, String apellidos, String correoInstitucional, Horario horario) {
		this.AsignarPersona(cedula, nombres, apellidos, correoInstitucional, horario);
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
      System.out.println("Cédula: " + this.cedula); System.out.println("Nombres: " + this.nombres); System.out.println("Apellidos: " + this.apellidos); System.out.println("Correo institucional: " + this.correoInstitucional); System.out.println("Horario: " + this.horario); 
      }

    // Getters y setters


    private void AsignarPersona(String cedula, String nombres, String apellidos, String correoInstitucional, Horario horario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
