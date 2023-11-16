package com.mycompany.edumatch;

import java.util.List;
import java.util.ArrayList;

public abstract class AbstractProcesoBusquedadHorario {
    protected List<Persona> personas = new ArrayList<>();
    protected List<Horario> horarios = new ArrayList<>();
    protected List<Horario> horariosDisponibles = new ArrayList<>();
    protected HorarioLibre horarioDisponible;
    protected Grupo grupo;

    public abstract void obtenerHorarioDisponibleDocente();
    public abstract void obtenerHorarioDisponibleEstudiantes();
    public abstract void mostrarHorarioDisponible();

    public AbstractProcesoBusquedadHorario(Grupo grupo){
        this.grupo = grupo;
    }

    public final void ejecutar() throws Exception{
        cargarDatos();
        obtenerHorarioDisponibleDocente();
        obtenerHorarioDisponibleEstudiantes();
        buscarInterseccionHorariosDisponibles();
        mostrarHorarioDisponible();
    }

    protected void cargarDatos(){
        this.horarios.add(this.grupo.obtenerDocente().getHorario());
        for (Estudiante estudiante: this.grupo.obtenerEstudiantes()){
            this.horarios.add(estudiante.getHorario());
        }
    }

    private void buscarInterseccionHorariosDisponibles(){
        
    }

}
