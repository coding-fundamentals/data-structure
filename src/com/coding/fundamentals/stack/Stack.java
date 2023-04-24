package com.coding.fundamentals.stack;

public class Stack {
    int[] stack = new int[5];
    int top = -1;

    public void push(int val) {
        if(top + 1 >= stack.length) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = val;
    }

    public void pop() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Deleted value is: " + stack[top--]);
    }

    public void display() {
        if(top == -1) {
            System.out.println("Stack is empty, no data to print");
            return;
        }
        for (int i = top; i >=0; i--){
            System.out.println("Value at index "+ i + " is "+stack[i]);
        }
    }
}
