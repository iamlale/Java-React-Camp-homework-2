public class Course {

    private int id;
    private String courseName;
    private String type;
    private String teacher;
    private int numberOfStudents;


    public Course() { }

    public Course(int id, String courseName, String type, String teacher, int numberOfStudents) {
        this.setId(id);
        this.setCourseName(courseName);
        this.setType(type);
        this.setTeacher(teacher);
        this.numberOfStudents = numberOfStudents;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
