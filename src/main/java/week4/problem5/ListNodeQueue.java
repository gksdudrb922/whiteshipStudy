package week4.problem5;

import week4.problem2.LinkedList;
import week4.problem2.ListNode;

public class ListNodeQueue {
    private ListNode head;
    private int size = 0;

    public ListNodeQueue() {
        head = new ListNode();
    }

    public void offer(int data) {
        LinkedList.add(head, new ListNode(data), size++);
    }

    public int poll() {
        return LinkedList.remove(head, 0).getData();
    }

    public ListNode getHead() {
        return head;
    }
}
