package models;

import enums.Gender;
import enums.TeacherType;
import interfaces.Researcher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teacher extends Employee
        implements Researcher {

    private TeacherType teacherType;

    private List<Course> courses =
            new ArrayList<>();

    private List<ResearchPaper> papers =
            new ArrayList<>();

    private int hIndex = 5;

    public Teacher(String username,
                   String password,
                   String firstName,
                   String lastName,
                   Gender gender,
                   double salary,
                   TeacherType teacherType) {

        super(
                username,
                password,
                firstName,
                lastName,
                gender,
                salary
        );

        this.teacherType = teacherType;
    }

    public void addCourse(Course course) {

        courses.add(course);
    }

    @Override
    public int getHIndex() {

        return hIndex;
    }

    @Override
    public List<ResearchPaper> getPapers() {

        return papers;
    }

    @Override
    public void printPapers(
            Comparator<ResearchPaper> comparator
    ) {

        papers.stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }
}