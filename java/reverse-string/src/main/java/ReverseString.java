class ReverseString {

    private static final int BEGINNING = 0;
    private static final int ONE_BASED_INDEX = 1;
    private static final int HALF = 2;

    /**
     * Inspired by <a href="https://www.baeldung.com/java-invert-array#using-a-traditional-for-loop">Baeldung</a>
     */
    String reverse(String inputString) {
        char[] chars = inputString.toCharArray();
        for (int i = BEGINNING; i < chars.length / HALF; i++) {
            char tmp = chars[i];
            chars[i] = chars[getZeroBasedIndexLength(chars) - i];
            chars[getZeroBasedIndexLength(chars) - i] = tmp;
        }
        return String.valueOf(chars);
    }

    private int getZeroBasedIndexLength(char[] chars) {
        return chars.length - ONE_BASED_INDEX;
    }
}
