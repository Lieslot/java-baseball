package baseball.domain;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BallCount {

    Map<String, Integer> ballCount;

    public BallCount(PlayerNumbers playerNumbers, ComputerNumbers computerNumbers) {
        ballCount = new HashMap<>();
        ballCount.put("strike", countStrike(playerNumbers, computerNumbers));
        ballCount.put("ball", countBall(playerNumbers, computerNumbers));

    }

    private int countStrike(PlayerNumbers playerNumbers, ComputerNumbers computerNumbers) {

        int strike = 0;
        for (int index = 0; index < 3; index++) {
            int playerNumber = playerNumbers.showNumberAt(index);
            int computerNumber = computerNumbers.showNumberAt(index);

            if (playerNumber == computerNumber) {
                strike++;
            }
        }
        return strike;
    }

    private int countBall(PlayerNumbers playerNumbers, ComputerNumbers computerNumbers){
        int ball = 0;
        for (int index = 0; index < 3; index++) {
            int playerNumber = playerNumbers.showNumberAt(index);
            int computerNumber = computerNumbers.showNumberAt(index);

            if (playerNumber != computerNumber && computerNumbers.contains(playerNumber)) {
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