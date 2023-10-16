package baseball.domain;

import java.util.*;
import java.util.stream.Collectors;

import baseball.exception.Numbers.DuplicationException;

public class ComputerNumbers extends DuplicationException {

    private final List<Number> numbers;

    public ComputerNumbers(List<Integer> integers) {


        numbers = integers.stream()
                .map(Number::new)
                .collect(Collectors.toList());

    }

    public int showNumberAt(int index) {
        Number number = numbers.get(index);
        return number.showValue();
    }

    @Override
    public String toString() {

        List<Integer> integers = numbers.stream()
                .map(Number::showValue)
                .collect(Collectors.toList());

        return integers.toString();
    }

    public boolean contains(int numberInt) {
        Number number = new Number(numberInt);
        return numbers.contains(number);
    }
}
