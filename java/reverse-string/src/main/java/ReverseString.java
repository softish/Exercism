class ReverseString {

    String reverse(String inputString) {
        char[] input = inputString.toCharArray();
        char[] reversed = new char[input.length];
        for (int inputPos = 0, reversedPos = input.length - 1; inputPos < input.length; inputPos++, reversedPos--) {
            reversed[reversedPos] = input[inputPos];
        }
        return String.valueOf(reversed);
    }
}
