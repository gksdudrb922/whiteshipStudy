package week11;

import java.util.EnumSet;

public class EnumSetTest {

    enum Direction { EAST, SOUTH, WEST, NORTH }

    public static void main(String[] args) {
        EnumSet<Direction> set = EnumSet.complementOf(EnumSet.of(Direction.EAST, Direction.WEST));
        set.forEach(System.out::println);
    }
}
