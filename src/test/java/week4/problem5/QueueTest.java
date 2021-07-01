package week4.problem5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    public void queueTest() {
        //given
        Queue queue = new Queue();

        //when
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        int popData = queue.poll();

        //then
        int front = queue.getFront();
        int rear = queue.getRear();
        assertAll(
                () -> assertEquals(2, queue.getQueue()[front + 1]),
                () -> assertEquals(3, queue.getQueue()[rear]),
                () -> assertEquals(1, popData)
        );
    }

    @Test
    public void queueFull() {
        //given
        Queue queue = new Queue();

        //when
        for (int i = 0; i < 100; i++) {
            queue.offer(i);
        }

        //then
        assertThrows(IllegalStateException.class,
                () -> queue.offer(100));
    }

    @Test
    public void queueEmpty() {
        //given
        Queue queue = new Queue();

        //when
        queue.offer(1);
        queue.poll();

        //then
        assertThrows(IllegalStateException.class,
                () -> queue.poll());
    }
}