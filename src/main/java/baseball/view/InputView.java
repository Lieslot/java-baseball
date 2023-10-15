package baseball.view;
import baseball.exception.input.FormatException;
import camp.nextstep.edu.missionutils.Console;

public class InputView {


    public static String inputNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();

        checkNumeric(input);
        return input;
    }
    public static String inputRetry() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return Console.readLine();
    }

    private static void checkNumeric(String input) {
        boolean isNumeric = input.chars().allMatch(Character::isDigit);
        if (!isNumeric) {{
            throw new FormatException();
        }}
    }

}
