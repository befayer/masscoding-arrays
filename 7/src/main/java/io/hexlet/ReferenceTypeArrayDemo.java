package io.hexlet;

public class ReferenceTypeArrayDemo {
    public static void main(String[] args) {
        // Шаг 1: Создаем оригинальный массив
        int[] originalArray = {1, 2, 3, 4, 5};

        // Шаг 2: Создаем вторую переменную, ссылающуюся на тот же массив
        int[] referenceArray = originalArray;

        // Шаг 3: Изменяем элементы массива через referenceArray
        referenceArray[0] = 99;
        referenceArray[4] = 55;

        // Шаг 4: Выводим элементы originalArray
        System.out.println("Элементы originalArray после изменений:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        // Ожидаемый вывод: 99 2 3 4 55
    }
}
