package com.introduction;

public class Diamond {

    public static void main(String[] args) {
        int lines_qty = 3;
        int whitespaces = lines_qty - 1;
        int triangle_line = 1;
        for (int i = 0; i < lines_qty; i++) {
            System.out.print(repeat(" ", whitespaces) + repeat("*",triangle_line) + "\n");
            triangle_line += 2;
            whitespaces--;
        }
        triangle_line -= 4;
        whitespaces++;
        for (int i = lines_qty; i > 1; i--) {
            whitespaces++;
            System.out.print(repeat(" ", whitespaces) + repeat("*",triangle_line) + "\n");
            triangle_line -= 2;
        }
    }

    public static String repeat (String str_to_repeat, int times_to_repeat) {
        char[] repeating = new char[times_to_repeat];
        String repeated = String.valueOf(repeating).replace("\0", str_to_repeat);
        return repeated;
    }

}