package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter v: ");
        int v = in.nextInt();

        System.out.print("Enter n: ");
        int n = in.nextInt();

        double k = (v * 12.0) / n;

        System.out.println("Books per visitor: " + Math.round(k));
    }
}