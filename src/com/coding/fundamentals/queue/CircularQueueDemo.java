package com.coding.fundamentals.queue;

import java.util.Scanner;

public class CircularQueueDemo {
  public static void main(String[] args) {
    CircularQueue queue = new CircularQueue();
    Scanner sc = new Scanner(System.in);
    int ch = 0;
    while (ch != 4) {
      System.out.println("1. Insert");
      System.out.println("2. Delete");
      System.out.println("3. Display");
      System.out.println("4. Exit");
      System.out.print("     Entre your choice: ");
      ch = sc.nextInt();
      switch (ch) {
        case 1:
          System.out.println("Enter a value to insert in queue:");
          int val = sc.nextInt();
          queue.insert(val);
          break;
        case 2:
          queue.delete();
          break;
        case 3:
          queue.display();
          break;
      }
    }
  }
}
