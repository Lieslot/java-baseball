package baseball.utils;

import baseball.domain.Number;
import baseball.exception.input.FormatException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {


    public static List<Integer> strToIntegerList(String numberString) {

        return numberString.chars()
                .mapToObj(e -> (char)e)
                .map(Utils::charToInt)
                .collect(Collectors.toList());

    }

    public static int charToInt(char numberChar) {

        return numberChar-'0';

    }


    public static void checkNumeric(String input) {
        boolean isNumeric = input.chars().allMatch(Character::isDigit);
        if (!isNumeric) {{
            throw new FormatException();
        }}
    }

}
