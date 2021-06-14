package code;

/* Exercise 3 */

import java.util.Scanner;

public class DivideTwoNumbers {

    long a, b;
    Scanner scanner;

    public DivideTwoNumbers() {
        scanner = new Scanner(System.in);

        System.out.print("Input First Number: ");
        a = scanner.nextInt();

        System.out.println("Input Second Number: ");
        b = scanner.nextInt();

        System.out.println(a/b);
    }
}