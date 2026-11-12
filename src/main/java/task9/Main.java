package task9;

import java.util.Scanner;

public class Main {
    static void main() {
       Scanner sc = new Scanner(System.in);
       System.out.print("Iveskite N: ");
       int n = sc.nextInt();

       int count = 0;
       System.out.println("Lyginiai skaiciai:");
       for (int i = 1; i <= n; i++) {
           if (i % 2 == 0) {
               System.out.print(i + " ");
               count++;
           }
       }
    System.out.println();
       System.out.println("Kiekis: " + count);
    }
}
