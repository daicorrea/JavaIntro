package com.introduction;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactors {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to know the Factors");
        int number = sc.nextInt();
        System.out.println(generate(number));
    }

    public static ArrayList<Integer> generate(int number) {
        ArrayList<Integer> factorsList = new ArrayList<>();
        for (int i = number; i >  1; i-- ) {
            if (verifyPrime(i) && (number % i == 0)) {
                factorsList.add(i);
            }
        }
        return factorsList;
    }

    public static boolean verifyPrime(int number) {
        if (number == 2) {
            return true;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
