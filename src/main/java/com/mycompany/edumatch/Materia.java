package com.mycompany.edumatch;

// Clase Materia
public class Materia {
    // Atributos de la materia

	private String nombre;
	private String codigo;
    public Materia(String codigo, String nombre) {
        // Inicialización de atributos
		this.AsignarMateria(codigo, nombre);
    }

	public void AsignarMateria(String codigo, String nombre){
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public String obtenerCodigo(){
		return this.codigo;
	}

	public String obtenerNombre(){
		return this.nombre;
	}
}
