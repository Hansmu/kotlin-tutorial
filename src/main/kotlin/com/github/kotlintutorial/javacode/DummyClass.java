package com.github.kotlintutorial.javacode;

public class DummyClass {
    public String isVacationTime(boolean onVacation) {
        return onVacation ? "Is on vacation" : "At work";
    }

    public void printNumbers(int[] numbers) {
        for (int number: numbers) {
            System.out.println(number);
        }
    }

    public void method1(char[] charArray) {
        System.out.println(charArray);
    }
}
