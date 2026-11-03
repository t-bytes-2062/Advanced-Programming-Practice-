import java.awt.event.*;

public class VehicleServiceController {

    VehicleServiceModel model;
    VehicleServiceView view;

    VehicleServiceController(
        VehicleServiceModel model,
        VehicleServiceView view
    ) {

        this.model = model;
        this.view = view;

        view.calculateButton.addActionListener(
            new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    int total =
                        model.calculateCost(
                            view.generalService.isSelected(),
                            view.oilChange.isSelected(),
                            view.brakeService.isSelected(),
                            view.batteryCheck.isSelected()
                        );

                    view.resultLabel.setText(
                        "Total Cost: ₹" + total
                    );
                }
            }
        );
    }
}
