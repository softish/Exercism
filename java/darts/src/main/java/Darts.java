import java.util.Comparator;
import java.util.List;

class Darts {

    private final double x;
    private final double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        return new Target().getScore(this);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Target {
    private static final Circle inner = new Circle(1, 10);
    private static final Circle middle = new Circle(5, 5);
    private static final Circle outer = new Circle(10, 1);
    private static final List<Circle> circles = List.of(inner, middle, outer);
    private static final Circle outsideTarget = new Circle(11, 0);

    int getScore(Darts darts) {
        return circles.stream()
                .filter(circle -> circle.withinCircle(darts.getX(), darts.getY()))
                .max(Comparator.comparing(Circle::getPoints))
                .orElse(outsideTarget).getPoints();
    }
}

class Circle {

    private static final int ORIGIN = 0;

    private final int radius;
    private final int points;

    public Circle(int radius, int points) {
        this.radius = radius;
        this.points = points;
    }

    boolean withinCircle(double x, double y) {
        return distance(x, y) <= radius;
    }

    private double distance(double x, double y) {
        return Math.sqrt(deltaX(x) + deltaY(y));
    }

    private double deltaY(double y) {
        return Math.pow(ORIGIN - y, 2);
    }

    double deltaX(double x) {
        return Math.pow(ORIGIN - x, 2);
    }

    int getPoints() {
        return points;
    }
}