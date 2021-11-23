package com.company;

import com.company.sort.Quick;

import java.util.Random;
import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(int[] values, int number) {
        int low = 0;
        int high = values.length - 1;
        int guesses = 0;

        while (low <= high) {
            ++guesses;
            int mid = (low + high) / 2;
            if (values[mid] == number) {
                System.out.println("Was " + guesses + " guesses! (iterations)");
                return mid;
            }
            else if (values[mid] > number)
                high = mid - 1;
            else low = mid + 1;
        }
        return 1;
    }

    static void squareBruteForce(double a) {
        double epicilon = 0.01;
        int numGuesses = 0;
        double ans = 0.0;

        while (Math.abs(Math.pow(ans, 2) - a) >= epicilon) {
            ans += 0.00001;
            numGuesses += 1;
        }
        if (Math.abs(Math.pow(ans, 2) - a) >= epicilon)
            System.out.println("failed..." + numGuesses);
        else
            System.out.println(ans + " close to square root of " +
                    a + " with " + numGuesses + " number of guesses");
    }

    static void squareBinarySearch(double a) {
        double epicilon = 0.01;
        int numGuesses = 0;
        double low = 0.0;
        double high = a;
        double guess = (low + high) / 2.0;

        while (Math.abs(Math.pow(guess, 2) - a) >= epicilon) {
            numGuesses++;
            if (Math.pow(guess, 2) > a)
                high = guess;
            else low = guess;
            guess = (low + high) / 2.0;
        }
        System.out.println(guess + " is close enough to square root of " + a +
                ". Guesses: " + numGuesses);
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
        System.out.println();

        System.out.println("===============Sort=================================");
        Quick.quickSortStart(randArray);

        for (int i = 0; i < randArray.length; i++) {
            System.out.print(randArray[i] + " ");
            if ((i + 1) % 10 == 0)
                System.out.println();
        }
        System.out.println();

        System.out.print("Enter a value that must be found: ");
        int number = scanner.nextInt();
        int index = binarySearch(randArray, number);
        System.out.println("Value " + number + " is located at index of " + index);
        scanner.close();
        System.out.println();

        System.out.println("===============SquareRoot======================================");
        squareBruteForce(41.23555454523);
        squareBinarySearch(41.23555454523);
        squareBinarySearch(4231.23555454523);
    }
}
