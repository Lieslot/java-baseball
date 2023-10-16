package baseball.service;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

import static baseball.enums.NumbersEnum.*;

public class NumbersService {

    public List<Integer> createIntegers() {
        List<Integer> integers = new ArrayList<>();
        while (integers.size() < COUNT.showValue()) {
            int randomNumber = Randoms.pickNumberInRange(MIN_RANGE.showValue(), MAX_RANGE.showValue());
            if (integers.contains(randomNumber)) {
                continue;
            }
            integers.add(randomNumber);
        }

        return integers;

    }

}
