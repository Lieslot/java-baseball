package baseball.domain;

import baseball.exception.Number.RangeException;

import static baseball.NumbersEnum.*;

public class Number {

    private final int number;

    public Number(int number) {

        checkRange(number);

        this.number = number;

    }

    private void checkRange(int number) {
        if (number < MIN_RANGE.showValue() || number > MAX_RANGE.showValue()) {
            throw new RangeException();
        }

    }

    public int showValue() {
        return number;
    }
    @Override
    public boolean equals(Object object) {
        Number otherNumber = (Number) object;
        return this.showValue() == otherNumber.showValue();
    }

}
