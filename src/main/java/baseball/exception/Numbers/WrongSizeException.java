package baseball.exception.Numbers;

public class WrongSizeException extends IllegalArgumentException{
    public static final String ERROR_MESSAGE = "입력한 숫자는 세 자리여야 합니다.";

    public WrongSizeException() {
        super(ERROR_MESSAGE);
    }
}
