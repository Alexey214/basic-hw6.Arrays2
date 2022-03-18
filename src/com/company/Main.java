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
        System.out.println();

        sum5();         //Проверка результатов Задача №5:
        sum6();         //Проверка результатов Задача №6:
        sum7();         //Проверка результатов Задача №7:
        sum8();         //Проверка результатов Задача №8:
        sum9();         //Проверка результатов Задача №8:

    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    //Задача №5:
    public static void sum5() {
        int a, b;
        a = b = 3;
        int number = 1;
        int[][] matrix = new int[a][b];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || i + j == matrix.length - 1) {
                    matrix[i][j] = number;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    //Задача №6:
    public static void sum6() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] arrCorrect = new int[arr.length];
        int i = 0;
        System.out.println(Arrays.toString(arr));
        for (int j = arr.length - 1; j >= 0; j--) {
            arrCorrect[i] = arr[j];
            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            arr[j] = arrCorrect[j];
        }
        System.out.println(Arrays.toString(arr));
    }

    //Задача №7:
    public static void sum7() {
        int[] arr = {5, 4, 3, 2, 1};
        int a, b;
        int count = arr.length - 1;
        int arrMid = (int) Math.floor(arr.length / 2);
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j <= arrMid; j++) {
            a = arr[j];
            b = arr[count];
            arr[j] = b;
            arr[count] = a;
            count--;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Задача №8:
    public static void sum8() {
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int x = -2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.printf("Числа дающие в сумме %d: " + arr[i] + " и " + arr[j] + "\n", x);
                }
            }
            break;
        }
    }

    //Задача №9:
    public static void sum9() {
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int arrMid = (int) Math.floor(arr.length / 2);
        int x = -2;
        System.out.print("Числа дающие в сумме " + x + " :");
        for (int i = 0; i < arrMid; i++) {
            for (int j = arr.length - 1; j > arrMid; j--) {
                if (arr[i] + arr[j] == x) {
                    System.out.print(arr[i] + " и " + arr[j] + "; ");
                }
            }
        }
    }
}