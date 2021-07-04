package week4;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StatefulTest {

    private int number;

    @Test @Order(2)
    void test1() {
        System.out.println(number++);
    }

    @Test @Order(1)
    void test2() {
        System.out.println(number++);
    }
}
