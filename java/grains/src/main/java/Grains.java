import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class Grains {

    private static final int FIRST_SQUARE = 1;
    private static final int LAST_SQUARE = 64;
    public static final int TOTAL = 0;

    private Map<Integer, BigInteger> gransPerSquareCache = new HashMap<>();

    public Grains() {
    }

    Grains(Map<Integer, BigInteger> gransPerSquareCache) {
        this.gransPerSquareCache = gransPerSquareCache;
    }

    BigInteger grainsOnSquare(final int square) {
        if (square < FIRST_SQUARE || LAST_SQUARE < square) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        return getCachedValueIfExists(square).orElseGet(() -> calculateSquare(square));
    }

    BigInteger grainsOnBoard() {
        return getCachedValueIfExists(TOTAL).orElseGet(this::calculateTotal);
    }

    Optional<BigInteger> getCachedValueIfExists(int position) {
        if (gransPerSquareCache.containsKey(position)) {
            return Optional.of(gransPerSquareCache.get(position));
        }
        return Optional.empty();
    }

    private BigInteger calculateSquare(int square) {
        var numberOfGrains = BigInteger.TWO.pow(square - 1);
        gransPerSquareCache.put(square, numberOfGrains);
        return numberOfGrains;
    }

    BigInteger calculateTotal() {
        var totalSum = BigInteger.TWO
                .pow(LAST_SQUARE)
                .subtract(BigInteger.ONE);

        gransPerSquareCache.put(TOTAL, totalSum);
        return totalSum;
    }
}
