import java.util.*;
import java.util.regex.Pattern;

class ProteinTranslator {

    public static final String METHIONINE = "Methionine";
    public static final String PHENYLALANINE = "Phenylalanine";
    public static final String LEUCINE = "Leucine";
    public static final String SERINE = "Serine";
    public static final String TYROSINE = "Tyrosine";
    public static final String CYSTEINE = "Cysteine";
    public static final String TRYPTOPHAN = "Tryptophan";

    Map<String, String> rnaProteinMap = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("AUG", METHIONINE),
            new AbstractMap.SimpleEntry<>("UUU", PHENYLALANINE),
            new AbstractMap.SimpleEntry<>("UUC", PHENYLALANINE),
            new AbstractMap.SimpleEntry<>("UUA", LEUCINE),
            new AbstractMap.SimpleEntry<>("UUG", LEUCINE),
            new AbstractMap.SimpleEntry<>("UCU", SERINE),
            new AbstractMap.SimpleEntry<>("UCC", SERINE),
            new AbstractMap.SimpleEntry<>("UCA", SERINE),
            new AbstractMap.SimpleEntry<>("UCG", SERINE),
            new AbstractMap.SimpleEntry<>("UAU", TYROSINE),
            new AbstractMap.SimpleEntry<>("UAC", TYROSINE),
            new AbstractMap.SimpleEntry<>("UGU", CYSTEINE),
            new AbstractMap.SimpleEntry<>("UGC", CYSTEINE),
            new AbstractMap.SimpleEntry<>("UGG", TRYPTOPHAN)
    );

    Set<String> rnaStopSequences = Set.of("UAA", "UAG", "UGA");

    List<String> translate(String rnaSequence) {
        var pattern = Pattern.compile("([A-Z]){3}");
        var matcher = pattern.matcher(rnaSequence);
        var proteins = new ArrayList<String>();

        while (matcher.find()) {
            String codon = matcher.group();
            if (rnaStopSequences.contains(codon)) {
                break;
            }
            proteins.add(rnaProteinMap.get(codon));
        }

        return proteins;
    }
}
