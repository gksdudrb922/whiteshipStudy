package week9;

public class TryCatch {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0); //예외발생!!!
            System.out.println(4);
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println("예외메시지 : " + ae.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(5);
    }
}
