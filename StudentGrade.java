public class StudentGrade {

    public static void main(String[] args) {

        StudentGradeModel model =
            new StudentGradeModel();

        StudentGradeView view =
            new StudentGradeView();

        new StudentGradeController(model, view);
    }
}
