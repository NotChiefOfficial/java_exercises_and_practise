package code;

/* Exercise 7 */

import java.util.Scanner;

public class Exercise7 {

    long a;
    Scanner scanner;

    public Exercise7() {
        System.out.println("\nWelcome to the Multiplication Table!\n");
        scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        a = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(a + "x" + i + "=" + (a*i));
        }
    }
}