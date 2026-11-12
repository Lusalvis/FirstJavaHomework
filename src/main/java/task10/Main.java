package task10;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite N (0-12): ");
        int n = sc.nextInt();

        if (n < 0 || n > 12) {
            System.out.println("N turi buti nuo 0 iki 12.");
            return;
        }

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(n + "! = " + fact);

    }
}
