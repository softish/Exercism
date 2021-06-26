import java.util.stream.IntStream;

class NaturalNumber {

    private final int number;

    public NaturalNumber(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }

        this.number = number;
    }

    public Classification getClassification() {
        int aliquotSum = calculateAliquotSum();

        if (number == aliquotSum) {
            return Classification.PERFECT;
        } else if (number < aliquotSum) {
            return Classification.ABUNDANT;
        }

        return Classification.DEFICIENT;
    }

    private int calculateAliquotSum() {
        // factors greater than half the number will always be decimal
        // so we can omit them to reduce amount of calculations
        return IntStream.rangeClosed(1, number / 2)
                .parallel()
                .filter(num -> number % num == 0)
                .sum();
    }
}
