package week9;

public class MyException extends Exception {
    //에러 코드 값을 저장하기 위한 필드를 추가했다.
    private final int ERROR_CODE; //생성자를 통해 초기화 한다.

    MyException(String message, int errorCode) {
        super(message);
        ERROR_CODE = errorCode;
    }

    MyException(String message) {
        this(message, 400); //ERROR_CODE를 400(기본값)으로 초기화한다.
    }

    public MyException(String message, Throwable cause, int errorCode) {
        super(message, cause);
        ERROR_CODE = errorCode;
    }

    public int getErrorCode() {
        return ERROR_CODE;
    }
}
