package com.company.sort;

import java.util.Random;
import java.util.Scanner;

public class Bubble {
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

        int[] arr = new int[]{1,2,3,4,5,65};
        int lenArr = arr.length;
        
        System.out.println("===============Sort=================================");
        bubbleSort(len, randArray);
        bubbleSort(lenArr, arr);
        
        for (int i = 0; i < len; i++) {
            System.out.print(randArray[i] + " ");
            if ((i + 1) % 10 == 0)
                System.out.println();
        }
        System.out.println("====================================================");
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int length, int[] array) {
        for (int i = length - 1; i >= 0; i--) {
            int numOfSwap = 0;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    ++numOfSwap;
                }
            }
            if (numOfSwap == 0)
                break;
        }
    }
}
