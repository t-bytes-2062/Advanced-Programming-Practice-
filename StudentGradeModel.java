public class StudentGradeModel {

    private String name;
    private int mark1;
    private int mark2;
    private int mark3;

    private int total;
    private double average;
    private char grade;

    public void calculate(String name, int mark1, int mark2, int mark3) {

        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;

        total = mark1 + mark2 + mark3;

        average = total / 3.0;

        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 60)
            grade = 'C';
        else if (average >= 50)
            grade = 'D';
        else
            grade = 'F';
    }

    public int getTotal() {
        return total;
    }

    public double getAverage() {
        return average;
    }

    public char getGrade() {
        return grade;
    }
}
