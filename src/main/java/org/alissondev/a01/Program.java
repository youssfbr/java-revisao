package org.alissondev.a01;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        /*
        A função é um procedimento que tem um significado.
        * */
        double x = Math.sqrt(25.0);

        System.out.println(x);

        /*
         * Fazer um programa para ler 3 numeros inteiros e ler o maior deles
         * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        sc.close();
    }

    private static int max(int a, int b, int c) {
        if ((a > b) && (a > c)) {
            return a;
        } else if ((b > a) && (b > c)) {
            return b;
        } else {
            return c;
        }
    }

    private static void showResult(int value) {
        System.out.println("Higher = " + value);
    }

}