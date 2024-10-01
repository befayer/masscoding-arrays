package io.hexlet;

public class MinMaxInArray {
    public static void main(String[] args) {
        int[] numbers = {5, 12, -4, 7, 0, 9};

        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Минимум = " + min);
        System.out.println("Максимум = " + max);
    }
}
