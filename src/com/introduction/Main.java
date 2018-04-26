package com.introduction;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int lines_qty = 5;
        int whitespaces = lines_qty - 1;
        int triangle_line = 1;
        for (int i = 0; i < lines_qty; i++) {
            System.out.print(repeat(" ", whitespaces));
            System.out.print(repeat("*",triangle_line));
            System.out.print("\n");
            triangle_line += 2;
            whitespaces--;
        }
    }

    public static String repeat (String str_to_repeat, int times_to_repeat) {
        char[] repeating = new char[times_to_repeat];
        String repeated = String.valueOf(repeating).replace("\0", str_to_repeat);
        return repeated;
    }
}
