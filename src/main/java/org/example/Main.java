package org.example;

class Math {
    public static int add(int... args) {
        int result = 0;
        for (var number : args) {
            result += number;
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}