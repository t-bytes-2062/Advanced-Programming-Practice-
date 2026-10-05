import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame {

    JTextField nameField;
    JTextField regField;

    JRadioButton male;
    JRadioButton female;

    JComboBox<String> department;

    JButton submit;

    StudentRegistration() {

        setTitle("Student Registration");
        setSize(400, 350);
        setLayout(new FlowLayout());

        add(new JLabel("Student Name:"));

        nameField = new JTextField(20);
        add(nameField);

        add(new JLabel("Register Number:"));

        regField = new JTextField(20);
        add(regField);

        add(new JLabel("Gender:"));

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        add(male);
        add(female);

        add(new JLabel("Department:"));

        String[] departments = {
            "CSE",
            "ECE",
            "EEE",
            "IT"
        };

        department = new JComboBox<>(departments);
        add(department);

        submit = new JButton("Submit");
        add(submit);

        submit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText();
                String reg = regField.getText();

                String gender;

                if (male.isSelected()) {
                    gender = "Male";
                }
                else if (female.isSelected()) {
                    gender = "Female";
                }
                else {
                    gender = "Not Selected";
                }

                String dept =
                    (String) department.getSelectedItem();

                JOptionPane.showMessageDialog(
                    StudentRegistration.this,
                    "Name: " + name +
                    "\nRegister No: " + reg +
                    "\nGender: " + gender +
                    "\nDepartment: " + dept
                );
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}
