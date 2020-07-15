/**
 * This class contains the logic for calculating the difference of squares.
 */
public class DifferenceOfSquaresCalculator {

    /**
     * Computes the square of the sum.
     *
     * @param number the target for the computation
     * @return the square of the sum
     */
    int computeSquareOfSumTo(int number) {
        return computeSquareOfSumTo(number, 1, 1);
    }

    private int computeSquareOfSumTo(int number, int sum, int i) {
        return i == number ? sum * sum : computeSquareOfSumTo(number, sum + ++i, i);
    }

    /**
     * Computes the sum of the squares.
     *
     * @param number the target for the computation
     * @return the sum of squares
     */
    int computeSumOfSquaresTo(int number) {
        return computeSumOfSquaresTo(number, 0, 0);
    }

    private int computeSumOfSquaresTo(int number, int sum, int i) {
        return i == number ? sum : computeSumOfSquaresTo(number, sum + ++i * i, i);
    }

    /**
     * Computes the difference between the square of the sum
     * and the sum of the squares.
     *
     * @param number the target for the computation
     * @return the difference of squares
     */
    int computeDifferenceOfSquares(int number) {
        return computeSquareOfSumTo(number) - computeSumOfSquaresTo(number);
    }
}