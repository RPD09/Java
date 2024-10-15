//Implement a program that receives 3 integers and displays them in descending order (only use if and else).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Enter the 1st integer value: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the 2nd integer value: ");
        num2 = scanner.nextInt();
        System.out.print("Enter the 3rd integer value: ");
        num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.printf("%d, %d, %d", num1, num2, num3);
            } else {
                System.out.printf("%d, %d, %d", num1, num3, num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.printf("%d, %d, %d", num2, num1, num3);
            } else {
                System.out.printf("%d, %d, %d", num2, num3, num1);
            }
        } else {
            if (num1 >= num2) {
                System.out.printf("%d, %d, %d", num3, num1, num2);
            } else {
                System.out.printf("%d, %d, %d", num3, num2, num1);
            }
        }

        scanner.close();
    }
}


