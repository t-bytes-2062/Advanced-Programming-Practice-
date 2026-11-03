import javax.swing.*;
import java.awt.*;

public class StudentGradeView extends JFrame {

    JTextField nameField;
    JTextField mark1Field;
    JTextField mark2Field;
    JTextField mark3Field;

    JButton calculateButton;

    JLabel resultLabel;

    StudentGradeView() {

        setTitle("Student Grade Calculator");
        setSize(400, 350);
        setLayout(new GridLayout(6, 2));

        add(new JLabel("Student Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Subject 1:"));
        mark1Field = new JTextField();
        add(mark1Field);

        add(new JLabel("Subject 2:"));
        mark2Field = new JTextField();
        add(mark2Field);

        add(new JLabel("Subject 3:"));
        mark3Field = new JTextField();
        add(mark3Field);

        calculateButton = new JButton("Calculate Result");
        add(calculateButton);

        resultLabel = new JLabel("Result");
        add(resultLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
