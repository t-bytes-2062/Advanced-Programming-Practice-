class HospitalTask extends Thread {

    HospitalTask(String name) {
        super(name);
    }

    public void run() {

        System.out.println("Thread Name: " + getName());
        System.out.println("Priority: " + getPriority());
    }
}

public class HospitalMonitoring {

    public static void main(String[] args) {

        HospitalTask emergency =
            new HospitalTask("EmergencyAlert");

        HospitalTask vital =
            new HospitalTask("VitalMonitor");

        HospitalTask report =
            new HospitalTask("ReportGenerator");

        emergency.setPriority(Thread.MAX_PRIORITY);
        vital.setPriority(Thread.NORM_PRIORITY);
        report.setPriority(Thread.MIN_PRIORITY);

        emergency.start();
        vital.start();
        report.start();
    }
}
