package code;

import java.util.Scanner;

public class Exercise18 {

    long b1, b2;
    Scanner scanner = new Scanner(System.in);

    public Exercise18() {
        System.out.print("Input first binary: ");
        b1 = scanner.nextLong(2);
        System.out.print("Input second binary: ");
        b2 = scanner.nextLong(2);

        long result = b1 * b2;

        System.out.println("\nresult: " + Long.toBinaryString(result));
    }
}