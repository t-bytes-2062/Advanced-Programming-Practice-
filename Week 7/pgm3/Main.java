class ExamTask implements Runnable {

    String activity;

    ExamTask(String activity) {
        this.activity = activity;
    }

    public void run() {

        for (int i = 1; i <= 3; i++) {

            System.out.println(
                Thread.currentThread().getName()
                + " : "
                + activity
            );

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        ExamTask task1 =
            new ExamTask("Displaying remaining time");

        ExamTask task2 =
            new ExamTask("Auto-saving student answers");

        ExamTask task3 =
            new ExamTask("Checking network connection");

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        t1.setName("Timer Thread");
        t2.setName("AutoSave Thread");
        t3.setName("Network Thread");

        t1.start();
        t2.start();
        t3.start();
    }
}
