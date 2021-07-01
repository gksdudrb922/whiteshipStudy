package week4.problem3;

public class Stack {

    private static final int STACK_SIZE = 100;
    private int top = -1;
    private int[] stack = new int[STACK_SIZE];

    public void push(int data) {
        if (++top == STACK_SIZE) {
            throw new IllegalStateException("stack is full");
        }
        stack[top] = data;
    }

    public int pop() {
        if (top == -1) {
            throw new IllegalStateException("stack is empty.");
        }
        return stack[top--];
    }

    public int getTop() {
        return top;
    }

    public int[] getStack() {
        return stack;
    }
}
