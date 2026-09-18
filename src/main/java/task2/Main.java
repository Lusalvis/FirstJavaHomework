package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = in.nextInt();

        System.out.print("Enter width: ");
        int width = in.nextInt();

        System.out.print("Enter price: ");
        double price = in.nextDouble();

        int area = length * width;

        double totalArea = area * 1.05;

        double totalPrice = totalArea * price;

        System.out.println("Total price: " + totalPrice);
    }
}