package week11;

public class Unit {

    enum Direction {
        EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");

        private final int value;
        private final String symbol;

        Direction(int value, String symbol) { //생성자를 추가
            this.value = value;
            this.symbol = symbol;
        }

        public int getValue() {
            return value;
        }

        public String getSymbol() {
            return symbol;
        }
    }

    int x, y; //유닛의 위치
    Direction dir; //열거형을 인스턴스 변수로 선언

    void init() {
        dir = Direction.EAST; //유닛의 방향을 EAST로 초기화
    }

    void move() {
        switch (dir) {
            case EAST: //Direction.EAST라고 쓰면 안된다.
                x++;
                break;
            case WEST:
                x--;
                break;
        }
    }

    public void print() {
        Direction[] dArr = Direction.values();

        for (Direction d : dArr) {
            System.out.println(d.getValue());
        }
    }

    public void printWest() {
        Direction d = Direction.valueOf("WEST");

        System.out.println(d);
        System.out.println(Direction.WEST == Direction.valueOf("WEST"));
    }

    public static void main(String[] args) {
        Unit unit = new Unit();
        unit.print();
//        unit.printWest();
    }
}
