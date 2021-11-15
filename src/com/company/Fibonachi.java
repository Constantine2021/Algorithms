package com.company;

/**
 *  Fibonacci numbers
 */
public class Fibonachi {
    public static void main(String[] args) {
        System.out.println("========numsFibonacci================================================");
        numsFibonacci(1);
        numsFibonacci(2);
        numsFibonacci(3);
        numsFibonacci(5);
        numsFibonacci(10);
        numsFibonacci(20);
        System.out.println("========fibSumRec================================================");
        System.out.println(fibSumRec(10));
        System.out.println("\n========getFibonacciValueRec================================================");
        System.out.println(getFibonacciValueRec(0));
        System.out.println(getFibonacciValueRec(1));
        System.out.println(getFibonacciValueRec(2));
        System.out.println(getFibonacciValueRec(5));
        System.out.println(getFibonacciValueRec(10));
        System.out.println(getFibonacciValueRec(7));
        System.out.println("\n========getFibonacciValue================================================");
        System.out.println(getFibonacciValue(7));
        System.out.println(getFibonacciValue(10));
        System.out.println(getFibonacciValue(5));
    }

    static void numsFibonacci(int len) {
        if (len <= 0) {
            System.out.println("For what?)");
            return;
        }
        int[] fib = new int[len];
        int sum = 0;
        fib[0] = 0;
        if (len == 1) {
            System.out.println(fib[0]);
            System.out.println("Sum = " + sum + "\n");
            return;
        }
        fib[1] = 1;
        sum += fib[1];
        if (len == 2) {
            System.out.println(fib[0] + " " + fib[1]);
            System.out.println("Sum = " + sum + "\n");
            return;
        }
        System.out.print(fib[0] + " " + fib[1] + " ");
        for (int i = 2; i < len; i++) {
            fib[i] = fib[i-1] + fib[i-2];
            sum += fib[i];
            System.out.print(fib[i] + " ");
        }
        System.out.println("\nSum = " + sum + "\n");
    }

    static int getFibonacciValue(int n) {
        if (n <= 1)
            return 0;
        if (n == 2)
            return 1;
        int prev = 0, next = 1;
        for (int i = 2; i < n; i++) {
            int temp = next;
            next = prev + next;
            prev = temp;
        }
        return next;
    }

    static long getFibonacciValueRec(int n) {
        if (n <= 1)
            return 0;
        if (n == 2)
            return 1;
        return getFibonacciValueRec(n - 1) + getFibonacciValueRec(n - 2);
    }

    static int fibSumRec(int n) {
        if (n <= 1)
            return 0;
        if (n == 2)
            return 1;
        return fibSumRec(n-1) + fibSumRec(n-2) + 1;
    }
}
