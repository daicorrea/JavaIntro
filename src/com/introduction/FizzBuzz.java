package com.introduction;

import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[] args) {
        ArrayList<String> fizzBuzz = getFizzBuzz();
        System.out.println(fizzBuzz);
    }

    public static ArrayList<String> getFizzBuzz() {
        ArrayList<String> fizzBuzzList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            fizzBuzzList.add(verifyNumbers(i));
        }
        return fizzBuzzList;
    }

    public static String verifyNumbers(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }

        else {
            return String.valueOf(number);
        }
    }

}
