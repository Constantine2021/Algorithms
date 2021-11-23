package com.company.sort;

import java.util.Random;
import java.util.Scanner;

/**
 * https://academy.yandex.ru/posts/osnovnye-vidy-sortirovok-i-primery-ikh-realizatsii
 */

public class Quick {

    public static int partition(int[] values, int left, int right) {
        int x = values[right];
        int less = left;
        for (int i = left; i < right; i++) {
            if (values[i] <= x) {
                if (i != less) {
                    int temp = values[i];
                    values[i] = values[less];
                    values[less] = temp;
                }
                ++less;

            }
        }
        int temp = values[right];
        values[right] = values[less];
        values[less] = temp;
        return less;
    }

    public static void quickSort(int[] values, int left, int right) {
        if (left < right) {
            int pivot = partition(values, left, right);
            quickSort(values, left, pivot - 1);
            quickSort(values, pivot + 1, right);
        }
    }
    public static void quickSortStart(int[] values) {
        if (values.length != 0) {
            quickSort(values, 0, values.length - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter a number: ");
        int len = scanner.nextInt();
        int[] randArray = new int[len];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = random.nextInt(51);
            System.out.print(randArray[i] + " ");
            if ((i + 1) % 10 == 0)
                System.out.println();
        }
        scanner.close();

        System.out.println("===============Sort=================================");
        quickSortStart(randArray);
        //quiSort(randArray, 0, randArray.length - 1);

        for (int i = 0; i < randArray.length; i++) {
            System.out.print(randArray[i] + " ");
            if ((i + 1) % 10 == 0)
                System.out.println();
        }
    }

    static void quiSort(int[] values, int left, int right) {
        int leftMarker = left;
        int rightMarker = right;
        int pivot = values[(left + right) / 2];

        do {
            while (values[leftMarker] < pivot)
                leftMarker++;
            while (values[rightMarker] > pivot)
                rightMarker--;

            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = values[leftMarker];
                    values[leftMarker] = values[rightMarker];
                    values[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < right) {
            quiSort(values, leftMarker, right);
        }
        if (left < rightMarker) {
            quiSort(values, left, rightMarker);
        }
    }

}
