package baseball.domain;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BallCount {

    Map<String, Integer> ballCount;

    public BallCount(PlayerNumbers playerNumbers, ComputerNumbers computerNumbers) {
        ballCount = new HashMap<>();
        ballCount.put("strike", countStrike(playerNumbers.showNumbers(), computerNumbers.showNumbers()));
        ballCount.put("ball", countBall(playerNumbers.showNumbers(), computerNumbers.showNumbers()));

    }

    private int countStrike(List<Number> playerNumbers, List<Number> computerNumbers) {

        int strike = 0;
        for (int index = 0; index < 3; index++) {
            Number playerNumber = playerNumbers.get(index);
            Number computerNumber = computerNumbers.get(index);
            if (computerNumber.equals(playerNumber)) {
                strike++;
            }
        }
        return strike;
    }

    private int countBall(List<Number> playerNumbers, List<Number> computerNumbers){
        int ball = 0;
        for (int index = 0; index < 3; index++) {
            Number playerNumber = playerNumbers.get(index);
            Number computerNumber = computerNumbers.get(index);

            if (!computerNumber.equals(playerNumber) && computerNumbers.contains(playerNumber)) {
                ball++;
            }
        }
        return ball;
    }

    public Map<String, Integer> showBallCount() {
        return Collections.unmodifiableMap(ballCount);
    }
    public int showStrike() {
        return ballCount.get("strike");
    }

}