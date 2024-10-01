package io.hexlet;

public class CountOccurrencesInArray {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 2, 4, 2, 5};
        int target = 2;
        int count = 0;

        for (int num : numbers) {
            if (num == target) {
                count++;
            }
        }

        System.out.println("Число " + target + " встречается " + count + " раз(а)");
    }
}
