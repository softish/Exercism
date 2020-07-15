class SpaceAge {

    private static final int ORBITAL_PERIOD = 31557600;
    private static double seconds;

    private enum Planets {
        MERCURY,
        VENUS,
        EARTH,
        MARS,
        JUPITER,
        SATURN,
        URANUS,
        NEPTUNE
    }

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return ageConversion(Planets.EARTH);
    }

    double onMercury() {
        return ageConversion(Planets.MERCURY);
    }

    double onVenus() {
        return ageConversion(Planets.VENUS);
    }

    double onMars() {
        return ageConversion(Planets.MARS);
    }

    double onJupiter() {
        return ageConversion(Planets.JUPITER);
    }

    double onSaturn() {
        return ageConversion(Planets.SATURN);
    }

    double onUranus() {
        return ageConversion(Planets.URANUS);
    }

    double onNeptune() {
        return ageConversion(Planets.NEPTUNE);
    }

    private double ageConversion(Planets planet) {
        double value;
        switch (planet) {
            case MERCURY:
                value = performConversion(OrbitalRatio.MERCURY);
                break;
            case VENUS:
                value = performConversion(OrbitalRatio.VENUS);
                break;
            case EARTH:
                value = performConversion(OrbitalRatio.EARTH);
                break;
            case MARS:
                value = performConversion(OrbitalRatio.MARS);
                break;
            case JUPITER:
                value = performConversion(OrbitalRatio.JUPITER);
                break;
            case SATURN:
                value = performConversion(OrbitalRatio.SATURN);
                break;
            case URANUS:
                value = performConversion(OrbitalRatio.URANUS);
                break;
            case NEPTUNE:
                value = performConversion(OrbitalRatio.NEPTUNE);
                break;
            default:
                value = 0;
        }

        return value;
    }

    private double performConversion(double orbitalRatio) {
        return seconds / (ORBITAL_PERIOD * orbitalRatio);
    }
}

interface OrbitalRatio {
    double MERCURY = 0.2408467;
    double VENUS = 0.61519726;
    double EARTH = 1;
    double MARS = 1.8808158;
    double JUPITER = 11.862615;
    double SATURN = 29.447498;
    double URANUS = 84.016846;
    double NEPTUNE = 164.79132;
}