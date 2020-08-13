class ReverseString {

    /**
     * inspired by <a href="https://www.baeldung.com/java-invert-array#using-a-traditional-for-loop">Baeldung</a>
     */
    String reverse(String inputString) {
        char[] chars = inputString.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char tmp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = tmp;
        }
        return String.valueOf(chars);
    }
}
