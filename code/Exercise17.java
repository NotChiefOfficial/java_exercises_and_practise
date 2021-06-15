package code;

// Exercise 17
// Program to add two binary numbers

import java.util.Scanner;

public class Exercise17 {

    long b1, b2, result;
    int i = 0, remainder = 0;
    int[] sum = new int[20];
    Scanner scanner = new Scanner(System.in);

    public Exercise17() {
        try {
            System.out.print("Print first binary number: ");
            b1 = scanner.nextLong();
            System.out.print("Print second binary number: ");
            b2 = scanner.nextLong();
            scanner.close();

            while (b1 != 0 || b2 != 0) {
                sum[i++] = (int)((b1 % 10 + b2 % 10 + remainder) % 2);
                remainder = (int)((b1 % 10 + b2 % 10 + remainder) / 2);

                b1 = b1 / 10;
                b2 = b2 / 10;
            }
            if (remainder != 0) {
                sum[i++] = remainder;
            }
            --i;
            System.out.print("sum of two binary is: ");
            while(i >= 0){
                System.out.print(sum[i--]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}