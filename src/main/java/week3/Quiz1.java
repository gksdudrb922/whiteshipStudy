package week3;

public class Quiz1 {

    // numbers라는 int형 배열이 있다.
    // 해당 배열에 들어있는 숫자들은 오직 한 숫자를 제외하고 모두 두 번씩 들어있다.
    // 오직 한 번만 등장하는 숫자를 찾는 코드를 작성하라.
    public static void main(String[] args) {
        Quiz1 problem = new Quiz1();
        int result = problem.solution(new int[]{5, 2, 4, 1, 2, 4, 5});
        System.out.println("result = " + result);
    }

    private int solution(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result ^= number;
        }
        return result;
    }
}
