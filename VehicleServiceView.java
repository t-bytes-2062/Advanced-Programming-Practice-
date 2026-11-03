import javax.swing.*;
import java.awt.*;

public class VehicleServiceView extends JFrame {

    JTextField registrationField;

    JRadioButton twoWheeler;
    JRadioButton car;

    JCheckBox generalService;
    JCheckBox oilChange;
    JCheckBox brakeService;
    JCheckBox batteryCheck;

    JButton calculateButton;

    JLabel resultLabel;

    VehicleServiceView() {

        setTitle("Vehicle Service Cost");
        setSize(450, 400);
        setLayout(new FlowLayout());

        add(new JLabel("Registration Number:"));

        registrationField =
            new JTextField(15);

        add(registrationField);

        add(new JLabel("Vehicle Type:"));

        twoWheeler =
            new JRadioButton("Two Wheeler");

        car =
            new JRadioButton("Car");

        ButtonGroup group =
            new ButtonGroup();

        group.add(twoWheeler);
        group.add(car);

        add(twoWheeler);
        add(car);

        add(new JLabel("Services:"));

        generalService =
            new JCheckBox("General Service ₹1000");

        oilChange =
            new JCheckBox("Oil Change ₹800");

        brakeService =
            new JCheckBox("Brake Service ₹1200");

        batteryCheck =
            new JCheckBox("Battery Check ₹500");

        add(generalService);
        add(oilChange);
        add(brakeService);
        add(batteryCheck);

        calculateButton =
            new JButton("Calculate Cost");

        add(calculateButton);

        resultLabel =
            new JLabel("Total Cost: ₹0");

        add(resultLabel);

        setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );

        setVisible(true);
    }
}
