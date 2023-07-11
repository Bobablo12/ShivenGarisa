package summers;

import summer.Point;

public class Graphpoint extends Point {
    public Graphpoint(int x, int y) {
        super(x, y);
    }

    protected static double calculateDistance(Point p1, Point p2) {
        double xDiff = p2.getX() - p1.getX();
        double yDiff = p2.getY() - p1.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}