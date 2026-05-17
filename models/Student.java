package models;

import enums.Gender;
import exceptions.CreditLimitException;
import exceptions.LowHIndexException;
import interfaces.Researcher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student extends User
        implements Comparable<Student>, Researcher {

    private int year;

    private double gpa;

    private int credits;

    private List<Course> courses =
            new ArrayList<>();

    private List<ResearchPaper> papers =
            new ArrayList<>();

    private int hIndex = 3;

    private Researcher supervisor;

    public Student(String username,
                   String password,
                   String firstName,
                   String lastName,
                   Gender gender,
                   int year) {

        super(
                username,
                password,
                firstName,
                lastName,
                gender
        );

        this.year = year;
    }

    public void registerCourse(Course course)
            throws CreditLimitException {

        if(credits + course.getCredits() > 21) {

            throw new CreditLimitException(
                    "Too many credits"
            );
        }

        courses.add(course);

        credits += course.getCredits();
    }

    public void assignSupervisor(
            Researcher researcher
    ) throws LowHIndexException {

        if(researcher.getHIndex() < 3) {

            throw new LowHIndexException(
                    "H-index less than 3"
            );
        }

        supervisor = researcher;
    }

    public double getGpa() {

        return gpa;
    }

    @Override
    public int compareTo(Student o) {

        return Double.compare(
                this.gpa,
                o.gpa
        );
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