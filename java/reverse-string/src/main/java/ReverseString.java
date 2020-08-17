import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

class ReverseString {

    String reverse(String inputString) {
        SimpleStack<Character> inputCharacters = new SimpleStack<>();
        for (Character character : inputString.toCharArray()) {
            inputCharacters.push(character);
        }

        List<Character> reversedString = new ArrayList<>();
        while (!inputCharacters.isEmpty()) {
            reversedString.add(inputCharacters.pop());
        }

        return reversedString.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}

/**
 * Facade for non-synchronized java collections stack implementation.
 */
class SimpleStack<E> {

    private final Deque<E> elements;

    public SimpleStack() {
        elements = new ArrayDeque<>();
    }

    public void push(E element) {
        elements.push(element);
    }

    public E pop() {
        return elements.pop();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
