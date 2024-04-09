import java.util.Scanner;

// Functional interface
interface GradeCalculator {
    String calculateGrade(int marks);
}

public class CGPA {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks: ");
        int marks = sc.nextInt();

        // Lambda expression to calculate grade using functional interface
        GradeCalculator gradeCalculator = (int a) -> {
            int ch = a / 10;
            switch (ch) {
                case 10:
                case 9:
                    return "O";
                case 8:
                    return "A";
                case 7:
                    return "B";
                default:
                    return "Invalid Choice";
            }
        };

        // Calling the method using lambda expression
        String grade = gradeCalculator.calculateGrade(marks);
        System.out.println("Grade: " + grade);
    }
}
