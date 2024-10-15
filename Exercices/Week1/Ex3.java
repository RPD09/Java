//Create a program that asks for a current month and displays the following month

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextMonth, month;

        try {
            System.out.print("Current month: ");
            month = scanner.nextInt();

            if (month >= 1 && month <= 12) {
                nextMonth = (month % 12) + 1;
                System.out.printf("The month following %d is %d%n", month, nextMonth);
            } else {
                System.out.println("Invalid month");
            }
        } catch (Exception e) {
            System.out.printf("Error => %s%n", e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
