package task5;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite metus");
        int M = sc.nextInt();

        if (M >= 1896 && (M - 1896) % 4 == 0) {
            int nr = (M - 1896) / 4 + 1;
            System.out.println(M + "Olimpiniai metai. Zaidyniu numeris: " + nr);
        } else {
            System.out.println(M + "Ne olimpiniai metai.");
        }
    }
}