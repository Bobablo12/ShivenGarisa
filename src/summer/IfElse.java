package summer;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // grade calculator: A, B, C, D, F
        // Everything has + and - too
        // A+ 97-100, A is 93-96, A- is 90-92
        // Use scanner to type the grade

        Scanner input = new Scanner(System.in);

        System.out.println("Type the number of grades: ");
        int numGrades = input.nextInt();
        double[] grades = new double[numGrades];

        System.out.println("Type your grades: ");
        for (int i = 0; i < numGrades; i++) {
            grades[i] = input.nextDouble();
        }

        double totalGrade = 0;
        int gradeCount = 0;

        for (double g : grades) {
            if (g >= 0 && g <= 100) {
                totalGrade += g;
                gradeCount++;

                if (g >= 97 && g <= 100) {
                    System.out.println("You got A+");
                } else if (g >= 93 && g <= 96) {
                    System.out.println("You got A");
                } else if (g >= 90 && g <= 92) {
                    System.out.println("You got A-");
                } else if (g >= 87 && g <= 89) {
                    System.out.println("You got B+");
                } else if (g >= 83 && g <= 86) {
                    System.out.println("You got B");
                } else if (g >= 80 && g <= 82) {
                    System.out.println("You got B-");
                } else if (g >= 77 && g <= 79) {
                    System.out.println("You got C+");
                } else if (g >= 73 && g <= 76) {
                    System.out.println("You got C");
                } else if (g >= 70 && g <= 72) {
                    System.out.println("You got C-");
                } else if (g >= 67 && g <= 69) {
                    System.out.println("You got D+");
                } else if (g >= 65 && g <= 66) {
                    System.out.println("You got D");
                } else if (g >= 60 && g <= 64) {
                    System.out.println("You got D-");
                } else {
                    System.out.println("You got F");
                }
            } else {
                System.out.println("I cannot grade that.");
            }
        }

        if (gradeCount > 0) {
            double averageGrade = totalGrade / gradeCount;
            System.out.println("Average grade: " + averageGrade);

            if (averageGrade >= 97 && averageGrade <= 100) {
                System.out.println("Overall letter grade: A+");
            } else if (averageGrade >= 93 && averageGrade <= 96) {
                System.out.println("Overall letter grade: A");
            } else if (averageGrade >= 90 && averageGrade <= 92) {
                System.out.println("Overall letter grade: A-");
            } else if (averageGrade >= 87 && averageGrade <= 89) {
                System.out.println("Overall letter grade: B+");
            } else if (averageGrade >= 83 && averageGrade <= 86) {
                System.out.println("Overall letter grade: B");
            } else if (averageGrade >= 80 && averageGrade <= 82) {
                System.out.println("Overall letter grade: B-");
            } else if (averageGrade >= 77 && averageGrade <= 79) {
                System.out.println("Overall letter grade: C+");
            } else if (averageGrade >= 73 && averageGrade <= 76) {
                System.out.println("Overall letter grade: C");
            } else if (averageGrade >= 70 && averageGrade <= 72) {
                System.out.println("Overall letter grade: C-");
            } else if (averageGrade >= 67 && averageGrade <= 69) {
                System.out.println("Overall letter grade: D+");
            } else if (averageGrade >= 65 && averageGrade <= 66) {
                System.out.println("Overall letter grade: D");
            } else if (averageGrade >= 60 && averageGrade <= 64) {
                System.out.println("Overall letter grade: D-");
            } else {
                System.out.println("Overall letter grade: F");
            }
        } else {
            System.out.println("No grades entered.");
        }
    }
}