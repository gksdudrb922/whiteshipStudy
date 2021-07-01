package week4.problem4;

import org.junit.jupiter.api.Test;
import week4.problem3.Stack;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeStackTest {

    @Test
    public void listNodeStackTest() {
        //given
        ListNodeStack listNodeStack = new ListNodeStack();

        //when
        listNodeStack.push(1);
        listNodeStack.push(2);
        listNodeStack.push(3);
        int data = listNodeStack.pop();

        //then
        assertAll(
                () -> assertEquals(2, listNodeStack.getHead().getNext().getData()),
                () -> assertEquals(1, listNodeStack.getHead().getNext().getNext().getData()),
                () -> assertEquals(3, data)
        );
    }

    @Test
    public void listNodeStackEmpty() {
        //given
        ListNodeStack listNodeStack = new ListNodeStack();

        //when
        listNodeStack.push(1);
        listNodeStack.pop();

        //then
        assertThrows(IllegalStateException.class,
                () -> listNodeStack.pop());
    }
}