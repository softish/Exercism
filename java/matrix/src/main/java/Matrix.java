import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Matrix {

    private final List<List<Integer>> matrixRepresentation;

    /**
     * Constructs a matrix from the provided string.
     *
     * @param matrixAsString a matrix where rows are separated by the newline character and columns are separated by a space
     */
    Matrix(String matrixAsString) {
        matrixRepresentation = parseMatrixString(matrixAsString);
    }

    private List<List<Integer>> parseMatrixString(String inputMatrix) {
        String[] rows = inputMatrix.split("\n");
        return Arrays.stream(rows)
                .map(row -> row.split(" "))
                .map(Arrays::stream)
                .map(numberToParse -> numberToParse.map(Integer::parseInt)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
    }

    /**
     * Returns a row of the matrix.
     *
     * @param rowNumber the row number that is requested, one based
     * @return the row of the matrix
     */
    int[] getRow(int rowNumber) {
        int rowOfRepresentation = convertIndexToZeroBased(rowNumber);
        return extractRowFromMatrix(rowOfRepresentation, matrixRepresentation);
    }

    /**
     * Returns the a column of the matrix.
     *
     * @param columnNumber the column number that is requested, one based
     * @return the requested column of the matrix
     */
    int[] getColumn(int columnNumber) {
        int rowOfTransposedRepresentation = convertIndexToZeroBased(columnNumber);
        return extractRowFromMatrix(rowOfTransposedRepresentation, transposeMatrixRepresentation());
    }

    private int[] extractRowFromMatrix(int rowNumber, List<List<Integer>> lists) {
        return lists.get(rowNumber)
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private int convertIndexToZeroBased(int index) {
        return index - 1;
    }

    private List<List<Integer>> transposeMatrixRepresentation() {
        List<List<Integer>> transposedMatrix = initializeEmptyTransposedMatrix();
        for (int rowIndex = 0; rowIndex < matrixRepresentation.size(); rowIndex++) {
            List<Integer> row = matrixRepresentation.get(rowIndex);
            for (int columnIndex = 0; columnIndex < row.size(); columnIndex++) {
                transposedMatrix.get(columnIndex).add(rowIndex, row.get(columnIndex));
            }
        }
        return transposedMatrix;
    }

    private List<List<Integer>> initializeEmptyTransposedMatrix() {
        List<List<Integer>> transposedMatrix = new ArrayList<>();
        matrixRepresentation.stream()
                .findFirst()
                .ifPresent(row -> row.forEach(column -> transposedMatrix.add(new ArrayList<>())));

        return transposedMatrix;
    }
}