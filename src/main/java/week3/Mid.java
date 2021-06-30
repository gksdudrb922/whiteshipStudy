package week3;

public class Mid {

    public static void main(String[] args) {
        int start = 2_100_000_000;
        int end = 2_100_000_002;
        //        int mid = (start + end) / 2;
        //        int mid = start + (end - start) / 2;
        int mid = (start + end) >>> 1;
        System.out.println("mid = " + mid);
    }
}
