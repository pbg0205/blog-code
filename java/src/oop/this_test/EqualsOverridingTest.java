package oop.this_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EqualsOverridingTest {
    public static void main(String[] args) {
        Map<Point, Integer> map = new HashMap<>();
        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 4);

        map.put(p1,1);
        map.put(p2,1);

        for (Map.Entry<Point, Integer> pointEntry : map.entrySet()) {
            System.out.println(pointEntry.getKey().toString());
        }
    }
}

class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (!(o instanceof Point)){
            return false;
        }

        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}