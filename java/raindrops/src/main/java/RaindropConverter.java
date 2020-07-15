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

        checkFactors(number, 3, stringBuilder);
        checkFactors(number, 5, stringBuilder);
        checkFactors(number, 7, stringBuilder);

        if(stringBuilder.length() == 0) {
            stringBuilder.append(number);
        }

        return stringBuilder.toString();
    }

    private void checkFactors(int number, int factor, StringBuilder stringBuilder) {
        if (number % factor == 0) {
            stringBuilder.append(raindropsMap.get(factor));
        }
    }

}