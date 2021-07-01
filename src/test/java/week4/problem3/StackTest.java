package week4.problem3;

import org.junit.jupiter.api.Test;
import week4.problem2.LinkedList;
import week4.problem2.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    public void stackTest() {
        //given
        Stack stack = new Stack();

        //when
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int popData = stack.pop();

        //then
        int top = stack.getTop();
        assertAll(
                () -> assertEquals(2, stack.getStack()[top]),
                () -> assertEquals(3, popData)
        );
    }

    @Test
    public void stackFull() {
        //given
        Stack stack = new Stack();

        //when
        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }

        //then
        assertThrows(IllegalStateException.class,
                () -> stack.push(100));
    }

    @Test
    public void stackEmpty() {
        //given
        Stack stack = new Stack();

        //when
        stack.push(1);
        stack.pop();

        //then
        assertThrows(IllegalStateException.class,
                () -> stack.pop());
    }
}