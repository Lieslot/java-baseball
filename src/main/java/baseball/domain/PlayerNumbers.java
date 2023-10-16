package baseball.domain;

import baseball.exception.Numbers.DuplicationException;
import baseball.exception.Numbers.WrongSizeException;

import java.util.List;
import java.util.stream.Collectors;

import static baseball.enums.NumbersEnum.*;

public class PlayerNumbers {

    private final List<Number> numbers;

    public PlayerNumbers(List<Integer> numberList) {

        checkDuplication(numberList);
        checkSize(numberList);
        this.numbers = numberList.stream()
                .map(Number::new)
                .collect(Collectors.toList());

    }

    private void checkSize(List<Integer> numberList) {

        if (numberList.size() != COUNT.showValue()) {
            throw new WrongSizeException();
        }

    }
    private void checkDuplication(List<Integer> numberList) {
        List<Integer> checkList = numberList.stream().distinct().collect(Collectors.toList());

        if (checkList.size() != numberList.size()) {
            throw new DuplicationException();
        }

    }

    public int showNumberAt(int index) {
        Number number = numbers.get(index);
        return number.showValue();
    }

}
