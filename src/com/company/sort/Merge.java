package com.company.sort;

// https://javarush.ru/quests/lectures/questharvardcs50.level03.lecture11

import java.util.Random;
import java.util.Scanner;

public class Merge {
    static void mergeSort(int[] values, int[] buffer, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(values, buffer, left, mid);
            mergeSort(values, buffer, mid + 1, right);

            int k = left;
            // i - beginning of the first half, j - of the second half
            for (int i = left, j = mid + 1; i <= mid || j <= right; k++) {
                if (j > right || (i <= mid && values[i] < values[j])) {
                    buffer[k] = values[i++];
                } else {
                    buffer[k] = values[j++];
                }
                //++k; - in for()
            }
            for (int i = left; i <= right; ++i) {
                values[i] = buffer[i];
            }
        }
    }

    static void mergeSortStart(int[] values) {
        if (values.length != 0) {
            int[] buffer = new int[values.length];
            mergeSort(values, buffer, 0, values.length - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int len = scanner.nextInt();
        int[] randArray = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            randArray[i] = random.nextInt(50);
            System.out.print(randArray[i] + " ");
            if ((i + 1) % 10 == 0)
                System.out.println();
        }
        scanner.close();

        System.out.println("===============Sort=================================");
        mergeSortStart(randArray);

        for (int i = 0; i < len; i++) {
            System.out.print(randArray[i] + " ");
            if ((i + 1) % 10 == 0)
                System.out.println();
        }
    }
}
