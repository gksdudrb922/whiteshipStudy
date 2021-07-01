package week4.problem5;

public class Queue {

    private static final int QUEUE_SIZE = 100;
    private int front =-1, rear = -1;
    private int[] queue = new int[QUEUE_SIZE];

    public void offer(int data) {
        if (++rear == QUEUE_SIZE) {
            throw new IllegalStateException("queue is full");
        }
        queue[rear] = data;
    }

    public int poll() {
        if (front == rear) {
            throw new IllegalStateException("queue is empty.");
        }
        return queue[++front];
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    public int[] getQueue() {
        return queue;
    }
}
