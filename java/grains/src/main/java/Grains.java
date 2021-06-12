import java.math.BigInteger;

class Grains {

    private static final int FIRST_SQUARE = 1;
    private static final int LAST_SQUARE = 64;

    BigInteger grainsOnSquare(final int square) {
        if (square < FIRST_SQUARE || LAST_SQUARE < square) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        BigInteger sum = BigInteger.ONE;
        for (var i = 2; i <= square; i++) {
            sum = sum.multiply(BigInteger.TWO);
        }
        return sum;
    }

    BigInteger grainsOnBoard() {
        var sum = BigInteger.ZERO;

        for (var i = 1; i <= LAST_SQUARE; i++) {
            sum = sum.add(grainsOnSquare(i));
        }

        return sum;
    }
}
