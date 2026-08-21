import java.util.Scanner;

class Candidate {
    int candidateId;
    String name;
    int aptitude;
    int technical;
    int communication;

    Candidate(int candidateId, String name, int aptitude, int technical, int communication) {
        this.candidateId = candidateId;
        this.name = name;
        this.aptitude = aptitude;
        this.technical = technical;
        this.communication = communication;
    }

    int getTotalScore() {
        return aptitude + technical + communication;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of candidates: ");
        int n = sc.nextInt();

        System.out.print("Enter number of candidates to shortlist: ");
        int k = sc.nextInt();

        Candidate[] candidates = new Candidate[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nCandidate " + (i + 1));

            System.out.print("Candidate ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Aptitude: ");
            int aptitude = sc.nextInt();

            System.out.print("Technical: ");
            int technical = sc.nextInt();

            System.out.print("Communication: ");
            int communication = sc.nextInt();

            candidates[i] = new Candidate(id, name, aptitude, technical, communication);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                int score1 = candidates[j].getTotalScore();
                int score2 = candidates[j + 1].getTotalScore();

                if (score1 < score2 ||
                    (score1 == score2 && candidates[j].candidateId > candidates[j + 1].candidateId)) {

                    Candidate temp = candidates[j];
                    candidates[j] = candidates[j + 1];
                    candidates[j + 1] = temp;
                }
            }
        }

        System.out.println("\nTop " + k + " Candidates");

        for (int i = 0; i < k; i++) {
            System.out.println(
                candidates[i].candidateId + " " +
                candidates[i].name + " " +
                candidates[i].getTotalScore()
            );
        }
    }
}
