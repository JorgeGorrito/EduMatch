package com.mycompany.edumatch;
// Clase concreta que implementa la interfaz Command para agregar estudiantes
class CommandAddStudent implements ICommand {
    private CommandInvoker database;
    private String studentName;

    public CommandAddStudent(CommandInvoker database, String studentName) {
        this.database = database;
        this.studentName = studentName;
    }

    @Override
    public void execute() {
        database.addStudent(studentName);
    }
}