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

        System.out.println("===============Sort=================================");
        for (int i = len - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (randArray[j] > randArray[j + 1]) {
                    int temp = randArray[j + 1];
                    randArray[j + 1] = randArray[j];
                    randArray[j] = temp;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.print(randArray[i] + " ");
            if ((i + 1) % 10 == 0)
                System.out.println();
        }
    }
}
