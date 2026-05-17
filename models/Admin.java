package models;
import enums.Gender;
import storage.Data;

public class Admin extends Employee {

    public Admin(String username,
                 String password,
                 String firstName,
                 String lastName,
                 Gender gender,
                 double salary) {

        super(
                username,
                password,
                firstName,
                lastName,
                gender,
                salary
        );
    }

    public void addStudent(Student student) {

        Data.getInstance()
                .getStudents()
                .add(student);
    }

    public void addTeacher(Teacher teacher) {

        Data.getInstance()
                .getTeachers()
                .add(teacher);
    }

    public void removeStudent(Student student) {

        Data.getInstance()
                .getStudents()
                .remove(student);
    }
}