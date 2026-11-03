import java.awt.event.*;

public class StudentGradeController {

    StudentGradeModel model;
    StudentGradeView view;

    StudentGradeController(
        StudentGradeModel model,
        StudentGradeView view
    ) {

        this.model = model;
        this.view = view;

        view.calculateButton.addActionListener(
            new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    try {

                        String name =
                            view.nameField.getText();

                        int mark1 =
                            Integer.parseInt(
                                view.mark1Field.getText()
                            );

                        int mark2 =
                            Integer.parseInt(
                                view.mark2Field.getText()
                            );

                        int mark3 =
                            Integer.parseInt(
                                view.mark3Field.getText()
                            );

                        model.calculate(
                            name, mark1, mark2, mark3
                        );

                        view.resultLabel.setText(
                            "Total: " + model.getTotal()
                            + " Average: "
                            + String.format(
                                "%.2f",
                                model.getAverage()
                            )
                            + " Grade: "
                            + model.getGrade()
                        );

                    }
                    catch (Exception ex) {

                        view.resultLabel.setText(
                            "Enter valid marks"
                        );
                    }
                }
            }
        );
    }
}
