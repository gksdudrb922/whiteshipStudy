package week4.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    public void addTest() {
        //given
        ListNode head = new ListNode();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        //when
        LinkedList.add(head, listNode1, 0);
        LinkedList.add(head, listNode2, 0);
        LinkedList.add(head, listNode3, 1);

        //then
        assertAll(
                () -> assertEquals(listNode2, head.getNext()),
                () -> assertEquals(listNode3, head.getNext().getNext()),
                () -> assertEquals(listNode1, head.getNext().getNext().getNext()),
                () -> assertThrows(IllegalStateException.class,
                        () -> LinkedList.add(head, new ListNode(4), 4))
        );
    }

    @Test
    public void removeTest() {
        //given
        ListNode head = new ListNode();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        LinkedList.add(head, listNode1, 0);
        LinkedList.add(head, listNode2, 1);
        LinkedList.add(head, listNode3, 2);

        //when
        ListNode removedNode = LinkedList.remove(head, 1);

        //then
        assertAll(
                () -> assertEquals(listNode1, head.getNext()),
                () -> assertEquals(listNode3, head.getNext().getNext()),
                () -> assertEquals(listNode2, removedNode),
                () -> assertThrows(IllegalStateException.class,
                        () -> LinkedList.remove(head, 2))
        );
    }

    @Test
    public void containsTest() {
        //given
        ListNode head = new ListNode();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        LinkedList.add(head, listNode1, 0);
        LinkedList.add(head, listNode2, 1);
        LinkedList.add(head, listNode3, 2);

        //when
        boolean result1 = LinkedList.contains(head, listNode2);
        boolean result2 = LinkedList.contains(head, new ListNode(4));

        //then
        assertTrue(result1);
        assertFalse(result2);
    }
}