import java.util.List;
import java.util.stream.Collectors;

public class ArmstrongNumbers {

    public boolean isArmstrongNumber(int numberToCheck) {
        List<Integer> digits = extractDigitsFromNumber(numberToCheck);
        return digits.stream()
                .parallel()
                .map(digit -> Math.pow(digit, digits.size()))
                .mapToInt(Double::intValue)
                .sum() == numberToCheck;
    }

    private List<Integer> extractDigitsFromNumber(int number) {
        return String.valueOf(number)
                .chars()
                .mapToObj(i -> (char) i)
                .map(Character::getNumericValue)
                .collect(Collectors.toList());
    }

}