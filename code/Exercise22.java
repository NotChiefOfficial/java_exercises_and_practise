package code;

// Exercise 22
// Decimal From Binary


import java.util.Scanner;

public class Exercise22 {

    long binary;
    Scanner scanner = new Scanner(System.in);

    public Exercise22() {
        System.out.print("Input Binary Number: ");
        binary = scanner.nextLong(2);
        System.out.println("Decimal is: " + binary);
    }

}