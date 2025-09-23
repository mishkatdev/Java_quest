import java.util.Scanner;

public class CgpaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of subjects: ");
        int n = sc.nextInt();

        double totalGradePoints = 0.0;
        double totalCredits = 0.0;

        for (int i = 1; i <= n; i++) {
            System.out.println("\nSubject " + i + ":");
            System.out.print("Enter marks (0-100): ");
            double marks = sc.nextDouble();

            System.out.print("Enter credit hours: ");
            double credit = sc.nextDouble();

            // Convert marks to grade points (example scale)
            double gradePoint = 0.0;
            if (marks >= 85) gradePoint = 4.0;
            else if (marks >= 80) gradePoint = 3.7;
            else if (marks >= 75) gradePoint = 3.3;
            else if (marks >= 70) gradePoint = 3.0;
            else if (marks >= 65) gradePoint = 2.7;
            else if (marks >= 60) gradePoint = 2.3;
            else if (marks >= 50) gradePoint = 2.0;
            else gradePoint = 0.0;

            totalGradePoints += gradePoint * credit;
            totalCredits += credit;
        }

        double cgpa = totalGradePoints / totalCredits;
        System.out.printf("\nYour CGPA is: %.2f\n", cgpa);

        sc.close();
    }
}
