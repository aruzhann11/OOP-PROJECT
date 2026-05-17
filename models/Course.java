package models;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String code;
    private String name;
    private int credits;

    private List<Student> students =
            new ArrayList<>();

    private List<Teacher> teachers =
            new ArrayList<>();

    public Course(String code,
                  String name,
                  int credits) {

        this.code = code;
        this.name = name;
        this.credits = credits;
    }

    public void addStudent(Student student) {

        students.add(student);
    }

    public void addTeacher(Teacher teacher) {

        teachers.add(teacher);
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    @Override
    public String toString() {

        return code + " " + name;
    }
}