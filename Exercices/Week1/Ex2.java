//Implement the code of a program that asks for the radius of a circle and returns the respective perimeter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      int radius;
      double perimeter;

      System.out.print("Enter the radius: ");
      radius = scanner.nextInt();

      perimeter = 2 * Math.PI * radius;
      System.out.println("Perimeter: " + perimeter);

      scanner.close();

    }
}
