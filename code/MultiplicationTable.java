package code;

import java.util.Scanner;

public class MultiplicationTable {
    public MultiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input whole number: ");

        int a = scanner.nextInt();


        for (int i = 1; i < 11; i++) {
            System.out.println(a + "x" + i + "=" + (a*i));
        }
    }
}