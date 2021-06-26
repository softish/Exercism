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
        if (number == calculateAliquotSum()) {
            return Classification.PERFECT;
        } else if (number < calculateAliquotSum()) {
            return Classification.ABUNDANT;
        }

        return Classification.DEFICIENT;
    }

    private int calculateAliquotSum() {
        return IntStream.range(1, number)
                .filter(num -> number % num == 0)
                .sum();
    }
}
