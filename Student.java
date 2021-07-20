public class Student {

    private int id;
    private String email;
    private String password;
    private String name;
    private String surname;
    private String joinedCourse;

    public Student() { }

    public Student(int id, String email, String password, String name, String surname, String joinedCourse) {
        this.setId(id);
        this.setEmail(email);
        this.setPassword(password);
        this.setName(name);
        this.setSurname(surname);
        this.joinedCourse = joinedCourse;

    }


    public String getJoinedCourse() {
        return joinedCourse;
    }

    public void setJoinedCourse(String joinedCourse) {
        this.joinedCourse = joinedCourse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
