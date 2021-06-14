package code;

// Exercise 11
// Area and perimeter of a circle

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Float.parseFloat;

public class Exercise11 {

    String input;
    float radius, circle_area, circle_perimeter;
    Scanner scanner;


    public Exercise11() {
        scanner = new Scanner(System.in);
        System.out.print("Give a radius of a circle: ");

        input = scanner.next();

        try {
            radius = parseFloat(input);
            circle_area = (float) (Math.PI * (radius * radius));
            circle_perimeter = (float) (2 * (Math.PI * radius));

            System.out.println("\nCircle Perimeter: " + (circle_perimeter));
            System.out.println("Circle Area: " + (circle_area));
        } catch (Exception e) {
            System.out.println("You have to type a number!\n");
            new Exercise11();
        }
    }
}