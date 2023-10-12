package com.mycompany.edumatch;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManejoPersonaCSV implements IManejoBDPersona {

    private final String csvFilePath = "personas.csv";

    public void guardar(PersonaDTO persona) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(csvFilePath, true))) {
            // Escribe los datos de la persona en el archivo CSV
            writer.println(persona.getCedula() + "," +
                            persona.getNombres() + "," +
                            persona.getApellidos() + "," +
                            persona.getCorreoInstitucional());
            System.out.println("Persona guardada en el archivo CSV.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al guardar la persona en el archivo CSV.");
        }
    }

    public PersonaDTO cargar(String cedula) {
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] partes = line.split(",");
                if (partes.length >= 4 && partes[0].equals(cedula)) {
                    // Construir un objeto PersonaDTO con los datos del CSV
                    return new PersonaDTO(partes[0], partes[1], partes[2], partes[3]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null; // No se encontró la persona
    }

    public List<PersonaDTO> cargarTodos() {
        List<PersonaDTO> personas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] partes = line.split(",");
                if (partes.length >= 4) {
                    // Construir un objeto PersonaDTO con los datos del CSV y agregarlo a la lista
                    personas.add(new PersonaDTO(partes[0], partes[1], partes[2], partes[3]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personas;
    }
}
