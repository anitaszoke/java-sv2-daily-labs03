package day05;

import java.util.Scanner;


public class JournalMain {
    public static void main(String[] args) {
        Journal journal = new Journal();

        System.out.println(journal.addStudent("Kovács Kati"));
        System.out.println(journal.addStudent("Kati"));
        System.out.println(journal.addStudent(" Kati"));
        System.out.println(journal.addStudent("Kovács Kati "));
        System.out.println(journal.getName());

    }
}
