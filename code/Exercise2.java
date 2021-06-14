package code;

/* Exercise 2 */

import java.util.Scanner;

public class Exercise2 {

    long a, b;
    Scanner scanner;

    public Exercise2() {
        System.out.println("\nWelcome to the SUMmer!\n");
        scanner = new Scanner(System.in);

        System.out.print("Input First Number: ");
        a = scanner.nextInt();
        System.out.print("Input Second Number: ");
        b = scanner.nextInt();

        System.out.println("Sum of " + a + " and " + b + " is: "+ (a+b));
    }
}