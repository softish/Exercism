class ReverseString {

    String reverse(String inputString) {
        return reverse(inputString, 0, "");
    }

    private String reverse(String inputString, int index, String reverseString) {
        if (index == inputString.length()) {
            return reverseString;
        }

        return reverse(inputString, index + 1, inputString.charAt(index) + reverseString);
    }
}
