package services;

import models.Teacher;
import storage.Data;

public class TeacherService {

    public void addTeacher(Teacher teacher) {

        Data.getInstance()
                .getTeachers()
                .add(teacher);
    }
}