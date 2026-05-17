import java.util.ArrayList;
import java.util.List;

public class Student extends User{
    private int year;
    private double gpa;
    private List<Long> enrolledCourseIds = new ArrayList<>();

    public Student(Long id, String name, String surname, String email, String password, int year) {
        super(id, name, surname, email, password);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1 && year <= 4) {
            this.year = year;
        }
    }

    public double getGpa() {
        return gpa;
    }

    public List<Long> getEnrolledCourseIds() {
        return enrolledCourseIds;
    }

    public void enrollCourse(Long courseId) {
        enrolledCourseIds.add(courseId);
    }

    @Override
    public String toString() {
        return super.toString() + " | Student year: " + year;
    }
}
