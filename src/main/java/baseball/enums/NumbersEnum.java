package baseball.enums;

public enum NumbersEnum {

    MIN_RANGE(1),
    MAX_RANGE(9),
    COUNT(3);

    private final int value;

    NumbersEnum(int value) {
        this.value = value;
    }

    public int showValue() {
        return value;
    }
}
