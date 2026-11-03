import javax.swing.*;
import java.awt.event.*;

public class EmployeeController {

    EmployeeModel model;
    EmployeeView view;

    EmployeeController(
        EmployeeModel model,
        EmployeeView view
    ) {

        this.model = model;
        this.view = view;

        view.loginButton.addActionListener(
            new ActionListener() {

                public void actionPerformed(
                    ActionEvent e
                ) {

                    String username =
                        view.usernameField.getText();

                    String password =
                        new String(
                            view.passwordField
                                .getPassword()
                        );

                    if (model.login(
                        username,
                        password
                    )) {

                        JOptionPane.showMessageDialog(
                            null,
                            "Login Successful"
                        );

                        view.loginFrame.dispose();

                        view.createMainWindow();

                    }
                    else {

                        JOptionPane.showMessageDialog(
                            null,
                            "Invalid Username or Password"
                        );
                    }
                }
            }
        );

        view.addEmployee.addActionListener(
            e -> addEmployee()
        );

        view.viewEmployee.addActionListener(
            e -> JOptionPane.showMessageDialog(
                null,
                "Employee details displayed"
            )
        );

        view.changePassword.addActionListener(
            e -> changePassword()
        );

        view.logout.addActionListener(
            e -> logout()
        );

        view.exitApplication.addActionListener(
            e -> System.exit(0)
        );
    }

    void addEmployee() {

        JTextField id =
            new JTextField();

        JTextField name =
            new JTextField();

        JTextField department =
            new JTextField();

        Object[] fields = {
            "Employee ID:", id,
            "Employee Name:", name,
            "Department:", department
        };

        int result =
            JOptionPane.showConfirmDialog(
                null,
                fields,
                "Add Employee",
                JOptionPane.OK_CANCEL_OPTION
            );

        if (result == JOptionPane.OK_OPTION) {

            JOptionPane.showMessageDialog(
                null,
                "Employee Added Successfully"
            );
        }
    }

    void changePassword() {

        JPasswordField oldPass =
            new JPasswordField();

        JPasswordField newPass =
            new JPasswordField();

        JPasswordField confirmPass =
            new JPasswordField();

        Object[] fields = {
            "Old Password:", oldPass,
            "New Password:", newPass,
            "Confirm Password:", confirmPass
        };

        int result =
            JOptionPane.showConfirmDialog(
                null,
                fields,
                "Change Password",
                JOptionPane.OK_CANCEL_OPTION
            );

        if (result == JOptionPane.OK_OPTION) {

            boolean changed =
                model.changePassword(
                    new String(oldPass.getPassword()),
                    new String(newPass.getPassword()),
                    new String(confirmPass.getPassword())
                );

            if (changed) {

                JOptionPane.showMessageDialog(
                    null,
                    "Password Changed Successfully"
                );

            }
            else {

                JOptionPane.showMessageDialog(
                    null,
                    "Invalid old password or passwords do not match"
                );
            }
        }
    }

    void logout() {

        view.mainFrame.dispose();

        view.createLoginWindow();
    }
}
