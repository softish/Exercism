import java.util.ArrayDeque;
import java.util.Deque;

class ReverseString {

    String reverse(String inputString) {
        Stack<Character> inputCharacters = new Stack<>();
        for (Character character : inputString.toCharArray()) {
            inputCharacters.push(character);
        }

        StringBuilder reversedCharacters = new StringBuilder();
        while (!inputCharacters.isEmpty()) {
            reversedCharacters.append(inputCharacters.pop());
        }

        return reversedCharacters.toString();
    }
}

class Stack<E> {

    private final Deque<E> elements;

    public Stack() {
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
