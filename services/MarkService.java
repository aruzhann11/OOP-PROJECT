package services;

import models.Student;

public class MarkService {

    public double calculateGPA(Student student) {

        return student.getGpa();
    }
}