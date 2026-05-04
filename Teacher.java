import java.util.List;
import java.util.ArrayList;

public class Teacher extends Employee {
    private String department;
    private List<Course> courses;

    public Teacher(Long id, String name, String surname, String email, String password,
                   double salary, AcademicTitle academicTitle, String department) {
        super(id, name, surname, email, password, salary, academicTitle);
        this.department = department;
        this.courses = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }
}