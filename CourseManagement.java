import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class CourseManagement extends JFrame {

    JList<String> courseList;
    JTable table;
    DefaultTableModel model;

    JButton addButton;
    JButton removeButton;

    CourseManagement() {

        setTitle("Student Course Management");
        setSize(600, 400);
        setLayout(new FlowLayout());

        String[] courses = {
            "Java",
            "Python",
            "Data Structures",
            "Database"
        };

        courseList = new JList<>(courses);

        add(new JLabel("Available Courses:"));

        JScrollPane listScroll =
            new JScrollPane(courseList);

        listScroll.setPreferredSize(
            new Dimension(150, 100)
        );

        add(listScroll);

        model = new DefaultTableModel();

        model.addColumn("Student Name");
        model.addColumn("Course");
        model.addColumn("Status");

        table = new JTable(model);

        JScrollPane tableScroll =
            new JScrollPane(table);

        tableScroll.setPreferredSize(
            new Dimension(400, 150)
        );

        add(tableScroll);

        addButton = new JButton("Add");
        removeButton = new JButton("Remove");

        add(addButton);
        add(removeButton);

        addButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String course =
                    courseList.getSelectedValue();

                if (course != null) {

                    model.addRow(
                        new Object[] {
                            "Tanish",
                            course,
                            "Enrolled"
                        }
                    );
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                int row =
                    table.getSelectedRow();

                if (row != -1) {
                    model.removeRow(row);
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CourseManagement();
    }
}
