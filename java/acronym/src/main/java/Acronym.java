import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class contains the logic for converting strings to acronyms.
 */
class Acronym {

    private String phrase;

    /**
     * Creates an instance of this class.
     *
     * @param phrase the phrase to manipulate
     */
    Acronym(String phrase) {
        this.phrase = phrase;
    }

    /**
     * Converts the phrase provided at instantiation to an acronym.
     *
     * @return the acronym
     */
    String get() {
        return createAcronymFromUppercaseLetters(prepare(phrase));
    }

    private String prepare(String stringToMatch) {
        if(phrase.contains(":")) {
            String[] substring = phrase.split(":");
            stringToMatch = substring[0];
        } else {
            stringToMatch = convertThreeLetterAcronymToLetter(stringToMatch);
        }

        stringToMatch = stringToMatch.replaceAll("-", " ");
        stringToMatch = convertInitialLowerCaseLetters(stringToMatch);

        return stringToMatch;
    }

    private String convertThreeLetterAcronymToLetter(String string) {
        Pattern pattern = Pattern.compile("([A-Z]{3})");
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            string = string.replace(matcher.group(), Character.toString(matcher.group().charAt(0)));
        }

        return string;
    }

    private String convertInitialLowerCaseLetters(String stringToMatch) {
        Pattern pattern = Pattern.compile("(\\s[a-z])");
        Matcher matcher = pattern.matcher(stringToMatch);

        while (matcher.find()) {
            String currentMatch = matcher.group();
            String replacement = currentMatch.replaceAll(" ", "").toUpperCase();
            stringToMatch = stringToMatch.replace(currentMatch, replacement);
        }
        return stringToMatch;
    }

    private String createAcronymFromUppercaseLetters(String stringToMatch) {
        Pattern pattern = Pattern.compile("([A-Z])");
        Matcher matcher = pattern.matcher(stringToMatch);
        StringBuilder stringBuilder = new StringBuilder();

        while (matcher.find()) {
            String currentMatch = matcher.group();
            stringBuilder.append(currentMatch);
        }

        return stringBuilder.toString();
    }

}