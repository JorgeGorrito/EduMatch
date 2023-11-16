package com.mycompany.edumatch;
import java.util.List;
import java.util.ArrayList;

class CommandInvoker {
    private List<String> students = new ArrayList<>();

    public void showStudents() {
        System.out.println("Lista de estudiantes:");
        for (String student : students) {
            System.out.println(student);
        }
    }

    public void addStudent(String studentName) {
        students.add(studentName);
        System.out.println("Estudiante agregado: " + studentName);
    }
}