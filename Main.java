import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();

        // create instance of CourseManager class
        CourseManager courseManager = new CourseManager();
        
        // create students
        Student student1 = new Student(100, "ali@gmail.com", "ali123", "Ali", "Yılmaz", "Java+React");
        Student student2 = new Student(101, "su@gmail.com", "su123", "Su", "Arslan", "C# + Angular");
        Student student3 = new Student(102, "duru@gmail.com", "duru123", "Duru", "Çelik", "Base Course");

        // add students to array list
        Student[] students = {student1, student2, student3};

        // create courses
        Course course1 = new Course(1, "Java+React", "Programlama", "Engin Demiroğ", 0);


        // password length error: must be at least 6 characters
        for (Student ogrenci : students) {
            if (ogrenci.getPassword().length() < 6) {
                System.out.println("Şifre en az 6 karakter olmalı " + ogrenci.getName());
            }
            // add course to list that the student joined.
            courses.add(ogrenci.getJoinedCourse());
            if(ogrenci.getJoinedCourse()=="Java+React"){
                courseManager.setJavaStudentsCount(courseManager.getJavaStudentsCount()+1);
            }
            else if(ogrenci.getJoinedCourse()=="C# + Angular"){
                courseManager.setcSharpAngularStudentsCount(courseManager.getcSharpAngularStudentsCount()+1);
            }
            else if(ogrenci.getJoinedCourse()=="Base Course"){
                courseManager.setBaseCourseStudentsCount(courseManager.getBaseCourseStudentsCount()+1);
            }
        }

        // print number of students for each course
        System.out.println();
        System.out.println("The number of C# + Angular student count :  "+courseManager.CSharpAngularStudents());
        System.out.println("The number of Java+React student count :  "+courseManager.JavaStudents());
        System.out.println("The number of Base Course student count :  "+courseManager.BaseCourseStudents());
    }
}
