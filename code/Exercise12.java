package code;

import java.util.Scanner;
import static java.lang.Float.parseFloat;

// Exercise 12
// Find average of 3 numbers

public class Exercise12 {

    float a, b, c;
    Scanner scanner;

    public Exercise12() {
        scanner = new Scanner(System.in);

        while (a <= 0) {
            System.out.print("Input First Number: ");
            a = getInputFloat();
        }
        while (b <= 0) {
            System.out.print("Input Second Number: ");
            b = getInputFloat();
        }
        while (c <= 0) {
            System.out.print("Input Third Number: ");
            c = getInputFloat();
        }

        System.out.println("\nAverage of these numbers is: " + (a+b+c/3));
    }

    public float getInputFloat() {
        try {
            return parseFloat(scanner.next());
        } catch (Exception e) {
            System.out.println("Type number please!");
            return -1;
        }
    }
}