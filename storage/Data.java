package storage;

import java.util.ArrayList;
import java.util.List;
import models.Course;
import models.Manager;
import models.Student;
import models.Teacher;

public class Data {

    private static Data instance;

    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private List<Manager> managers = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    private Data() {}

    public static Data getInstance() {

        if(instance == null) {
            instance = new Data();
        }

        return instance;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public List<Course> getCourses() {
        return courses;
    }
}