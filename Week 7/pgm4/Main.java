class BankTask implements Runnable {

    String activity;
    int delay;

    BankTask(String activity, int delay) {
        this.activity = activity;
        this.delay = delay;
    }

    public void run() {

        for (int i = 1; i <= 3; i++) {

            System.out.println(
                Thread.currentThread().getName()
                + " : "
                + activity
                + " : Execution "
                + i
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

        BankTask task1 =
            new BankTask("Transaction Processing", 1000);

        BankTask task2 =
            new BankTask("Balance Updating", 1500);

        BankTask task3 =
            new BankTask("SMS Notification", 2000);

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        t1.setName("Transaction Thread");
        t2.setName("Balance Thread");
        t3.setName("SMS Thread");

        t1.start();
        t2.start();
        t3.start();
    }
}
