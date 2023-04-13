package com.coding.fundamentals.stack;

import java.util.Scanner;

public class StackStructuredWay {
    public static void main(String[] args) {
        int[] stack = new int[5];
        int top = -1;
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
                    top = push(stack, top, val);
                    break;
                case 2:
                    top = pop(stack, top);
                    break;
                case 3:
                    display(stack, top);
                    break;

            }

        }

    }

    public static int push(int[] stack, int top, int val) {
        if(top + 1 >= stack.length) {
            System.out.println("Stack is full");
            return top;
        }
        stack[++top] = val;
        return top;
    }
    public static int pop(int[] stack, int top) {
        if(top == -1) {
            System.out.println("Stack is empty");
            return top;
        }
        System.out.println("Deleted value is: " + stack[top]);
        top = top -1;
        return top;
    }
    public static void display(int[] stack, int top) {
        for (int i = top; i >=0; i--){
            System.out.println("Value at index "+ i + " is "+stack[i]);
        }
    }





}
