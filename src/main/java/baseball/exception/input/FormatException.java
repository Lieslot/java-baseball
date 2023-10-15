package baseball.exception.input;

public class FormatException extends IllegalArgumentException{

    public static final String ERROR_MESSAGE = "입력할 때 숫자만을 입력해주세요";

    public FormatException() {
        super(ERROR_MESSAGE);
    }

}
