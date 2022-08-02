package com.bridgelabz.AssignmentDay16and17;

import java.util.Arrays;
import java.util.Scanner;
public class AnagramDetection {
    public static boolean findAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        if (str1.length() != str2.length()) {
            return false;
        }else {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        String str1, str2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String One");
        str1 = scanner.next();
        System.out.println("Enter String Two");
        str2 = scanner.next();

        boolean res = findAnagram(str1, str2);
        if(res) {
            System.out.println("Two String are anagram");
        }else {
            System.out.println("Two String are not anagram");
        }

    }
}
