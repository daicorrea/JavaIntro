package com.introduction;

public class Diamond {

    public static void main(String[] args) {
        int linesQty = 3;
        int whitespacesQty = getWhitespaceQuantityByLine(linesQty);
        System.out.println(drawDiamond(linesQty, whitespacesQty));
    }

    public static String drawDiamond(int linesQty, int whitespacesQty) {
        String diamondBottom = removeInitialLines(drawInvertedTriangle(linesQty, whitespacesQty), 2);
        return (drawTriangle(linesQty, whitespacesQty)  +
                diamondBottom);
    }

    public static String drawTriangle(int linesQty, int whitespacesQty) {
        String triangle = new String();
        int asterisksQty = 1;
        for (int i = 0; i < linesQty; i++) {
            triangle = triangle + repeatString(" ", whitespacesQty)
                    + repeatString("*",asterisksQty) + repeatString(" ", whitespacesQty) + '\n';
            asterisksQty += 2;
            whitespacesQty--;
        }
        return triangle;
    }

    public static String drawInvertedTriangle(int linesQty, int whitespacesQty) {
        StringBuilder invertedTriangle = new StringBuilder();
        invertedTriangle.append(drawTriangle(linesQty, whitespacesQty));
        invertedTriangle.reverse();
        return invertedTriangle.toString();
    }

    public static int getWhitespaceQuantityByLine(int linesQty) {
        return linesQty - 1;
    }

    public static String repeatString(String strToRepeat, int timesToRepeat) {
        char[] repeating = new char[timesToRepeat];
        return String.valueOf(repeating).replace("\0", strToRepeat);
    }

    public static String removeInitialLines(String strToRemove, int linesQty) {
        for(int i = 0; i < linesQty; i++) {
            strToRemove = strToRemove.substring(strToRemove.indexOf("\n") + 1);
        }
        return strToRemove;
    }

}
