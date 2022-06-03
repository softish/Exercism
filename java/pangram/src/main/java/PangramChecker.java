import java.util.ArrayList;
import java.util.List;

public class PangramChecker {

    private static final int ASCII_FIRST_LETTER = 97;
    private static final int LETTERS_IN_ENGLISH_ALPHABET = 26;

    private final List<String> alphabet;

    public PangramChecker() {
        alphabet = new ArrayList<>();
        prepare();
    }

    /**
     * Checks whether the supplied text is a pangram.
     *
     * @param input the text to check
     * @return true if it is a pangram
     */
    public boolean isPangram(String input) {
        for (int i = 0; i < input.length(); i++) {
            String letter = input.substring(i, i + 1).toLowerCase();
            alphabet.remove(letter);
        }

        return alphabet.isEmpty();
    }

    /**
     * Generates the alphabet data structure which keeps track of used letters.
     */
    private void prepare() {
        for (int i = 0; i < LETTERS_IN_ENGLISH_ALPHABET; i++) {
            alphabet.add(Character.toString((char) (ASCII_FIRST_LETTER + i)));
        }
    }
}