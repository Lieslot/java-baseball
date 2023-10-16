package baseball.view;
import baseball.exception.input.FormatException;
import baseball.utils.Utils;
import camp.nextstep.edu.missionutils.Console;

public class InputView {


    public static String inputNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();

        Utils.checkNumeric(input);
        return input;
    }
    public static String inputRetry() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return Console.readLine();
    }



}
