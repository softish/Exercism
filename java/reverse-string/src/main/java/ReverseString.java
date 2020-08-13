class ReverseString {

    String reverse(String inputString) {
        return new StringBuilder()
                .append(inputString)
                .reverse()
                .toString();
    }
}
