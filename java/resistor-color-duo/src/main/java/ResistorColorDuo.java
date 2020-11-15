import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.entry;

class ResistorColorDuo {

    private static final int MAX_LENGTH = 2;
    private final Map<String, Integer> colorCodes;

    public ResistorColorDuo() {
        colorCodes = Map.ofEntries(
                entry("black", 0),
                entry("brown", 1),
                entry("red", 2),
                entry("orange", 3),
                entry("yellow", 4),
                entry("green", 5),
                entry("blue", 6),
                entry("violet", 7),
                entry("grey", 8),
                entry("white", 9));
    }

    int value(String[] colors) {
        return Integer.parseInt(Arrays.stream(colors)
                .limit(MAX_LENGTH)
                .map(colorCodes::get)
                .map(String::valueOf)
                .collect(Collectors.joining()));
    }
}
