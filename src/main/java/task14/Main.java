package task14;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ivesnkite N: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean prime = true;
            for (int d = 2; d * d <= i; d++) {
                if (i % d == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }
}
