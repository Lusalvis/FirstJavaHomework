package Task7;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite metus");
        int y = sc.nextInt();

        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0 ) {
            System.out.println(y + " keliamieji metai (366 d.)");
        } else {
            System.out.println(y + " nekeliamieji metai (365 d.)");
        }
    }
}