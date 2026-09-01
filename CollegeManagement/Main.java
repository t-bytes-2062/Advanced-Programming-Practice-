import student.Student;
import course.Course;

public class Main {
    public static void main(String[] args) {

        Student s = new Student("Tanish", 101);
        Course c = new Course("Java Programming", 501);

        s.display();

        System.out.println();

        c.display();
    }
}
