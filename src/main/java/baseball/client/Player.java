package baseball.client;

import baseball.controller.Computer;
import baseball.domain.BallCount;
import baseball.domain.ComputerNumbers;
import baseball.domain.PlayerNumbers;
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

}
