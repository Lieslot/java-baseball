package baseball.exception.Number;

import static baseball.enums.NumbersEnum.*;

public class RangeException extends IllegalArgumentException{

    public static final String ERROR_MESSAGE = String.format("각 자리의 숫자의 범위는 %d에서 %d 사이여야 합니다.", MIN_RANGE.showValue(), MAX_RANGE.showValue());

    public RangeException() {
        super(ERROR_MESSAGE);
    }
}
