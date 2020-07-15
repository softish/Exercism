public class Hamming {

    private String leftStrand;
    private String rightStrand;

    /**
     * Constructs and instance of this class.
     * Note that the supplied strands have to be equal in length.
     *
     * @param leftStrand  the left strand
     * @param rightStrand the right strand
     */
    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    /**
     * Calculates the hamming distance for the two strands that were provided to the instance of this class.
     *
     * @return the calculated hamming distance
     */
    int getHammingDistance() {
        int distance = 0;

        for (int i = 0; i < leftStrand.length(); i++) {
            String leftSubstring = leftStrand.substring(i, i + 1).toUpperCase();
            String rightSubstring = rightStrand.substring(i, i + 1).toUpperCase();

            if (!leftSubstring.equals(rightSubstring)) {
                distance++;
            }
        }

        return distance;
    }
}