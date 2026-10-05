class FoodTask extends Thread {

    String activity;

    FoodTask(String name, String activity) {
        super(name);
        this.activity = activity;
    }

    public void run() {

        System.out.println("Thread Name: " + getName());
        System.out.println("Priority: " + getPriority());
        System.out.println("Activity: " + activity);
        System.out.println();
    }
}

public class FoodDelivery {

    public static void main(String[] args) {

        FoodTask order =
            new FoodTask(
                "OrderProcessing",
                "Processing customer orders"
            );

        FoodTask delivery =
            new FoodTask(
                "DeliveryTracking",
                "Tracking delivery locations"
            );

        FoodTask notification =
            new FoodTask(
                "Notification",
                "Sending order-status notifications"
            );

        order.setPriority(Thread.MAX_PRIORITY);
        delivery.setPriority(Thread.NORM_PRIORITY);
        notification.setPriority(Thread.MIN_PRIORITY);

        order.start();
        delivery.start();
        notification.start();
    }
}
