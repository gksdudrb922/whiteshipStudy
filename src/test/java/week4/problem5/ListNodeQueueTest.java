package week4.problem5;

import org.junit.jupiter.api.Test;
import week4.problem4.ListNodeStack;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeQueueTest {

    @Test
    public void listNodeQueueTest() {
        //given
        ListNodeQueue listNodeQueue = new ListNodeQueue();

        //when
        listNodeQueue.offer(1);
        listNodeQueue.offer(2);
        listNodeQueue.offer(3);
        int data = listNodeQueue.poll();

        //then
        assertAll(
                () -> assertEquals(2, listNodeQueue.getHead().getNext().getData()),
                () -> assertEquals(3, listNodeQueue.getHead().getNext().getNext().getData()),
                () -> assertEquals(1, data)
        );
    }

    @Test
    public void listNodeQueueEmpty() {
        //given
        ListNodeQueue listNodeQueue = new ListNodeQueue();

        //when
        listNodeQueue.offer(1);
        listNodeQueue.poll();

        //then
        assertThrows(IllegalStateException.class,
                () -> listNodeQueue.poll());
    }
}