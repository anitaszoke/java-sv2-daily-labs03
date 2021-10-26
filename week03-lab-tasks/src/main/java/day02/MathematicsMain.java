package day02;

import java.util.Scanner;

public class MathematicsMain {

    public static void main(String[] args) {
        Mathematics mathematics = new Mathematics();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy számot");
        int number = scanner.nextInt();

        System.out.println(mathematics.isPrime(number));
    }
}
