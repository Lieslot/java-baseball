package baseball.controller;

import baseball.domain.BallCount;
import baseball.domain.ComputerNumbers;
import baseball.domain.Number;
import baseball.domain.PlayerNumbers;
import baseball.service.NumbersService;
import baseball.view.OutputView;

import java.util.List;
import java.util.Map;

public class Computer {

    private final ComputerNumbers computerNumbers;
    private final NumbersService numbersService;

    public Computer() {
        numbersService = new NumbersService();
        computerNumbers = new ComputerNumbers(getIntegers());


    }

    private List<Integer> getIntegers() {
        return numbersService.createIntegers();
    }

    public BallCount calculateBallCount (PlayerNumbers playerNumbers) {
        BallCount ballCount = new BallCount(playerNumbers, computerNumbers);

        return ballCount;

    }

}
