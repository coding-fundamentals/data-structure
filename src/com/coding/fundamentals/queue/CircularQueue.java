package com.coding.fundamentals.queue;

public class CircularQueue {
  int[] queue;
  int front;
  int rear;
  int size;

  public CircularQueue() {
    queue = new int[5];
    front = 0;
    rear = 0;
    size = 5;
  }

  public CircularQueue(int size) {
    this.queue = new int[size];
    front = 0;
    rear = 0;
    this.size = size;
  }

  public void insert(int val) {
    if((rear+1) % size == front) {
      System.out.println("Queue is full");
      return;
    }
    queue[rear] = val;
    rear = (rear + 1) % size;
  }

  public void delete() {
    if(front == rear) {
      System.out.println("Queue is empty");
      return;
    }
    System.out.println("Deleted value is: " + queue[front]);
    front = (front + 1) % size;
  }

  public void display() {
    if(front == rear) {
      System.out.println("Queue is empty");
      return;
    }

    for (int i = front; i != rear; i = (i+1)%size) {
      System.out.print(queue[i]+ "  ");
    }
    System.out.println();
  }








}
