import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.reverse;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {

        List<Signal> result = new ArrayList<>();
        String binaryString = Integer.toBinaryString(number);
        binaryString = new StringBuilder(binaryString).reverse().toString();
        Signal[] signals = Signal.values();

        for (int i = 0; i < binaryString.length(); i++) {
            if (i < 4 && binaryString.substring(i, i + 1).equals("1")) {
                result.add(signals[i]);
            } else {
                reverse(result);
            }
        }

        return result;
    }
}