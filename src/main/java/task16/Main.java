package task16;
import java.io.File;
import java.util.Scanner;

public class Main {
    static void main() throws Exception {
        Scanner sc = new Scanner(new File("data.txt"));

        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            if (t < 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Neigiamu temperaturu neuzfiksuota");
        } else {
            System.out.println("Dienu su neigiama temperatura: " + count);
        }

    }
}
