package code;

// Exercise 20
// Hexadecimal from Decimal

import java.util.Scanner;

public class Exercise20 {
    long decimal;
    Scanner scanner = new Scanner(System.in);

    public Exercise20() {
        System.out.print("Input Decimal Number: ");
        decimal = Long.parseLong(scanner.next());
        String hex = Long.toHexString(decimal);
        System.out.println("Hexadecimal Value of " + decimal + " is: " + hex.toUpperCase());
    }

}