public class EmployeeManagement {

    public static void main(String[] args) {

        EmployeeModel model =
            new EmployeeModel();

        EmployeeView view =
            new EmployeeView();

        new EmployeeController(
            model,
            view
        );
    }
}
