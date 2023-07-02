package com.coding.fundamentals.linklist;

import java.util.Scanner;

public class LinkList {
  Node head;

  public void createHead() {
    Node node = getNode();
    head = node;
  }

  public void insertAtEnd() {
    if(head == null) {
      System.out.println("Please create Link list");
      return;
    }
    Node node = getNode();
    Node p = head;
    while(p.getNext() != null) {
      p = p.getNext();
    }
    p.setNext(node);
  }

public void insertAtBeginning() {
    if(head == null) {
      System.out.println("Please create Link list");
      return;
    }
    Node node = getNode();
    node.setNext(head);
    head = node;
}

public void insertAfterNode(int nodeNumber) {
  if(head == null) {
    System.out.println("Please create Link list");
    return;
  }

  int count = 1;
  Node p = head;

  while(count != nodeNumber && p != null) {
    p = p.getNext();
    count++;
  }
  if(p == null) {
    System.out.println("Node number does not exist");
    return;
  }
  Node node = getNode();
  node.setNext(p.getNext());
  p.setNext(node);

}

public void insertBeforeNode(int nodeNumber) {
  if(head == null) {
    System.out.println("Please create Link list");
    return;
  }
  if(nodeNumber == 1) {
    insertAtBeginning();
    return;
  }
  int count = 1;
  Node p = head;
  Node prev = null;
  while(count != nodeNumber && p != null) {
    prev = p;
    p = p.getNext();
    count++;
  }
  if(p == null) {
    System.out.println("Node number does not exist");
    return;
  }

  Node node = getNode();
  node.setNext(prev.getNext());
  prev.setNext(node);
}

  private static Node getNode() {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter a value into node");
    int val = sc.nextInt();
    Node node = new Node();
    node.setInfo(val);

    return node;
  }

  public void display() {
    if(head == null) {
      System.out.println("Please create Link list");
      return;
    }
    Node p = head;
    while(p != null) {
      System.out.print(p.getInfo() + "-> ");
      p = p.getNext();
    }
  }
}