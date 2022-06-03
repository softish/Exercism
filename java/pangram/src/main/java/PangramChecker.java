import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PangramChecker {

    private static final int ASCII_FIRST_LOWERCASE_LETTER = 97;
    private static final int LETTERS_IN_ENGLISH_ALPHABET = 26;

    private List<String> alphabet;

    public PangramChecker() {
        generateAlphabet();
    }

    /**
     * Checks whether the supplied text is a pangram.
     *
     * @param input the text to check
     * @return true if it is a pangram
     */
    public boolean isPangram(String input) {
        var candidateLetters = input.chars()
                .mapToObj(letter -> Character.toString((char) letter))
                .map(String::toLowerCase)
                .distinct()
                .collect(Collectors.toList());

        return alphabet.stream()
                .allMatch(letter -> candidateLetters.stream()
                        .anyMatch(candidate -> candidate.equals(letter)));
    }

    /**
     * Generates the alphabet data structure which keeps track of used letters.
     */
    private void generateAlphabet() {
        alphabet = IntStream.range(ASCII_FIRST_LOWERCASE_LETTER, ASCII_FIRST_LOWERCASE_LETTER + LETTERS_IN_ENGLISH_ALPHABET)
                .mapToObj(letter -> Character.toString((char) letter))
                .collect(Collectors.toList());
    }
}