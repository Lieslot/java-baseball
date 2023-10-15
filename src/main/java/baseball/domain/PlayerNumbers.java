package baseball.domain;

import baseball.NumbersEnum;
import baseball.exception.Numbers.DuplicationException;
import baseball.exception.Numbers.WrongSizeException;
import net.bytebuddy.implementation.bytecode.Duplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static baseball.NumbersEnum.*;

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

    public List<Number> showNumbers() {
        return Collections.unmodifiableList(numbers);
    }

}
