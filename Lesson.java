public class Lesson {
    private Long id;
    private String topic;
    private LessonType type;
    private Teacher teacher;
    private Course course;

    public Lesson() {
    }

    public Lesson(Long id, String topic, LessonType type, Teacher teacher, Course course) {
        this.id = id;
        this.topic = topic;
        this.type = type;
        this.teacher = teacher;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public LessonType getType() {
        return type;
    }

    public void setType(LessonType type) {
        this.type = type;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}