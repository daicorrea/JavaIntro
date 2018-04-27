package com.introduction;

public class Triangle {

    public static void main(String[] args) {
        int lines_qty = 3;
        int whitespaces_qty = getWhitespaceQuantityByLine(lines_qty);
        System.out.println(drawDiamond(lines_qty, whitespaces_qty));
    }

    public static String drawDiamond(int lines_qty, int whitespaces_qty) {
        String diamondBottom = removeInitialLines(drawInvertedTriangle(lines_qty, whitespaces_qty), 2);

        return (drawTriangle(lines_qty, whitespaces_qty)  +
                diamondBottom);
    }

    public static String drawTriangle(int lines_qty, int whitespaces_qty) {
        String triangle = new String();
        int asterisks_qty = 1;
        for (int i = 0; i < lines_qty; i++) {
            triangle = triangle + repeatString(" ", whitespaces_qty)
                    + repeatString("*",asterisks_qty) + repeatString(" ", whitespaces_qty) + '\n';
            asterisks_qty += 2;
            whitespaces_qty--;
        }
        return triangle;
    }

    public static String drawInvertedTriangle(int lines_qty, int whitespaces_qty) {
        StringBuilder invertedTriangle = new StringBuilder();
        invertedTriangle.append(drawTriangle(lines_qty, whitespaces_qty));
        invertedTriangle.reverse();
        return invertedTriangle.toString();
    }

    public static int getWhitespaceQuantityByLine(int lines_qty) {
        return lines_qty - 1;
    }

    public static String repeatString(String str_to_repeat, int times_to_repeat) {
        char[] repeating = new char[times_to_repeat];
        return String.valueOf(repeating).replace("\0", str_to_repeat);
    }

    public static String removeInitialLines(String str_to_remove, int lines_qty) {
        for(int i = 0; i < lines_qty; i++) {
            str_to_remove = str_to_remove.substring(str_to_remove.indexOf("\n") + 1);
        }
        return str_to_remove;
    }

}
