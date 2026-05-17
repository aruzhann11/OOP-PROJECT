
import comporators.ResearchPaperComparator;
import enums.Gender;
import enums.TeacherType;
import enums.UrgencyLevel;
import java.time.LocalDate;
import models.Course;
import models.Message;
import models.ResearchPaper;
import models.Student;
import models.Teacher;
import services.MessageService;

public class Main {

    public static void main(String[] args) {

        Student student =
                new Student(
                        "student1",
                        "123",
                        "Aruzhan",
                        "Smith",
                        Gender.FEMALE,
                        4
                );

        Teacher teacher =
                new Teacher(
                        "teacher1",
                        "123",
                        "John",
                        "Brown",
                        Gender.MALE,
                        500000,
                        TeacherType.PROFESSOR
                );

        Course oop =
                new Course(
                        "CS101",
                        "OOP",
                        6
                );

        oop.addTeacher(teacher);

        try {

            student.registerCourse(oop);

        } catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }

        ResearchPaper paper =
                new ResearchPaper(
                        "AI Research",
                        55,
                        "IEEE",
                        12,
                        LocalDate.now()
                );

        teacher.getPapers()
                .add(paper);

        teacher.printPapers(
                new ResearchPaperComparator()
        );

        Message message =
                new Message(
                        teacher,
                        student,
                        "Hello",
                        UrgencyLevel.NORMAL
                );

        MessageService ms =
                new MessageService();

        ms.sendMessage(message);

        System.out.println(
                "SYSTEM WORKS"
        );
    }
}