package com.mycompany.edumatch;

import java.util.List;
import java.util.ArrayList;

// public class Grupo {
//     private Materia materia;
//     private Docente docente;
//     private Tutoria tutoria;
//     private List<Estudiante> estudiantes = new ArrayList<>();

//     public void agregarEstudiante(String cedula, String nombres, String apellidos) {
//         Estudiante estudiante = new Estudiante(cedula, nombres, apellidos);
//         estudiantes.add(estudiante);
//     }
// }

// // Después de aplicar Creador
// public class Grupo {
//     private Materia materia;
//     private Docente docente;
//     private Tutoria tutoria;
//     private List<Estudiante> estudiantes = new ArrayList<>();

//     public void agregarEstudiante(Estudiante estudiante) {
//         estudiantes.add(estudiante);
//     }
// }

// public class FabricaEstudiantes {
//     public Estudiante crearEstudiante(String cedula, String nombres, String apellidos) {
//         return new Estudiante(cedula, nombres, apellidos);
//     }
// }

public class Grupo {
    private Materia materia;
    private Docente docente;
    private List<Estudiante> estudiantes;
    private Tutoria tutoria;

    public Grupo(Materia materia, Docente docente) {
        this.materia = materia;
        this.docente = docente;
        this.estudiantes = new ArrayList<>();
    }
	


    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

	public Docente obtenerDocente(){
		return docente;
	}

	public List<Estudiante> obtenerEstudiantes(){
		return estudiantes;
	}
}
