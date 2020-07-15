import java.util.Arrays;
import java.util.List;

class Scrabble {

    private String word;

    private List<Character> one;
    private List<Character> two;
    private List<Character> three;
    private List<Character> four;
    private List<Character> five;
    private List<Character> eight;
    private List<Character> ten;

    Scrabble(String word) {
        this.word = word;
        one = Arrays.asList('A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T');
        two = Arrays.asList('D', 'G');
        three = Arrays.asList('B', 'C', 'M', 'P');
        four = Arrays.asList('F', 'H', 'V', 'W', 'Y');
        five = Arrays.asList('K');
        eight = Arrays.asList('J', 'X');
        ten = Arrays.asList('Q', 'Z');
    }

    int getScore() {
        int score = 0;

        for(char c : word.toUpperCase().toCharArray()) {
            if(one.contains(c)) {
                score++;
            } else if(two.contains(c)) {
                score += 2;
            } else if(three.contains(c)) {
                score += 3;
            } else if(four.contains(c)) {
                score += 4;
            } else if(five.contains(c)) {
                score += 5;
            } else if(eight.contains(c)) {
                score += 8;
            } else if(ten.contains(c)) {
                score += 10;
            }
        }

        return score;
    }

}