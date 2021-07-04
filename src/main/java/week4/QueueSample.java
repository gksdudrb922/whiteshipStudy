package week4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        //실패할 때, null(false)를 리턴하나, 예외를 발생시키나
        boolean offer = queue.offer(1);
        boolean add = queue.add(1);

        Integer poll = queue.poll();
        Integer remove = queue.remove();

        Integer element = queue.element();
        Integer peek = queue.peek();
    }
}
