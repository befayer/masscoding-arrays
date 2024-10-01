package io.hexlet;

public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Сумма = " + sum);
    }
}
