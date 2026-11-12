package task15;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ivesnkite skaicius (0 - pabaiga):");

        int even = 0;
        int odd = 0;
        int x = sc.nextInt();

        while (x != 0) {
            if (x % 2 == 0){
                even++;
            } else {
                odd++;
            }
            x = sc.nextInt();
        }
    System.out.println("Lyginiai skaiciai: " + even);
    System.out.println("Nelyginiai skaiciai: " + odd);


    }
}
