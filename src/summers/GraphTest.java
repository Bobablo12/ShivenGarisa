package summers;

import summer.Graphpoint;
import summer.Point;

import static org.junit.Assert.*;
import org.junit.*;

public class GraphTest {

    @Test
    public void testCreatePoints() {
        Point p1 = new Graphpoint(2, 3);
        Point p2 = new Graphpoint(-1, 5);
        Point p3 = new Graphpoint(-4, -2);

        assertEquals(2, p1.getX(), 0);
        assertEquals(3, p1.getY(), 0);
        assertEquals(1, p1.getQuadrant());

        assertEquals(-1, p2.getX(), 0);
        assertEquals(5, p2.getY(), 0);
        assertEquals(2, p2.getQuadrant());

        assertEquals(-4, p3.getX(), 0);
        assertEquals(-2, p3.getY(), 0);
        assertEquals(3, p3.getQuadrant());
    }

    @Test
    public void testCalculateDistance() {
        Point p1 = new Graphpoint(2, 3);
        Point p2 = new Graphpoint(-1, 5);

        double distance = calculateDistance(p1, p2);
        assertEquals(3.605551275464, distance, 0.00001);
    }

    private static double calculateDistance(Point p1, Point p2) {
        double xDiff = p2.getX() - p1.getX();
        double yDiff = p2.getY() - p1.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}