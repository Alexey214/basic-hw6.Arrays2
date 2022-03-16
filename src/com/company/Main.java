package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        //Задача №1:
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.printf("Сумма трат за месяц составила %,d рублей\n", sum);

        //Задача №2:
        Arrays.sort(arr);
        System.out.printf("Минимальная сумма трат за день составила %,d рублей. Максимальная сумма трат за день составила %,d рублей\n", arr[0], arr[arr.length - 1]);

        //Задача №3:
        double d = sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %,.2f рублей\n", d);

        //Задача №4:
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
