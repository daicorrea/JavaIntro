package com.introduction;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int lines_qty = 4;
        int whitespaces = lines_qty - 1;
        for (int i = 0; i < lines_qty; i++) {
            for (int j = 0; j <= lines_qty + 2; j++) {
                if (j > whitespaces && j <= ((lines_qty + 2) - whitespaces)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
            whitespaces--;
        }
    }
}
