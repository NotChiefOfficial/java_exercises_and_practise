package code;

/* Exercise Five */

import java.util.Scanner;

public class Exercise5 {

    long a, b;
    Scanner scanner;

    public Exercise5() {
        System.out.println("\nWelcome to the Multiplier!\n");
        scanner = new Scanner(System.in);

        System.out.print("Input First Number: ");
        a = scanner.nextInt();
        System.out.println("Input Second Number: ");
        b = scanner.nextInt();

        System.out.println("Result is " + ( a * b ));
    }
}