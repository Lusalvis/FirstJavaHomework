package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = in.nextDouble();

        System.out.print("Enter b: ");
        double b = in.nextDouble();

        System.out.print("Enter c: ");
        double c = in.nextDouble();

        double p = (a + b + c) / 2;

        double s = Math.sqrt(
                p * (p - a) * (p - b) * (p - c)
        );

        System.out.println("Triangle area: " + s);
    }
}