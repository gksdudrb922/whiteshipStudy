package week5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class BinaryTreeTest {

    Node node;

    @BeforeEach
    public void createBinaryTree() {

        Node leftNode = new Node(2, new Node(4), new Node(5));
        Node rightNode = new Node(3, new Node(6), new Node(7));
        node = new Node(1, leftNode, rightNode);
        /*

            1
           2 3
         4 5 6 7

         */
    }

    @Test
    void bfs() {
        List<Integer> result = BinaryTree.bfs(node);
        assertThat(result).isEqualTo(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
    }

    @Test
    void dfs() {
        List<Integer> result = BinaryTree.dfs(node);
        assertThat(result).isEqualTo(Arrays.asList(4, 2, 5, 1, 6, 3, 7));
    }
}