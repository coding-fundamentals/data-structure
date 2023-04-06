package com.coding.fundamentals.searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] ar = {2, 5, 6, 1, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to search");
        int key = sc.nextInt();
        int i = 0;
        while(i < ar.length) {
            if(ar[i] == key) {
                System.out.println("Value found at index: " + i);
                break;
            }
            i++;
        }
        if(i == ar.length) {
            System.out.println("Value not found in given array");
        }
    }
}
