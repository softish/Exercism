class SpaceAge {

    private static double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return convertAge(new Earth());
    }

    double onMercury() {
        return convertAge(new Mercury());
    }

    double onVenus() {
        return convertAge(new Venus());
    }

    double onMars() {
        return convertAge(new Mars());
    }

    double onJupiter() {
        return convertAge(new Jupiter());
    }

    double onSaturn() {
        return convertAge(new Saturn());
    }

    double onUranus() {
        return convertAge(new Uranus());
    }

    double onNeptune() {
        return convertAge(new Neptune());
    }

    private double convertAge(Planet planet) {
        return planet.calculate(seconds);
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

class ConversionHelperEarth {
    private static final int ORBITAL_PERIOD_EARTH = 31557600;

    static double convert(double seconds, double orbitalRatio) {
        return seconds / (ORBITAL_PERIOD_EARTH * orbitalRatio);
    }
}

abstract class Planet {
    public double calculate(double seconds) {
        return ConversionHelperEarth.convert(seconds, getOrbitalRatio());
    }

    abstract double getOrbitalRatio();
}

class Mercury extends Planet {
    @Override
    public double getOrbitalRatio() {
        return OrbitalRatio.MERCURY;
    }
}

class Venus extends Planet {
    @Override
    public double getOrbitalRatio() {
        return OrbitalRatio.VENUS;
    }
}

class Earth extends Planet {
    @Override
    public double getOrbitalRatio() {
        return OrbitalRatio.EARTH;
    }
}

class Mars extends Planet {
    @Override
    public double getOrbitalRatio() {
        return OrbitalRatio.MARS;
    }
}

class Jupiter extends Planet {
    @Override
    public double getOrbitalRatio() {
        return OrbitalRatio.JUPITER;
    }
}

class Saturn extends Planet {
    @Override
    public double getOrbitalRatio() {
        return OrbitalRatio.SATURN;
    }
}

class Uranus extends Planet {
    @Override
    public double getOrbitalRatio() {
        return OrbitalRatio.URANUS;
    }
}

class Neptune extends Planet {
    @Override
    public double getOrbitalRatio() {
        return OrbitalRatio.NEPTUNE;
    }
}