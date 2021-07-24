import java.util.*;
import java.util.regex.Pattern;

class ProteinTranslator {

    private final Set<String> rnaStopSequences = Set.of("UAA", "UAG", "UGA");
    private final HashMap<String, String> codonProteinMap = new HashMap<>();

    // complete set of
    // protines inspired by jbberinger's solution
    public ProteinTranslator() {
        multiPut("Methionine", "AUG");
        multiPut("Phenylalanine", "UUU", "UUC");
        multiPut("Leucine", "UUA", "UUG", "CUU", "CUC", "CUA", "CUG");
        multiPut("Valine", "GUU", "GUC", "GUA", "GUG");
        multiPut("Serine", "UCU", "UCC", "UCA", "UCG", "AGU", "AGC");
        multiPut("Proline", "CCU", "CCC", "CCA", "CCG");
        multiPut("Threonine", "ACU", "ACC", "ACA", "ACG");
        multiPut("Histidine", "CAU", "CAC");
        multiPut("Glutamine", "CAA", "CAG");
        multiPut("Asparagine", "AAU", "AAC");
        multiPut("Lysine", "AAA", "AAG");
        multiPut("Aspartic Acid", "GAU", "GAC");
        multiPut("Glutamic Acid", "GAA", "GAG");
        multiPut("Tyrosine", "UAU", "UAC");
        multiPut("Cysteine", "UGU", "UGC");
        multiPut("Tryptophan", "UGG");
        multiPut("Arginine", "CGU", "CGC", "CGA", "CGG", "AGA", "AGG");
        multiPut("Glycine", "GGU", "GGC", "GGA", "GGG");
        multiPut("Isoleucine", "AUU", "AUC", "AUA");
    }

    // from trevans1's solution
    String multiPut(String value, String... keys) {
        for (String key : keys) {
            codonProteinMap.put(key, value);
        }

        return value;
    }

    List<String> translate(String rnaSequence) {
        var pattern = Pattern.compile("([A-Z]){3}");
        var matcher = pattern.matcher(rnaSequence);
        var proteins = new ArrayList<String>();

        while (matcher.find()) {
            String codon = matcher.group();
            if (rnaStopSequences.contains(codon)) {
                break;
            }
            proteins.add(codonProteinMap.get(codon));
        }

        return proteins;
    }
}
