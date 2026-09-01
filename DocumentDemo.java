interface Confidential {
}

class Report {
}

class MedicalReport implements Confidential {
}

class PublicDocument {
}

public class DocumentDemo {
    public static void main(String[] args) {

        Report r = new Report();
        MedicalReport m = new MedicalReport();
        PublicDocument p = new PublicDocument();

        System.out.println("Report confidential: " + (r instanceof Confidential));
        System.out.println("Medical Report confidential: " + (m instanceof Confidential));
        System.out.println("Public Document confidential: " + (p instanceof Confidential));
    }
}
