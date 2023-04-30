package com.coding.fundamentals.queue;

public class Queue {
  int[] queue;
  int front;
  int rear;

  public Queue() {
    front = -1;
    rear = -1;
    queue = new int[5];
  }
  public Queue(int size) {
    this.queue = new int[size];
    this.front = -1;
    this.rear = -1;
  }

  public void insert(int val) {
    if(rear == queue.length-1) {
      System.out.println("Queue is full");
      return;
    }
    queue[++rear] = val;
  }

  public void delete() {
    if(rear == front) {
      System.out.println("Queue is empty");
      return;
    }
    System.out.println("Deleted value is: " + queue[++front]);
  }

  void display() {
    if(rear == front) {
      System.out.println("Queue is empty");
      return;
    }
    for(int i = front+1; i <= rear; i++) {
      System.out.print(queue[i] + "  ");
    }
    System.out.println();
  }

}
