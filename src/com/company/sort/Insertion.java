package com.company.sort;

import java.util.Random;
import java.util.Scanner;

public class Insertion {
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
        for (int i = 1; i < len; i++){
            int j = i;
            while (j > 0 && randArray[j - 1] > randArray[j]) {
                int temp = randArray[j - 1];
                randArray[j - 1] = randArray[j];
                randArray[j] = temp;
                --j;
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.print(randArray[i] + " ");
            if ((i + 1) % 10 == 0)
                System.out.println();
        }
    }
}
