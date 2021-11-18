package com.company.sort;


public class StringSort {
    public static void main(String[] args) {
        System.out.println("Array of strings: ");
        String[] strArray = new String[]{"zvnmb", "jlkoph", "muywasd", "abcbb", "abcbbb", "abc", "muy" ,"aaaaaaaa", "afc"};
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        for (int i = strArray.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (strArray[j].compareTo(strArray[j+1]) > 0) {
                    String temp = strArray[j];
                    strArray[j] = strArray[j].replaceAll(strArray[j], strArray[j+1]);
                    strArray[j+1] = strArray[j+1].replaceAll(strArray[j+1], temp);
                }
//                if (strArray[j].charAt(0) == strArray[j + 1].charAt(0)) {
//                    int len = Math.min(strArray[j].length(),strArray[j+1].length());
//                    for (int k = 1; k < len; k++) {
//                        if (strArray[j].charAt(k) > strArray[j + 1].charAt(k)) {
//                            String temp = strArray[j];
//                            strArray[j] = strArray[j].replaceAll(strArray[j], strArray[j+1]);
//                            strArray[j+1] = strArray[j+1].replaceAll(strArray[j+1], temp);
//                            break;
//                        }
//                    }
//                }
//                else if (strArray[j].charAt(0) > strArray[j + 1].charAt(0)) {
//                    String temp = strArray[j];
//                    strArray[j] = strArray[j].replaceAll(strArray[j], strArray[j+1]);
//                    strArray[j+1] = strArray[j+1].replaceAll(strArray[j+1], temp);
//                }
            }
        }

        System.out.println("===============Sort=================================");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }
}
