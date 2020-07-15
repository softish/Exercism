import java.util.HashMap;

class RaindropConverter {

    private static final HashMap<Integer, String> raindropsMap = new HashMap<>();

    static {
        putRaindrops(3, "Pling");
        putRaindrops(5, "Plang");
        putRaindrops(7, "Plong");
    }

    private static void putRaindrops(int factor, String sound) {
        raindropsMap.put(factor, sound);
    }

    String convert(int number) {

        StringBuilder stringBuilder = new StringBuilder();

        if (number % 3 == 0) {
            stringBuilder.append(raindropsMap.get(3));
        }
        if (number % 5 == 0) {
            stringBuilder.append(raindropsMap.get(5));
        }
        if (number % 7 == 0) {
            stringBuilder.append(raindropsMap.get(7));
        }

        if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
            stringBuilder.append(number);
        }

        return stringBuilder.toString();
    }

}