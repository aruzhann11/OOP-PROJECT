package services;

import models.Student;
import storage.Data;

public class StudentService {

    public void addStudent(Student student) {

        Data.getInstance()
                .getStudents()
                .add(student);
    }

    public void removeStudent(Student student) {

        Data.getInstance()
                .getStudents()
                .remove(student);
    }
}