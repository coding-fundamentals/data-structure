package com.coding.fundamentals.searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to search in array");
        int key = sc.nextInt();
        int l = 0;
        int u = ar.length-1;
        int mid = 0;
        while(l <= u) {
            mid = (l+u)/2;
            if(ar[mid] == key) {
                System.out.println("value found at index: " + mid);
                break;
            }
            if(key > ar[mid]) {
                l = mid +1;
            } else {
                u = mid - 1;
            }
        }

        if( l > u) {
            System.out.println("Value not found");
        }
    }
}
