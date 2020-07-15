import java.util.ArrayDeque;
import java.util.Deque;

class ReverseString {

    String reverse(String inputString) {
        Deque<Character> inputCharacters = new ArrayDeque<>();
        for(Character character : inputString.toCharArray()) {
            inputCharacters.push(character);
        }

        StringBuilder reversedCharacters = new StringBuilder();
        while (!inputCharacters.isEmpty()) {
            reversedCharacters.append(inputCharacters.pop());
        }

        return reversedCharacters.toString();
    }
}
