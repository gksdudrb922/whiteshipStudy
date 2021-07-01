package week4.problem4;

import week4.problem2.LinkedList;
import week4.problem2.ListNode;

public class ListNodeStack {

    private ListNode head;

    public ListNodeStack() {
        head = new ListNode();
    }

    public void push(int data) {
        LinkedList.add(head, new ListNode(data), 0);
    }

    public int pop() {
        return LinkedList.remove(head, 0).getData();
    }

    public ListNode getHead() {
        return head;
    }
}
