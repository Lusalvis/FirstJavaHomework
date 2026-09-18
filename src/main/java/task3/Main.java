package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = in.nextInt();

        System.out.print("Enter y1: ");
        int y1 = in.nextInt();

        System.out.print("Enter x2: ");
        int x2 = in.nextInt();

        System.out.print("Enter y2: ");
        int y2 = in.nextInt();

        int width = x2 - x1;

        int height = y1 - y2;

        int s = width * height;

        int p = 2 * (width + height);

        System.out.println("Area: " + s);
        System.out.println("Perimeter: " + p);
    }
}