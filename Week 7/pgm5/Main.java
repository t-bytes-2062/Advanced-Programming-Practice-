class TrafficJunction extends Thread {

    String status;
    int delay;

    TrafficJunction(String status, int delay) {
        this.status = status;
        this.delay = delay;
    }

    public void run() {

        for (int i = 1; i <= 3; i++) {

            System.out.println(
                getName() + " : Traffic Status = " + status
            );

            try {
                Thread.sleep(delay);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        TrafficJunction j1 =
            new TrafficJunction("Heavy Traffic", 1000);

        TrafficJunction j2 =
            new TrafficJunction("Normal Traffic", 1500);

        TrafficJunction j3 =
            new TrafficJunction("Low Traffic", 2000);

        j1.setName("Junction 1");
        j2.setName("Junction 2");
        j3.setName("Junction 3");

        j1.start();
        j2.start();
        j3.start();
    }
}
