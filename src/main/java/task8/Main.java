package task8;

import java.util.Scanner;


public class Main {
    static void main() {
       Scanner sc = new Scanner(System.in);
       System.out.print("Iveskite skaiciu: ");
       int n = sc.nextInt();

       for (int i = 1; i <= 10; i++) {
           System.out.println(n+ " x " + i + " = " + (n * i));
       }

    }
}
