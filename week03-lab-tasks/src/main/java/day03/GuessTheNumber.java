package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    private int tipNumber;
    private int number;


    public int getTipNumber() {
        return tipNumber;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void bingo(int number) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int j = 1;
            System.out.println("Kérem a számot: ");
            int tipNumber = scanner.nextInt();
            scanner.nextLine();
            if (tipNumber > number) {
                System.out.println("A gondolt szám kisebb");
            } else if (tipNumber == number) {
                System.out.println("BINGO");
            } else {
                System.out.println("A gondolt szám nagyobb");
            }
        }
    }

    public static void main(String[] args) {
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        Random random = new Random();
        int number = random.nextInt(1, 101);
        guessTheNumber.setNumber(number);
        System.out.println("Hat lehetőségből találj ki egy számot: ");

        guessTheNumber.bingo(number);
        System.out.println("A gondolt szám a(z) " + number + " volt.");


    }
}