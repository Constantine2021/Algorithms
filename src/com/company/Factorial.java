package com.company;

/**
 *  Factorial algorithm
 */

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(7));
        System.out.println(factorial(12));
        System.out.println("===========================================");
        System.out.println(factRecursion(9));
        System.out.println(factRecursion(13));
        System.out.println(factRecursion(5));
        System.out.println(factRecursion(1));
    }

    static long factorial(int num) {
        if (num == 1 || num == 0)
            return 1;

        long res = 1;
        for (long i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    static long factRecursion(int num) {
        return num == 1 || num == 0 ? 1 : num * factRecursion(num - 1);
    }
}
//    factorial(3) внутри себя выполнит следующее:
//        result = 3 * factorial(2); (рекурсивный вызов)
//
//        factorial(2) внутри себя выполнит следующее:
//            result = 2 * factorial(1); (рекурсивный вызов)
//
//            factorial(1) вернет 1 (базис рекурсии)
//
//        factorial(2) вернет 2 * 1
//
//    factorial(3) вернет 3 * 2 * 1
