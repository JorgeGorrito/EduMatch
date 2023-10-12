package com.mycompany.edumatch;

public class Actividad {
    private int horaInicio;
	private int horaFinalizacion;
	private int numeroDia;
	private Grupo grupo;


    public Actividad(int horaInicio, int horaFinalizacion, int numeroDia, Grupo grupo) {
		this.asignarActividad(horaInicio, horaFinalizacion, numeroDia, grupo);
    }

	public void asignarActividad(int horaInicio, int horaFinalizacion, int numeroDia, Grupo grupo){
		this.horaFinalizacion = horaFinalizacion;
		this.horaInicio = horaInicio;
		this.numeroDia = numeroDia;
		this.grupo = grupo;
	}

	public int obtenerHoraInicio(){
		return this.horaInicio;
	}

	public int obtenerHoraFinalizacion(){
		return this.horaFinalizacion;
	}

	public Grupo obtenerGrupo(){
		return this.grupo;
	}

    // Métodos relacionados con la actividad
}
