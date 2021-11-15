package com.company;

public class Main {
    /**
     *
     * String reverse algorithms on JAVA
     *
     */

//    public static void main(String[] args) {
//        String string = "Hello, world", revString = "";
//        int length = string.length();
//
//        for (int i = length - 1; i >= 0; i--) {
//            char ch = string.charAt(i);
//            revString += ch;
//        }
//        System.out.println(revString);
//    }

    public static void main(String[] args) {
        String string = "Hello, world", res = "";
        char ch[] = string.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            res += ch[i];
        }
        System.out.println(res);
    }

//    public static void main(String[] args) {
//        String string = "Hello, world";
//        byte[] strAsByteArray = string.getBytes();
//        byte[] result = new byte[strAsByteArray.length];
//
//        for (int i = 0; i < strAsByteArray.length; i++) {
//            result[i] = strAsByteArray[strAsByteArray.length - 1 - i];
//        }
//        System.out.println(new String(result));
//    }

//    public static void main(String[] args) {
//        String string = "Hello, world";
//        StringBuilder result = new StringBuilder();
//        result.append(string);
//        result.reverse();
//        System.out.println(result);
//    }
}
