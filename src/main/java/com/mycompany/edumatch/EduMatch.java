package com.mycompany.edumatch;

import java.sql.*;
import java.util.List;

public class EduMatch {
    public static void main(String[] args) {
        CommandInvoker database = new CommandInvoker();
        CommandManager manager = new CommandManager();

        // Crear comandos
        ICommand showCommand = new CommandShowStudents(database);
        ICommand addCommand = new CommandAddStudent(database, "John Doe");

        // Configurar el invocador con el comando y ejecutar
        manager.setCommand(showCommand);
        manager.executeCommand();

        // Configurar el invocador con otro comando y ejecutar
        manager.setCommand(addCommand);
        manager.executeCommand();

        // Volver a mostrar la lista de estudiantes
        manager.setCommand(showCommand);
        manager.executeCommand();


        /*
        DBFactory dbFactory;
        IOperacionesCrudDB<Persona> iOperacionesBDPersona;
        try{
            dbFactory = DBFactory.getInstance();
            OperacionesBDPersonaSQL operacioensBDPersonaSQL = new OperacionesBDPersonaSQL( dbFactory.getDefaultDBAdapter().obtenerConexion());    
            
            // Supongamos que tienes un objeto operacionesBDPersonaSQL para interactuar con la base de datos
*/
           /* 
            // Crear 5 instancias de Persona con datos inventados
            Persona persona1 = new Persona("12345", "10002154", "Juan", "González", "juan@example.com", null);
            Persona persona2 = new Persona("54321", "10002154","María", "Pérez", "maria@example.com", null);
            Persona persona3 = new Persona("98765", "10002154","Carlos", "López", "carlos@example.com", null);
            Persona persona4 = new Persona("45678", "10002154","Ana", "Martínez", "ana@example.com", null);
            Persona persona5 = new Persona("78901", "10002154","Pedro", "Sánchez", "pedro@example.com", null);
            
            
            // Insertar las personas en la base de datos
            operacioensBDPersonaSQL.crear(persona1);
            operacioensBDPersonaSQL.crear(persona2);
            operacioensBDPersonaSQL.crear(persona3);
            operacioensBDPersonaSQL.crear(persona4);
            operacioensBDPersonaSQL.crear(persona5);
            */
            
            /*
            List<Persona> personas = operacioensBDPersonaSQL.listar();
            for (Persona persona: personas){
                System.out.println(persona.getNombres() + ", "+ persona.getApellidos() +", " + persona.getCodigo());
            }
            System.out.println();
            
            iOperacionesBDPersona = operacioensBDPersonaSQL;
            for (Persona persona: iOperacionesBDPersona.listar()){
                System.out.println(persona.getNombres() + ", "+ persona.getApellidos() +", " + persona.getCodigo());
            }
            System.out.println();
            
            iOperacionesBDPersona = new OperacionesBDPersonaSQL( dbFactory.getDBadapter(DBType.MySQL).obtenerConexion());  
            for (Persona persona: iOperacionesBDPersona.listar()){
                System.out.println(persona.getNombres() + ", "+ persona.getApellidos() +", " + persona.getCodigo());
            }
            */
            /*
            Persona persona1 = new Persona("12345", "10002154", "Juan", "González", "juan@example.com", null);
            Persona persona2 = new Persona("54321", "10002154","María", "Pérez", "maria@example.com", null);
            
            iOperacionesBDPersona.crear(persona1);
            iOperacionesBDPersona.crear(persona2);
            */
           /*
            for (Persona persona: iOperacionesBDPersona.listar()){
                System.out.println(persona.getNombres() + ", "+ persona.getApellidos() +", " + persona.getCodigo());
            }
            System.out.println();
            
            OperacionesBDPersonaMySQL oPersonaMySQL = new OperacionesBDPersonaMySQL(dbFactory.getDBadapter(DBType.MySQL).obtenerConexion());
            System.out.println(oPersonaMySQL.obtenerFechaYHora());
            */
            //BUILDER
            // Grupo grupo = new Grupo("Grupo1");
            // Actividad actividad = new Actividad.Builder()
            //     .withHoraInicio(9)
            //     .withHoraFinalizacion(11)
            //     .withNumeroDia(1)
            //     .withGrupo(grupo)
            //     .build();
        /*
        } catch (Exception e){
            e.printStackTrace();
        }
*/
        /*
         // Crear una instancia de iManejoPersonaSQL
        IManejoBDPersona manejadorPersona = (IManejoBDPersona) new ManejoPersonaSQL();
        IManejoBDPersonaGuardar manejadorPersonaGuardar;
        IManejoBDPersonaCargar manejadorPersonaCargar;
        //manejadorPersona = new ManejoPersonaCSV();
        manejadorPersonaGuardar = manejadorPersona;
        manejadorPersonaCargar = manejadorPersona;
        
        // Ejemplo de guardar una persona
        PersonaDTO persona1 = new PersonaDTO("123456", "Juan", "Pérez", "juan@example.com");
        manejadorPersonaGuardar.guardar(persona1);
        
        // Ejemplo de cargar una persona por cédula
        String cedulaABuscar = "123456";
        PersonaDTO personaCargada = manejadorPersonaCargar.cargar(cedulaABuscar);

        if (personaCargada != null) {
            System.out.println("Persona cargada:");
            System.out.println("Cédula: " + personaCargada.getCedula());
            System.out.println("Nombres: " + personaCargada.getNombres());
            System.out.println("Apellidos: " + personaCargada.getApellidos());
            System.out.println("Correo Institucional: " + personaCargada.getCorreoInstitucional());
        } else {
            System.out.println("No se encontró ninguna persona con la cédula: " + cedulaABuscar);
        }

        // Ejemplo de cargar todas las personas
        List<PersonaDTO> todasLasPersonas = manejadorPersona.cargarTodos();

        System.out.println("Todas las personas en la base de datos:");
        for (PersonaDTO persona : todasLasPersonas) {
            System.out.println("Cédula: " + persona.getCedula());
            System.out.println("Nombres: " + persona.getNombres());
            System.out.println("Apellidos: " + persona.getApellidos());
            System.out.println("Correo Institucional: " + persona.getCorreoInstitucional());
            System.out.println("------------------------");
        }

        DocenteDTO docente1 = new DocenteDTO("123456", "Juan", "Pérez", "juan@example.com");
        Persona persona2 = new Persona(docente1);
        persona2.mostrarPersona();

        EstudianteDTO estudiante1 = new EstudianteDTO("123456", "Juan", "Pérez", "juan@example.com");
        Persona persona3 = new Persona(estudiante1);
        persona3.mostrarPersona();
        */
    }
    
}
