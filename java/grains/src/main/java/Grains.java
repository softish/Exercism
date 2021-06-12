import java.math.BigInteger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class Grains {

    private static final int FIRST_SQUARE = 1;
    public static final int LAST_SQUARE = 64;

    private final SquareCalculator squareCalculator;
    private final BoardCalculator boardCalculator;

    public Grains() {
        squareCalculator = new SquareCalculator();
        boardCalculator = new BoardCalculator();
    }

    BigInteger grainsOnSquare(final int square) {
        if (square < FIRST_SQUARE || LAST_SQUARE < square) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        return squareCalculator.calculateGrains(square);
    }

    BigInteger grainsOnBoard() {
        return boardCalculator.calculateGrains();
    }
}

abstract class CachedGrainCalculator {

    private static final int TOTAL_KEY = 0;

    private final Map<Integer, BigInteger> grainsCalculationsCache = new ConcurrentHashMap<>();

    public BigInteger calculateGrains(int square) {
        return grainsCalculationsCache.computeIfAbsent(square, ignore -> calculateNumberOfGrains(square));
    }

    public BigInteger calculateGrains() {
        return calculateGrains(TOTAL_KEY);
    }

    abstract BigInteger calculateNumberOfGrains(int square);
}

class SquareCalculator extends CachedGrainCalculator {
    @Override
    BigInteger calculateNumberOfGrains(int square) {
        return BigInteger.TWO.pow(square - 1);
    }
}

class BoardCalculator extends CachedGrainCalculator {
    @Override
    BigInteger calculateNumberOfGrains(int square) {
        return BigInteger.TWO
                .pow(Grains.LAST_SQUARE)
                .subtract(BigInteger.ONE);
    }
}
