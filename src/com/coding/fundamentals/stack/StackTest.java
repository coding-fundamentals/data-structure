package com.coding.fundamentals.stack;

import java.util.Scanner;

public class StackTest {
    public static void main(String[] args) {

        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        while (ch != 4) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Entre your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter a value to push into stack");
                    int val = sc.nextInt();
                    stack.push(val);
                    break;
                case 2:
                   stack.pop();
                   break;
                case 3:
                    stack.display();
                    break;
            }
        }
    }
}
