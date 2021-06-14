package code;

public class Exercise15 {
    int a, b, c;

    public Exercise15() {
        a = 1;
        b = 2;
        System.out.println("Numbers are: " + a + " " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("Numbers are: " + a + " " + b);

    }
}