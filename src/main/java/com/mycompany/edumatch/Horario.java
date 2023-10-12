package com.mycompany.edumatch;

import java.util.List;
import java.util.ArrayList;

// Clase Horario
public class Horario {
    private List<Actividad> actividades;

    public Horario() {
        this.actividades = new ArrayList<>();
    }

    public void agregarActividad(Actividad actividad) {
        actividades.add(actividad);
    }

	public List<Actividad> obtenerActividades(){
		return this.actividades;
	}

    // Otros métodos para gestionar el horario
}