import javax.swing.*;
import java.awt.*;

public class EmployeeView {

    JFrame loginFrame;

    JTextField usernameField;
    JPasswordField passwordField;

    JButton loginButton;

    JFrame mainFrame;

    JMenuItem addEmployee;
    JMenuItem viewEmployee;
    JMenuItem changePassword;
    JMenuItem logout;
    JMenuItem exitApplication;

    EmployeeView() {

        createLoginWindow();
    }

    void createLoginWindow() {

        loginFrame =
            new JFrame("Employee Login");

        loginFrame.setSize(350, 250);
        loginFrame.setLayout(
            new FlowLayout()
        );

        loginFrame.add(
            new JLabel("Username:")
        );

        usernameField =
            new JTextField(20);

        loginFrame.add(usernameField);

        loginFrame.add(
            new JLabel("Password:")
        );

        passwordField =
            new JPasswordField(20);

        loginFrame.add(passwordField);

        loginButton =
            new JButton("Login");

        loginFrame.add(loginButton);

        loginFrame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );

        loginFrame.setVisible(true);
    }

    void createMainWindow() {

        mainFrame =
            new JFrame("Employee Management");

        mainFrame.setSize(500, 400);

        JMenuBar menuBar =
            new JMenuBar();

        JMenu employeeMenu =
            new JMenu("Employee");

        addEmployee =
            new JMenuItem("Add Employee");

        viewEmployee =
            new JMenuItem("View Employee");

        employeeMenu.add(addEmployee);
        employeeMenu.add(viewEmployee);

        JMenu toolsMenu =
            new JMenu("Tools");

        changePassword =
            new JMenuItem("Change Password");

        toolsMenu.add(changePassword);

        JMenu exitMenu =
            new JMenu("Exit");

        logout =
            new JMenuItem("Logout");

        exitApplication =
            new JMenuItem("Exit Application");

        exitMenu.add(logout);
        exitMenu.add(exitApplication);

        menuBar.add(employeeMenu);
        menuBar.add(toolsMenu);
        menuBar.add(exitMenu);

        mainFrame.setJMenuBar(menuBar);

        mainFrame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );

        mainFrame.setVisible(true);
    }
}
