package io.hexlet;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {9, 3, 7, 1, 4};

        Arrays.sort(numbers);

        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));
    }
}
