// Program that converts basic education grades into qualitative evaluations -> if the grade is 0 or 1 evaluation = "Poor", 2 = "Mediocre", 3 = "Satisfactory", 4 = "Good", 5 = "Very good"

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String evaluation = "";

        System.out.println("Enter the grade: ");
        int grade = scanner.nextInt();

        if(grade >= 0 && grade <= 1){
            evaluation = "Poor";
        }else if(grade == 2){
            evaluation = "Mediocre";
        }else if(grade == 3){
            evaluation = "Satisfactory";
        }else if(grade == 4){
            evaluation = "Good";
        }else if(grade == 5){
            evaluation = "Very good";
        }else{
            System.out.println("Invalid value");
        }

        System.out.print(evaluation);
    }
}
