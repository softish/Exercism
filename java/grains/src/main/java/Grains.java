import java.math.BigInteger;
import java.util.stream.IntStream;

class Grains {

    private static final int FIRST_SQUARE = 1;
    private static final int LAST_SQUARE = 64;

    BigInteger grainsOnSquare(final int square) {
        if (square < FIRST_SQUARE || LAST_SQUARE < square) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        return BigInteger.TWO.pow(square - 1);
    }

    BigInteger grainsOnBoard() {
        return IntStream.range(FIRST_SQUARE, LAST_SQUARE + 1)
                .mapToObj(this::grainsOnSquare)
                .reduce(BigInteger::add)
                .orElseThrow();
    }
}
