package baseball;

import baseball.client.Player;
import baseball.domain.BallCount;
import baseball.domain.Number;
import baseball.view.InputView;
import baseball.view.OutputView;

import static baseball.NumbersEnum.COUNT;

public class Application {
    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다.");

        while (true) {
            Player player = new Player();
            start(player);
            if (!isRetry()) {
                break;
            }
        }


    }
    private static void start(Player player) {

        while (true) {


            player.selectNumbers();
            BallCount ballCount = player.getBallCount();
            if (isEnd(ballCount.showStrike())) {
                OutputView.printEndMessage();
                return;
            }
        }
    }

    private static boolean isRetry() {
        String input = InputView.inputRetry();
        if (input.equals("1")) {
            return true;
        }

        return false;
    }
    private static boolean isEnd(int strike) {
        return strike == COUNT.showValue();
    }
}
