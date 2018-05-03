package com.introduction;

public class Triangle {

    public static void main(String[] args) {
        int linesQty = 3;
        showTriangle(linesQty);
    }

    public static void showTriangle(int linesQty) {
        int whitespacesQty = getWhitespaceQuantityByLine(linesQty);
        String triangle = drawTriangle(linesQty, whitespacesQty);
        System.out.println(triangle);
    }

    public static String drawTriangle(int linesQty, int whitespacesQty) {
        String triangle = new String();
        int asterisksQty = 1;
        for (int i = 0; i < linesQty; i++) {
            triangle = triangle + repeatString(" ", whitespacesQty)
                    + repeatString("*",asterisksQty) + '\n';
            asterisksQty += 2;
            whitespacesQty--;
        }
        return triangle;
    }

    public static int getWhitespaceQuantityByLine(int linesQty) {
        return linesQty - 1;
    }

    public static String repeatString (String strToRepeat, int timesToRepeat) {
        char[] repeating = new char[timesToRepeat];
        return String.valueOf(repeating).replace("\0", strToRepeat);
    }

}
