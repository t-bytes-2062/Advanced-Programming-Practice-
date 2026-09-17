import student.Student;
import course.Course;

public class Main {
    public static void main(String[] args) {

        Student s = new Student(101, "Rahul", "CSE");
        Course c = new Course(201, "Java Programming", 4);

        System.out.println("STUDENT DETAILS");
        s.display();

        System.out.println("\nCOURSE DETAILS");
        c.display();
    }
}
