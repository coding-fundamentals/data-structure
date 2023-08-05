package com.coding.fundamentals.linklist;

import java.util.Scanner;

public class LinkList {
  Node head;

  public void createHead() {
    head = getNode();
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
  Node prevNode = null;

  while(count != nodeNumber && p != null) {
    prevNode = p;
    p = p.getNext();
    count++;
  }
  if(p == null) {
    System.out.println("Node number does not exist");
    return;
  }
  Node node = getNode();
  prevNode.setNext(node);
  node.setNext(p);
}
  public void deleteAtEnd() {
    if(head == null) {
      System.out.println("Please create Link list");
      return;
    }

    Node p = head;
    Node t = null;
    while(p.getNext() != null) {
      t = p;
      p = p.getNext();
    }
    if(p == head) {
      head = null;
      return;
    }
    t.setNext(null);
  }

  public void deleteAtBeginning() {
    if(head == null) {
      System.out.println("Please create Link list");
      return;
    }
    Node p = head;
    head = head.getNext();
    p.setNext(null);
  }

  public void deleteANode(int nodeNumber) {
    if(head == null) {
      System.out.println("Please create Link list");
      return;
    }
    if(nodeNumber == 1) {
      deleteAtBeginning();
      return;
    }
    Node p = head;
    Node t = null;
    int count = 1;
    while(p != null && count != nodeNumber) {
      t = p;
      p = p.getNext();
      count++;
    }
    if( p == null) {
      System.out.println("Node number does not exist");
      return;
    }
    t.setNext(p.getNext());
    p.setNext(null);
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