import java.util.HashMap;
import java.util.Map;

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

        for(Map.Entry<Integer, String> entry : raindropsMap.entrySet()) {
            checkFactors(number, entry.getKey(), stringBuilder);
        }

        return stringBuilder.length() == 0 ? Integer.toString(number) : stringBuilder.toString();
    }

    private void checkFactors(int number, int factor, StringBuilder stringBuilder) {
        if (number % factor == 0) {
            stringBuilder.append(raindropsMap.get(factor));
        }
    }

}