package task12;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Aukstis: ");
        int h= sc.nextInt();
        System.out.print("Plotis: ");
        int w = sc.nextInt();

        if (h < 2 || w < 2) {
            System.out.println("Abu turi buti bent 2.");
            return;

        }
    for (int row = 1; row <= h; row++) {
        for (int col = 1; col <= w; col++) {
            if(row == 1 || row == h || col == 1 || col == w){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
}
