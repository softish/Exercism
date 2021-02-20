import java.awt.geom.Point2D;
import java.util.Comparator;
import java.util.List;

class Darts {

    private final Point2D.Double position;

    Darts(double x, double y) {
        position = new Point2D.Double(x, y);
    }

    int score() {
        return new Target().getScore(this);
    }

    Point2D.Double getPosition() {
        return position;
    }
}

class Target {

    private static final List<Circle> circles = List.of(
            new Circle(1, 10),
            new Circle(5, 5),
            new Circle(10, 1)
    );

    int getScore(Darts darts) {
        return circles.stream()
                .filter(circle -> circle.withinCircle(darts.getPosition()))
                .max(Comparator.comparing(Circle::getPoints))
                .orElse(new Circle(11, 0)).getPoints();
    }
}

class Circle {

    private final Point2D.Double circlePosition = new Point2D.Double(0, 0);

    private final int radius;
    private final int points;

    Circle(int radius, int points) {
        this.radius = radius;
        this.points = points;
    }

    boolean withinCircle(Point2D.Double dartPosition) {
        return dartPosition.distance(circlePosition) <= radius;
    }

    int getPoints() {
        return points;
    }
}