class ResistorColorDuo {

    int value(String[] colors) {
        StringBuilder resistanceValue = new StringBuilder();
        for (int i = 0; i < Math.min(colors.length, 2); i++) {
            int colorCode = colorCode(colors[i]);
            if (colorCode != Integer.MAX_VALUE) {
                resistanceValue.append(colorCode);
            }
        }
        return Integer.parseInt(resistanceValue.toString());
    }

    int colorCode(String color) {
        String[] colors = colors();
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].equals(color)) {
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

    String[] colors() {
        return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}
