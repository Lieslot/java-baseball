package baseball.exception.input;

public class RetryFormatException extends IllegalArgumentException{

        public static final String ERROR_MESSAGE = "재시작할 때 입력하는 숫자는 1 혹은 2여야 합니다.";

        public RetryFormatException() {
            super(ERROR_MESSAGE);
        }

}


