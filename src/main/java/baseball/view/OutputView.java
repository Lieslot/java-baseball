package baseball.view;

import java.util.Map;

import static baseball.enums.NumbersEnum.*;

public class OutputView {


    public static void printBallCount(Map<String, Integer> ballCount) {
        int strike = ballCount.get("strike");
        int ball = ballCount.get("ball");

        if (ball == 0 && strike == 0) {
            System.out.println("낫싱");
        }

        if (ball != 0 && strike != 0) {
            System.out.printf("%d볼 %d스트라이크\n", ball, strike);
            return;
        }

        if (ball != 0) {
            System.out.printf("%d볼\n", ball);
        }

        if (strike != 0) {

            System.out.printf("%d스트라이크\n", strike);
        }

    }

    public static void printEndMessage() {
        System.out.printf("%d개의 숫자를 모두 맞히셨습니다! 게임 종료\n", COUNT.showValue());
    }

}
