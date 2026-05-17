package models;

import enums.LessonType;
import enums.WeekDay;

public class Lesson {

    private Course course;
    private Teacher teacher;
    private LessonType lessonType;
    private WeekDay weekDay;

    public Lesson(Course course,
                  Teacher teacher,
                  LessonType lessonType,
                  WeekDay weekDay) {

        this.course = course;
        this.teacher = teacher;
        this.lessonType = lessonType;
        this.weekDay = weekDay;
    }
}