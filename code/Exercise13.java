package code;

// Exercise 13
// Area and Perimeter of a rectangle


import java.util.Scanner;
import static java.lang.Float.parseFloat;

public class Exercise13 {
    float width, height, area, perimeter;
    Scanner scanner;

    public Exercise13() {
        scanner = new Scanner(System.in);

        try {
            System.out.print("Width: ");
            width = parseFloat(scanner.next());
            System.out.print("Height: ");
            height = parseFloat(scanner.next());

            area = width * height;
            perimeter = 2 * (width + height);

            System.out.println("\nArea of rectangle is: " + area);
            System.out.println("Perimeter of rectangle is: " + perimeter);

        } catch (Exception e) {
            System.out.println("Please, use numbers!");
        }



    }
}