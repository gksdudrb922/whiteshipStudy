package week4.problem2;

public class LinkedList {

    public static ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        if (position < 0) {
            exceptByPosition();
        }

        ListNode pre = updatePreNode(head, position);

        nodeToAdd.setNext(pre.getNext());
        pre.setNext(nodeToAdd);

        return nodeToAdd;
    }

    public static ListNode remove(ListNode head, int positionToRemove) {
        if (positionToRemove < 0) {
            exceptByPosition();
        }

        ListNode pre = updatePreNode(head, positionToRemove);
        if (pre.getNext() == null) {
            exceptByPosition();
        }

        ListNode node = pre.getNext();
        pre.setNext(pre.getNext().getNext());

        return node;
    }

    public static boolean contains(ListNode head, ListNode nodeToCheck) {
        for (ListNode node = head; node != null; node = node.getNext()) {
            if (node == nodeToCheck) {
                return true;
            }
        }
        return false;
    }

    private static ListNode exceptByPosition() {
        throw new IllegalStateException("Invalid Position.");
    }

    private static ListNode updatePreNode(ListNode head, int position) {
        ListNode pre = head;
        for (int i = 0; i < position; i++) {
            pre = pre.getNext();
            if (pre == null) {
                exceptByPosition();
            }
        }
        return pre;
    }
}
