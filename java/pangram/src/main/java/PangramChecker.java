import java.util.ArrayList;
import java.util.List;

public class PangramChecker {

    List<String> alphabet;

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
            String substring = input.substring(i, i + 1).toLowerCase();
            if(alphabet.contains(substring)) {
                alphabet.remove(substring);
            }
        }

        if(alphabet.isEmpty()) {
            return true;
        }

        return false;
    }

    /**
     * Generates the alphabet data structure which keeps track of used letters.
     */
    private void prepare() {
        int ascii = 97;
        for (int i = 0; i < 26; i++) {
            alphabet.add(Character.toString((char) (ascii + i)));
        }
    }
}