import java.math.BigInteger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class Grains {

    private static final int FIRST_SQUARE = 1;
    private static final int LAST_SQUARE = 64;
    private static final int TOTAL_KEY = 0;

    private final Map<Integer, BigInteger> grainsCalculationsCache = new ConcurrentHashMap<>();

    BigInteger grainsOnSquare(final int square) {
        if (square < FIRST_SQUARE || LAST_SQUARE < square) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        return grainsCalculationsCache.computeIfAbsent(square, key -> BigInteger.TWO.pow(key - 1));
    }

    BigInteger grainsOnBoard() {
        return grainsCalculationsCache.computeIfAbsent(TOTAL_KEY, ignore -> BigInteger.TWO
                .pow(LAST_SQUARE)
                .subtract(BigInteger.ONE));
    }
}
