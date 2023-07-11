package summer;

import summer.Points.Point;

public class Graph {

    public static void createPoints() {
        Point p1 = new Graphpoint(2, 3);
        Point p2 = new Graphpoint(-1, 5);
        Point p3 = new Graphpoint(-4, -2);

        System.out.println("Point 1: x = " + p1.getX() + ", y = " + p1.getY() + ", quadrant = " + p1.getQuadrant());
        System.out.println("Point 2: x = " + p2.getX() + ", y = " + p2.getY() + ", quadrant = " + p2.getQuadrant());
        System.out.println("Point 3: x = " + p3.getX() + ", y = " + p3.getY() + ", quadrant = " + p3.getQuadrant());
    }

    public static double calculateDistance(Point p1, Point p2) {
        int xDiff = p2.getX() - p1.getX();
        int yDiff = p2.getY() - p1.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public static void main(String[] args) {
        createPoints();

        Point p1 = new Graphpoint(2, 3);
        Point p2 = new Graphpoint(-1, 5);

        double distance = calculateDistance(p1, p2);
        System.out.println("Distance between p1 and p2: " + distance);
    }
}