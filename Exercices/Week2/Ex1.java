// Program that converts basic education grades into qualitative evaluations -> if the grade is 0 or 1 evaluation = "Poor", 2 = "Mediocre", 3 = "Satisfactory", 4 = "Good", 5 = "Very good"

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String evaluation = "";
        int grade;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a grade: ");
        grade = scanner.nextInt();

        switch (grade) {
            case 0, 1:
                evaluation = "Poor";
                break;
            case 2:
                evaluation = "Mediocre";
                break;
            case 3:
                evaluation = "Satisfactory";
                break;
            case 4:
                evaluation = "Good";
                break;
            case 5:
                evaluation = "Very good";
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println(evaluation);
    }
}
