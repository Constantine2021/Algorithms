package com.company.sort;

import java.util.Random;
import java.util.Scanner;

public class Selection {
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
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (randArray[j] < randArray[i]) {
                    int temp = randArray[i];
                    randArray[i] = randArray[j];
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
