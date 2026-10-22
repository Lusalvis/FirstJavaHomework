package Task6;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valandos: ");
        int h = sc.nextInt();
        System.out.print("Minutes: ");
        int m = sc.nextInt();
        System.out.print("Sekundes: ");
        int s = sc.nextInt();

        s++;
        if (s == 60) {
            s = 0;
            m++;
            if (m == 60) {
                m = 0;
                h++;
                if (h == 24) {
                    h = 0;
                }
            }
        }
        System.out.println(h + " " + m + " " + s);
    }
}