package com.mycompany.edumatch;

import java.util.List;

public interface IManejoBDPersona {
    public void guardar(PersonaDTO persona);
    public PersonaDTO cargar(String cedula);
    public List<PersonaDTO> cargarTodos();
}