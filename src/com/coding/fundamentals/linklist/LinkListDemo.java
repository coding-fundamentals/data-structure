package com.coding.fundamentals.linklist;

import com.coding.fundamentals.queue.CircularQueue;

import java.util.Scanner;

public class LinkListDemo {
  public static void main(String[] args) {
    LinkList mylist = new LinkList();
    Scanner sc = new Scanner(System.in);
    int ch = -1;
    while (ch != 0) {
      System.out.println("\n1. Create link list");
      System.out.println("2. Insert at end");
      System.out.println("3. Insert at beginning");
      System.out.println("4. Insert after node");
      System.out.println("5. Insert before node");
      System.out.println("9. Display");
      System.out.println("0. Exit");
      System.out.print("Entre your choice: ");
      ch = sc.nextInt();
      switch (ch) {
        case 1:
          mylist.createHead();
          break;
        case 2:
          mylist.insertAtEnd();
          break;
        case 3:
          mylist.insertAtBeginning();
          break;
        case 4:
          System.out.print("\nEnter node number: ");
          int nodeNumber = sc.nextInt();
          mylist.insertAfterNode(nodeNumber);
          break;
        case 5:
          System.out.print("\nEnter node number: ");
          nodeNumber = sc.nextInt();
          mylist.insertBeforeNode(nodeNumber);
          break;
        case 9:
          mylist.display();
          break;
      }
    }
  }
}
