package com.mycompany.edumatch;

import java.util.List;

public interface IManejoBDPersonaCargar {
    public PersonaDTO cargar(String cedula);
    public List<PersonaDTO> cargarTodos();
}