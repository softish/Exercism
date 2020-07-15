import java.util.ArrayList;
import java.util.List;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        List<Double> powerDigits = new ArrayList<>();
        int numberOfDigitsInNumber = getNumberOfDigitsInNumber(numberToCheck);
        for (int i = 0; i < numberOfDigitsInNumber; i++) {
            double raisedDigit = Math.pow(getDigitAtPosition(numberToCheck, i), numberOfDigitsInNumber);
            powerDigits.add(raisedDigit);
        }

        return sumOfPowerDigits(powerDigits) == numberToCheck;
    }

    private int getDigitAtPosition(int numberToCheck, int i) {
        return Character.getNumericValue(String.valueOf(numberToCheck).charAt(i));
    }

    private int getNumberOfDigitsInNumber(int numberToCheck) {
        return String.valueOf(numberToCheck).length();
    }

    private int sumOfPowerDigits(List<Double> digitsToSum) {
        return (int) digitsToSum.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
    }
}
