package baseball.domain;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import baseball.NumbersEnum;
import camp.nextstep.edu.missionutils.Randoms;


import static baseball.NumbersEnum.*;

public class ComputerNumbers {

    private final List<Number> numbers;

    public ComputerNumbers(List<Integer> integers) {


        numbers = integers.stream()
                .map(Number::new)
                .collect(Collectors.toList());

    }

    public List<Number> showNumbers() {
        return Collections.unmodifiableList(numbers);
    }

    @Override
    public String toString() {

        List<Integer> integers = numbers.stream()
                .map(Number::showValue)
                .collect(Collectors.toList());

        return integers.toString();
    }
}
