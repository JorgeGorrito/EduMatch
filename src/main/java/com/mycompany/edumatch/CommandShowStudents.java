package com.mycompany.edumatch;
// Clase concreta que implementa la interfaz Command para mostrar estudiantes
class CommandShowStudents implements ICommand {
    private CommandInvoker database;

    public CommandShowStudents(CommandInvoker database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.showStudents();
    }
}