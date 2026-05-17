package services;

import models.Course;
import models.Student;
import models.Teacher;

public class CourseService {

    public void assignTeacher(
            Teacher teacher,
            Course course
    ) {

        course.addTeacher(teacher);
    }

    public void addStudentToCourse(
            Student student,
            Course course
    ) {

        course.addStudent(student);
    }
}