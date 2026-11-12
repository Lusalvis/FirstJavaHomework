package task17;
import java.io.File;
import java.util.Scanner;

public class Main {
    static void main() throws Exception {
        Scanner sc = new Scanner(new File("duomenys.txt"));
       int n = sc.nextInt();
       int prev = sc.nextInt();
       int count = 0;

       for (int i = 1; i < n; i++) {
           int cur = sc.nextInt();
           if (cur < prev) {
               count++;
           }
           prev = cur;
       }
       System.out.println(count);

    }
}
