import doctor.Doctor;
import patient.Patient;

public class Main {
    public static void main(String[] args) {

        Doctor d1 = new Doctor(
            1, "Dr. Kumar", "Cardiologist", 2000
        );

        Doctor d2 = new Doctor(
            2, "Dr. Priya", "Dermatologist", 1500
        );

        Patient p1 = new Patient(
            101, "Rahul", "Heart Disease", 45
        );

        Patient p2 = new Patient(
            102, "Anu", "Skin Allergy", 25
        );

        Patient p3 = new Patient(
            103, "Arun", "Heart Disease", 50
        );

        System.out.println("PATIENT DETAILS");

        p1.display();
        System.out.println("Treating Doctor: " + d1.getName());

        System.out.println();

        p2.display();
        System.out.println("Treating Doctor: " + d2.getName());

        System.out.println();

        p3.display();
        System.out.println("Treating Doctor: " + d1.getName());

        int d1Patients = 2;
        int d2Patients = 1;

        double total1 =
            d1.getConsultationFee() * d1Patients;

        double total2 =
            d2.getConsultationFee() * d2Patients;

        System.out.println("\nTOTAL CONSULTATION FEE");

        System.out.println(
            d1.getName() + ": " + total1
        );

        System.out.println(
            d2.getName() + ": " + total2
        );
    }
}
