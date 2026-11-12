package task11;


public class Main {
    static void main() {
        for (int n = 10; n <= 99; n++) {
            int tens = n / 10;
            int ones = n % 10;
            int reversed = ones * 10 + tens;

            if (ones == tens * 2 && reversed - n == 36) {
                System.out.println("Sugalvotas skaicius: " + n);
            }
        }

    }
}
