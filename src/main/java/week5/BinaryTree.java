package week5;

import java.util.*;

public class BinaryTree {

    public static List<Integer> bfs(Node node) {

        if (node == null) {
            return null;
        }

        List<Integer> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node popNode = queue.remove();
            result.add(popNode.getValue());

            if (popNode.getLeft() != null) {
                queue.add(popNode.getLeft());
            }
            if (popNode.getRight() != null) {
                    queue.add(popNode.getRight());
            }
        }

        return result;
    }

    public static List<Integer> dfs(Node node) {

        if (node == null) {
            return null;
        }

        List<Integer> result = new ArrayList<>();
        Node cur = node;
        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            while (cur.getLeft() != null) {
                cur = cur.getLeft();
                stack.push(cur);
            }

            cur = stack.pop();
            result.add(cur.getValue());

            if (cur.getRight() != null) {
                cur = cur.getRight();
                stack.push(cur);
            }
        }

        return result;
    }
}
