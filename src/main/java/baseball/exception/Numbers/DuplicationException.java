package baseball.exception.Numbers;

public class DuplicationException extends IllegalArgumentException{

    public static final String ERROR_MESSAGE = String.format("입력된 숫자에 중복이 있으면 안됩니다.");

    public DuplicationException() {
        super(ERROR_MESSAGE);
    }
}
