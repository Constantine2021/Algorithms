package com.company.sort;


public class StringSort {

    static String[] strArray = new String[]{"zvnmb", "jlkoph", "muywasd", "abcbb",
            "abcbbb", "abc", "muy" ,"aaaaaaaa", "afc"};

    static void stringsSwap(int j) {
        String temp = strArray[j];
        strArray[j] = strArray[j+1];
        strArray[j+1] = temp;
    }

    public static void main(String[] args) {
        System.out.println("Array of strings: ");
        for (String i : strArray) {
            System.out.println(i);
        }

        for (int i = strArray.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (strArray[j].compareTo(strArray[j+1]) > 0) {
                    stringsSwap(j);
                }
//                if (strArray[j].charAt(0) == strArray[j + 1].charAt(0)) {
//                    int len = Math.min(strArray[j].length(),strArray[j+1].length());
//                    for (int k = 1; k < len; k++) {
//                        if (strArray[j].charAt(k) > strArray[j + 1].charAt(k)) {
//                            strArray[j] = strArray[j] + strArray[j+1];
//                            strArray[j + 1] = strArray[j].substring(0,
//                                    strArray[j].length() - strArray[j+1].length());
//                            strArray[j] = strArray[j].substring(strArray[j+1].length());
//                            break;
//                        }
//                    }
//                }
//                else if (strArray[j].charAt(0) > strArray[j + 1].charAt(0)) {
//                    strArray[j] = strArray[j] + strArray[j+1];
//                    strArray[j + 1] = strArray[j].substring(0,
//                            strArray[j].length() - strArray[j+1].length());
//                    strArray[j] = strArray[j].substring(strArray[j+1].length());
//                }
            }
        }

        System.out.println("===============Sort=================================");
        for (String i : strArray) {
            System.out.println(i);
        }
    }
}
