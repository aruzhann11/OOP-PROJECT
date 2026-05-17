import java.util.List;
import java.util.ArrayList;

public class Course {
    private Long id;
    private String name;
    private int credits;
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Lesson> lessons;

    public Course() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.lessons = new ArrayList<>();
    }

    public Course(Long id, String name, int credits) {
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.lessons = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }

    public void removeLesson(Lesson lesson) {
        lessons.remove(lesson);
    }
}