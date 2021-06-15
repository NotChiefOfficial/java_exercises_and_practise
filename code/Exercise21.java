package code;

// Exercise 21
// Octal from Decimal?

import java.util.Scanner;

public class Exercise21 {

    long decimal;
    Scanner scanner = new Scanner(System.in);

    public Exercise21() {
        System.out.print("Input Decimal Number: ");
        decimal = scanner.nextLong();
        String result = Long.toOctalString(decimal);
        System.out.println("Octal Number of " + decimal + " is: " + result);
    }
}