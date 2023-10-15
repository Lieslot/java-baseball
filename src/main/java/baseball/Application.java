package baseball;

import baseball.client.Player;
import baseball.domain.BallCount;
import baseball.domain.Number;
import baseball.exception.input.RetryFormatException;
import baseball.view.InputView;
import baseball.view.OutputView;

import static baseball.NumbersEnum.COUNT;

public class Application {
    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다.");

        while (true) {
            Player player = new Player();
            gameStart(player);
            if (!player.retry()) {
                break;
            }
        }


    }
    private static void gameStart(Player player) {

        while (true) {

            player.selectNumbers();
            BallCount ballCount = player.getBallCount();
            if (isEnd(ballCount.showStrike())) {
                OutputView.printEndMessage();
                return;
            }
        }
    }


    private static boolean isEnd(int strike) {
        return strike == COUNT.showValue();
    }
}
