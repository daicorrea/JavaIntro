package com.introduction;

import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[] args) {
        ArrayList<String> fizzBuzz = getFizzBuzz();
        System.out.println(fizzBuzz);
    }

    public static ArrayList<String> getFizzBuzz() {
        ArrayList<String> fizzBuzzList = new ArrayList<String>();
        for (int i = 1; i <= 100; i++) {
            fizzBuzzList.add(String.valueOf(i));
        }
        return fizzBuzzList;
    }

}
