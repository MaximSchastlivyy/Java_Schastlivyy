package ru.geekbrains.hw2;

import java.util.Arrays;

public class hw2 {


    // Первое задание
    public static void main(String[] args) {

        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int i;
        for (i = 0; i < myArray.length; i++) {
            if (myArray[i] == 1) {
                myArray[i] = 0;
            } else {
                myArray[i] = 1;
            }
        }
        System.out.println("Результат первого задания:");
        System.out.println(Arrays.toString(myArray));


        // Второе задание
        int[] emptyArray = new int[8];

        int[] arrayWithNumbers = {1, 4, 7, 10, 13, 16, 19, 22};

        int j;

        for (j = 0; j < emptyArray.length; j++) {
            emptyArray[j] = arrayWithNumbers[j];
        }

        System.out.println("Результат второго задания:");
        System.out.println(Arrays.toString(emptyArray));


        // Третье задание
        int[] myArray2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int k;
        for (k = 0; k < myArray2.length; k++) {
            int a = myArray2[k];
            if (a < 6) {
                myArray2[k] = a * 2;
            }
        }

        System.out.println("Результат третьего задания:");
        System.out.println(Arrays.toString(myArray2));


        //Четвертое задание
        int[] myArray3 = {4, 8, 3, 2, 11, 7, 11, 14, 12, 17, 9, 1};

        int l, max = 0, min = 100;

        for (l = 0; l < myArray3.length; l++) {
            if (myArray3[l] >= max) {
                max = myArray3[l];
            }

            if (myArray3[l] <= min) {
                min = myArray3[l];
            }
        }

        System.out.println("Результат четвертого задания:");
        System.out.println("Максимальное значение массива = " + max);
        System.out.println("Минимальное значение массива = " + min);

        //Пятое задание
        int[][] table = new int[5][5];
        int b, c;
        int counter = 1;

        System.out.println("Результат пятого задания:");
        for (b = 0; b < table.length; b++) {
            for (c = 0; c < table.length; c++) {
                if (b == c) {
                    table[b][c] = counter;
                }
                System.out.print(table[b][c]);
            }
            System.out.println();
        }


    }
}






















