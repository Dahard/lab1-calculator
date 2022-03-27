package ui;

import java.util.Scanner;

public class UserInput {

    static double inputDoubleHigherThanZero() {

        double a = 0;

        while (a <= 0) {
            try {
                Scanner scanner = new Scanner(System.in);
                a = scanner.nextDouble();
                if (a <= 0) {
                    System.out.println("Liczba nie może być mniejsza lub równa 0");
                }
            } catch (Exception e) {
                System.out.println("Wprowadź liczbę.");
            }
        }
        return a;
    }

    static int inputIntHigherThanZeroInRangeToC(int c) {
        int b = 0;
        while (b <= 0 || b > c) {
            try {
                Scanner scanner = new Scanner(System.in);
                b = scanner.nextInt();
                if (b <= 0) {
                    System.out.println("Liczba nie może być mniejsza lub równa 0");
                }
                if (b > c) {
                    System.out.println("Liczba nie może być większa od " + c);
                }
            } catch (Exception e) {
                System.out.println("Wprowadź liczbę.");
            }
        }
        return b;
    }
}