public class RnaTranscription {

    /**
     * Returns the RNA complement of a DNA strand.
     *
     * @param dnaStrand the DNA strand
     * @return the RNA complement
     */
    public String transcribe(String dnaStrand) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < dnaStrand.length(); i++) {
            stringBuilder.append(mapDNAToRNA(dnaStrand.substring(i, i + 1).toUpperCase()));
        }

        return stringBuilder.toString();
    }

    /**
     * Returns the corresponding RNA nucleotide for a given DNA nucleotide.
     *
     * @param dnaStrand the DNA nucleotide
     * @return the RNA nucleotide
     */
    private String mapDNAToRNA(String dnaStrand) {
        switch (dnaStrand) {
            case "C":
                return "G";
            case "G":
                return "C";
            case "T":
                return "A";
            case "A":
                return "U";
            default:
                throw new IllegalArgumentException("Invalid input");
        }
    }
}