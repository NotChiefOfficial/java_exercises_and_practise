package code;

// Exercise 19
// Decimal From Binary

import java.util.Scanner;

public class Exercise19 {
    int result;
    Scanner scanner = new Scanner(System.in);

    public Exercise19() {
        System.out.print("Input Binary Number: ");
        result = Integer.parseInt(scanner.next(), 2);
        System.out.println("Result is: " + result);
    }

}