package com.introduction;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int numb = 3;
        int whitespaces = numb-1;
        char triangle_field[][] = new char[numb][numb+2];
        for (int i = 0; i < numb; i++) {
            for (int j = 0; j < numb + 2; j++) {
                if((j > whitespaces) && (j < (numb + 2) - whitespaces)) {
                    triangle_field[i][j] = ' ';
                }
                else {
                    triangle_field[i][j] = '*';
                }
            }
            whitespaces--;
        }
        System.out.println(Arrays.deepToString(triangle_field));
    }
}
