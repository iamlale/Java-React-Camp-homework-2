public class CourseManager {

    public int javaStudentsCount;
    private int cSharpAngularStudentsCount;
    private int baseCourseStudentsCount;

    Course course = new Course();


    // count of java students
    public int JavaStudents() {
        return javaStudentsCount;
    }

    // count of C# students
    public int CSharpAngularStudents() {
        return cSharpAngularStudentsCount;
    }

    // count of base students
    public int BaseCourseStudents() {
        return baseCourseStudentsCount;
    }


    public int getJavaStudentsCount() {

        return javaStudentsCount;
    }

    public void setJavaStudentsCount(int javaStudentsCount) {
        this.javaStudentsCount = javaStudentsCount;
    }

    public int getcSharpAngularStudentsCount() {
        return cSharpAngularStudentsCount;
    }

    public void setcSharpAngularStudentsCount(int cSharpAngularStudentsCount) {
        this.cSharpAngularStudentsCount = cSharpAngularStudentsCount;
    }

    public int getBaseCourseStudentsCount() {
        return baseCourseStudentsCount;
    }

    public void setBaseCourseStudentsCount(int baseCourseStudentsCount) {
        this.baseCourseStudentsCount = baseCourseStudentsCount;
    }
}
