package baseball.client;

import baseball.controller.Computer;
import baseball.domain.BallCount;
import baseball.domain.ComputerNumbers;
import baseball.domain.PlayerNumbers;
import baseball.exception.input.RetryFormatException;
import baseball.utils.Utils;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Player {

    private Computer computer;
    private PlayerNumbers playerNumbers;
    public Player() {
        computer = new Computer();
    }

    public void selectNumbers() {
        String numbers = InputView.inputNumbers();

        playerNumbers = new PlayerNumbers(Utils.strToIntegerList(numbers));

    }

    public BallCount getBallCount() {
        BallCount ballCount = computer.calculateBallCount(playerNumbers);
        OutputView.printBallCount(ballCount.showBallCount());

        return ballCount;

    }

    public boolean retry() {

        String input = InputView.inputRetry();
        if (input.equals("1")) {
            return true;
        }
        if (input.equals("2")) {
            return false;
        }
        throw new RetryFormatException();
    }

}
